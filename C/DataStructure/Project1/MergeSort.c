#include <stdio.h>
#include <stdlib.h>

int n;

void Marge(int a[], int left, int mid, int right) {
	int * result = (int*)malloc(sizeof(int) * (right - left + 1));
	int i = left, j = mid + 1, k = 0;

	while (i <= mid && j <= right)
		if (a[i] <= a[j]) result[k++] = a[i++];
		else result[k++] = a[j++];

	if (i <= mid) while (i <= mid)result[k++] = a[i++];
	else while (j <= right) result[k++] = a[j++];
	k = 0;

	for (i = left; i <= right; i++) {
		a[i] = result[k++];
	}
	free(result);
}

void Divide(int a[], int left, int right) {
	int mid;
	if (left < right) {
		mid = (left + right) / 2;
		Divide(a, left, mid);
		Divide(a, mid + 1, right);
		Marge(a, left, mid, right);
	}
}

int main() {
	int a[] = { 100,2,10,35,29,59,21,64,9,5,11,28 };
	int n = sizeof(a) / sizeof(int);
	int i;
	Divide(a, 0, n - 1);
	printf("병합정렬 : ");
	for (i = 0; i < n; i++) {
		printf("%5d", a[i]);
	}
	printf("\n");

	return 0;
}