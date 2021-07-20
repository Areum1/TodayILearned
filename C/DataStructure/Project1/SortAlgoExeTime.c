#include <stdio.h>
#include <math.h>
#include <time.h>
#include <stdlib.h>
#include <windows.h>

typedef unsigned __int64 pclock_t;

pclock_t  __declspec(naked) pclock(void) {
	//__declspec(naked) 옵션은 함수호출에 의한 오버헤드를 줄임
	__asm {  //어셈블리어 시작
		rdtsc  //CPU clock counter를 64bit에 보관
		ret	//ESP(Stack Pointer)의 값을 EIP(Instruction Pointer)로 이동
			   //즉, 함수종료. return에 해당
	}  //어셈블리어 끝
}

long long Get_CPU_Clock() {

	//__int64 i1, i2;
	long long i1, i2;

	int *lsb = ((int *)&i1);
	int *msb = ((int *)&i1) + 1;

	__asm {
		rdtsc //Read Time Stamp Counter
		mov ebx, lsb
		mov[ebx], eax //CPU Clock의 하위 32bit 저장
		mov ebx, msb
		mov[ebx], edx //CPU Clock의 상위 32bit 저장
	}

	Sleep(1000);//1초 지연 

	lsb = ((int*)&i2);
	msb = ((int*)&i2) + 1;

	__asm {
		rdtsc
		mov ebx, lsb
		mov[ebx], eax
		mov ebx, msb
		mov[ebx], edx
	}

	return i2 - i1;
}

void SelectionSort(int a[], int n) {
	int i, j, min, index;

	for (i = 0; i < n - 1; i++) {
		min = a[i];
		index = i;
		for (j = i + 1; j < n; j++) {
			if (a[j] < min) {
				min = a[j];
				index = j;
			}
		}
		a[index] = a[i];
		a[i] = min;
	}
}

void InsertionSort(int a[], int n) {
	int i, j, temp;
	for (i = 1; i < n; i++) {
		temp = a[i];
		for (j = i - 1; j >= 0; j--) {
			if (temp >= a[j]) break;
			a[j + 1] = a[j];
		}
		a[j + 1] = temp;
	}
}

void BubbleSort(int a[], int n) {
	int i = 0, j, temp, flag = 1;
	while (flag == 1) {
		flag = 0;
		i++;
		for (j = 0; j < n - i; j++) {
			if (a[j] > a[j + 1]) {
				temp = a[j]; a[j] = a[j + 1]; a[j + 1] = temp;
				flag = 1;
			}
		}
	}
}


void ShellSort(int a[], int n) {
	int i, j, t, temp;
	for (t = n / 2; t > 0; t /= 2) {
		for (i = t; i < n; i++) {
			temp = a[i];
			for (j = i; j >= t; j -= t) {
				if (temp >= a[j - t]) break;
				a[j] = a[j - t];
			}
			a[j] = temp;
		}
	}
}

void QuickSort(int a[], int left, int right) {
	int i, j, pivot, temp;

	if (left < right) {
		temp = a[left];
		a[left] = a[(left + right) / 2];
		a[(left + right) / 2] = temp;
		pivot = a[left];
		i = left;
		j = right;
		while (i < j) {
			while (i < right && a[i] <= pivot) i++;
			while (j > left && a[j] >= pivot) j--;
			if (i < j) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}

		a[left] = a[j];
		a[j] = pivot;

		QuickSort(a, left, i - 1);
		QuickSort(a, i + 1, right);
	}
}

void HeapSort(int a[], int n) {
	int i, parent, child, value, m = n;

	for (i = n / 2; i >= 1; i--) {
		value = a[i];
		parent = i;
		while ((child = parent * 2) <= n) {
			if (child + 1 <= n && a[child] < a[child + 1]) child++;
			if (value >= a[child]) break;
			a[parent] = a[child];
			parent = child;
		}
		a[parent] = value;
	}

	while (n > 1) {
		value = a[n];
		a[n--] = a[1];
		parent = 1;
		while ((child = parent * 2) <= n) {
			if (child + 1 <= n && a[child] < a[child + 1]) child++;
			if (value >= a[child]) break;
			a[parent] = a[child];
			parent = child;
		}
		a[parent] = value;
	}
}

void Merge(int a[], int left, int mid, int right) {
	int i = left, j = mid + 1, k = 0;
	int *bk = (int *)malloc(sizeof(int)*(right - left + 1));

	while (i <= mid && j <= right)
		if (a[i] <= a[j]) bk[k++] = a[i++];
		else bk[k++] = a[j++];
	if (i <= mid) while (i <= mid) bk[k++] = a[i++];
	else while (j <= right) bk[k++] = a[j++];
	k = 0;
	for (i = left; i <= right; i++) a[i] = bk[k++];
	free(bk);
}

void Division(int a[], int left, int right) {
	int mid;

	if (left < right) {
		mid = (left + right) / 2;
		Division(a, left, mid);
		Division(a, mid + 1, right);
		Merge(a, left, mid, right);
	}
}

void RadixSort(int *a, int n) {
	int i, max = a[0], digit_base = 1;
	int digit_cnt[10] = { 0 };
	int *bucket = (int *)malloc(sizeof(int) * n);

	for (i = 0; i < n; i++)
		if (a[i] > max) max = a[i];

	while (digit_base <= max) {
		for (i = 0; i < n; i++)
			digit_cnt[a[i] / digit_base % 10]++;
		for (i = 1; i < 10; i++)
			digit_cnt[i] += digit_cnt[i - 1];
		for (i = n - 1; i >= 0; i--)
			bucket[--digit_cnt[a[i] / digit_base % 10]] = a[i];
		for (i = 0; i < n; i++) a[i] = bucket[i];
		for (i = 0; i < 10; i++) digit_cnt[i] = 0;
		digit_base *= 10;
	}
	free(bucket);
}

