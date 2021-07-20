#include <stdio.h>
#define R 3

int b[R];

void per(void) {
	int i;
	for (i = 0; i < R; i++)
		printf("%5d", b[i]);
	printf("\n");
}

void swap(int *p1, int *p2) {
	int temp = *p1;
	*p1 = *p2;
	*p2 = temp;
}

void Permutation(int a[], int r, int n) {
	int i;
	if (r == R) per();
	else for (i = r; i < n; i++) {
		swap(a+r, a+i);
		b[r] = a[r];
		Permutation(a, r + 1, n);
		swap(a + r, a+i);
	}
}

int main(void) {
	int a[] = { 1,2,3,4,5 };
	int n = sizeof(a) / sizeof(int);

	Permutation(a, 0, n);

	return 0;
}