#include <stdio.h>

int fiboSearch(int a[], int key, int n) {
	int fibo[] = { 0,1,1,2,3,5,8,13,21,34,55,89 };
	int index = 0, pos, k = 0;
	while (fibo[k] < n)k++;
	while (k > 0) {
		pos = index + fibo[--k];

		if (pos >= n || key < a[pos]);
		else if (key > a[pos]) {
			index = pos;
			k--;
		}
		else return pos;
	}

	return -1;
}

int main(void) {
	int a[] = { 2,4,6,7,8,9,10,21,23,42,65,89,92,102,105,106,107 };
	int n = sizeof(a) / sizeof(int);
	int key, index;
	printf("찾을 값 : ");
	scanf_s("%d", &key);
	index = fiboSearch(a, key, n);
	if (index == -1) printf("없음");
	else printf("%d를 %d에서 찾음 \n", key, index);
	return 0;
}