int main(void) {
	int *a, *b, *c, *d, *e, *f, *g, *h;
	int i, n = 100000;
	long value;
	long long llg;
	pclock_t t1, t2;

	llg = Get_CPU_Clock();

	a = (int *)malloc(n * sizeof(int));
	b = (int *)malloc(n * sizeof(int));
	c = (int *)malloc(n * sizeof(int));
	d = (int *)malloc(n * sizeof(int));
	e = (int *)malloc(n * sizeof(int));
	f = (int *)malloc(n * sizeof(int));
	g = (int *)malloc(n * sizeof(int));
	h = (int *)malloc(n * sizeof(int));

	for (i = 0; i < n; i++) {
		value = rand() << rand() % 16;
		value = value | rand();
		a[i] = value;
		b[i] = a[i];
		c[i] = a[i];
		d[i] = a[i];
		e[i] = a[i];
		f[i] = a[i];
		g[i] = a[i];
		h[i] = a[i];
	}

	t1 = pclock();
	SelectionSort(a, n);
	t2 = pclock();
	printf("\n%d개 데이터 선택정렬 시간 : %.16lf초 소요\n", n, (double)(t2 - t1) / llg);
	//printf("%.16lf", (double)(t2 - t1) / llg);
	t1 = pclock();
	SelectionSort(a, n);
	t2 = pclock();
	printf("\n%d개 정렬된 데이터 선택정렬 시간 : %.16lf초 소요\n", n, (double)(t2 - t1) / llg);

	t1 = pclock();
	InsertionSort(b, n);
	t2 = pclock();
	printf("\n%d개 데이터 삽입정렬 시간 : %.16lf초 소요\n", n, (double)(t2 - t1) / llg);
	//printf(",%.16lf", (double)(t2 - t1) / llg);
	t1 = pclock();
	InsertionSort(b, n);
	t2 = pclock();
	printf("\n%d개 정렬된 데이터 삽입정렬 시간 : %.16lf초 소요\n", n, (double)(t2 - t1) / llg);

	t1 = pclock();
	BubbleSort(c, n);
	t2 = pclock();
	printf("\n%d개 데이터 버블정렬 시간 : %.16lf초 소요\n", n, (double)(t2 - t1) / llg);
	//printf(",%.16lf", (double)(t2 - t1) / llg);
	t1 = pclock();
	BubbleSort(c, n);
	t2 = pclock();
	printf("\n%d개 정렬된 데이터 버블정렬 시간 : %.16lf초 소요\n", n, (double)(t2 - t1) / llg);

	t1 = pclock();
	ShellSort(d, n);
	t2 = pclock();
	printf("\n%d개 데이터 쉘정렬 시간 : %.16lf초 소요\n", n, (double)(t2 - t1) / llg);
	//printf(",%.16lf", (double)(t2 - t1) / llg);
	t1 = pclock();
	ShellSort(d, n);
	t2 = pclock();
	printf("\n%d개 정렬된 데이터 쉘정렬 시간 : %.16lf초 소요\n", n, (double)(t2 - t1) / llg);

	t1 = pclock();
	QuickSort(e, 0, n - 1);
	t2 = pclock();
	printf("\n%d개 데이터 퀵정렬 시간 : %.16lf초 소요\n", n, (double)(t2 - t1) / llg);
	//printf(",%.16lf", (double)(t2 - t1) / llg);
	t1 = pclock();
	QuickSort(e, 0, n - 1);
	t2 = pclock();
	printf("\n%d개 정렬된 데이터 퀵정렬 시간 : %.16lf초 소요\n", n, (double)(t2 - t1) / llg);

	t1 = pclock();
	HeapSort(f, n - 1);
	t2 = pclock();
	printf("\n%d개 데이터 힙정렬 시간 : %.16lf초 소요\n", n, (double)(t2 - t1) / llg);
	//printf(",%.16lf", (double)(t2 - t1) / llg);
	t1 = pclock();
	HeapSort(f, n - 1);
	t2 = pclock();
	printf("\n%d개 정렬된 데이터 힙정렬 시간 : %.16lf초 소요\n", n, (double)(t2 - t1) / llg);

	t1 = pclock();
	Division(g, 0, n - 1);
	t2 = pclock();
	printf("\n%d개 데이터 병합정렬 시간 : %.16lf초 소요\n", n, (double)(t2 - t1) / llg);
	//printf(",%.16lf", (double)(t2 - t1) / llg);
	t1 = pclock();
	Division(g, 0, n - 1);
	t2 = pclock();
	printf("\n%d개 정렬된 데이터 병합정렬 시간 : %.16lf초 소요\n", n, (double)(t2 - t1) / llg);

	t1 = pclock();
	RadixSort(h, n);
	t2 = pclock();
	printf("\n%d개 데이터 기수정렬 시간 : %.16lf초 소요\n", n, (double)(t2 - t1) / llg);
	//printf(",%.16lf", (double)(t2 - t1) / llg);
	t1 = pclock();
	RadixSort(h, n);
	t2 = pclock();
	printf("\n%d개 정렬된 데이터 기수정렬 시간 : %.16lf초 소요\n", n, (double)(t2 - t1) / llg);

	free(a);
	free(b);
	free(c);
	free(d);
	free(e);
	free(f);
	free(g);
	free(h);

	return 0;
}