#include <stdio.h>

int interpolation(int a[], int n, int key) {
	int left = 0, right = n - 1, index;
	while (left <= right) {
		if (a[left] < a[right]) {
			index = left + (right - left)* (key - a[left]) / (a[right] - a[left]);
			if (index > right) index = right;
			if (index < left) index = left;
		}
		else index = left;

		if (key == a[index]) return index;
		
		else if (key > a[index]) left = index + 1;
			else right = index - 1;
	}

	return -1;
}

int main(void) {
	int i, key, index, n;
	int a[] = { 3,7,10,12,14,18,21,33,35,48 };

	n = sizeof(a) / sizeof(int);
	printf("ã�� ��� : ");
	for (i = 0; i < n; i++)printf("%5d ", a[i]);
	printf("\n");

	printf("ã�� �� : ");
	scanf_s("%d", &key);
	index = interpolation(a, n, key);

	if (index < 0) printf("\nã���� �ϴ� ���� ����\n");
	else printf("\n%d�� %d���� ã��\n", key, index);
}