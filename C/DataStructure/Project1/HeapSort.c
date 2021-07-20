#include <stdio.h>
#include <limits.h>

void HeapSort(int a[], int n) {
	int i, parent, child, value, m = n;

	for (i = n / 2; i >= 1; i--) {
		value = a[i];
		parent = i;
		while ((child = parent * 2) <= n) {
			if (child + 1 <= n && a[child + 1])child++;
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
			if (child + 1 <= n && a[child + 1])child++;
			if (value >= a[child]) break;
			a[parent] = a[child];
			parent = child;
		}
		a[parent] = value;
		for (i = 1; i <= m; i++)
			printf("   %d", a[i]);
		printf("\n");
	}
}

int main(void) {
	int a[] = { INT_MIN, 56,7,8,10,39,21,18,28,20,67,2,4};
	int n = sizeof(a) / sizeof(int);
	int i;
	HeapSort(a, n - 1);
	printf("ÈüÁ¤·Ä : ");
	for (i = 1; i < n; i++) printf("   %d", a[i]);

	return 0;
}