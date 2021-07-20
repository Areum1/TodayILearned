#include <stdio.h>
#include <stdlib.h>

void RadixSort(int a[], int n) {
	int *bucket = (int *)malloc(sizeof(int)*n);
	int digit_cnt[10] = { 0 }, max = a[0], digit_base = 1, i;
	for (i = 0; i < n; i++)
		if (a[i] > max) max = a[i];

	while (digit_base <= max) {
		for (i = 0; i < n; i++)
			digit_cnt[a[i] / digit_base % 10]++;
		for (i = 1; i < 10; i++)
			digit_cnt[i] += digit_cnt[i - 1];
		for (i = n - 1; i >= 0; i--)
			bucket[--digit_cnt[a[i] / digit_base % 10]] = a[i];
		for (i = 0; i < n; i++)
			a[i] = bucket[i];
		for (i = 0; i < 10; i++)
			digit_cnt[i] = 0;

		digit_base *= 10;
	}
	free(bucket);
}

int main() {
	int a[] = { 10, 258, 125, 3684, 50, 15, 654, 85478, 300, 525, 67 };
	int i, n;
	n = sizeof(a) / sizeof(int);
	printf("정렬 전 : ");
	for (i = 0; i < n; i++) printf("%6d ", a[i]);
	RadixSort(a, n);
	printf("\n정렬 후 : ");
	for (i = 0; i < n; i++) printf("%6d ", a[i]);
	printf("\n");
	return 0;

}