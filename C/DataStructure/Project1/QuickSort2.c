#include <stdio.h>

void quicksort(int a[], int left, int right) {
	int pivot = a[left], i = left, j = right, temp;
	if (left < right) {
		while (i < j) {
			while (pivot <= a[i] && i < right) i++;
			while (pivot >= a[j] && j > left) j--;
			if (i < j) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		a[left] = a[j];
		a[j] = pivot;
		quicksort(a, left, j-1);
		quicksort(a, j+1, right);
	}
}

int main(void) {
	int a[] = { 9,10,99,48,95,29,54,23,64,72,32 };
	int n = sizeof(a) / sizeof(int);

	printf("정렬 전 : ");
	for (int i = 0; i < n; i++)
		printf("%5d ", a[i]);

	printf("\n");
	quicksort(a, 0, n - 1);

	printf("정렬 후 : ");
	for (int i = 0; i < n; i++)
		printf("%5d ", a[i]);
	return 0;
}