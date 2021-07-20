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
		quicksort(a, left, j - 1);
		quicksort(a, j + 1, right);
	}
}

int main(void) {
	int a[] = { 15,7,3,23,56,85,34,78,35,45 };
	int n = sizeof(a) / sizeof(int);

	quicksort(a, 0, n - 1);

	for (int i = 0; i < n; i++)
		printf("%5d ", a[i]);
}