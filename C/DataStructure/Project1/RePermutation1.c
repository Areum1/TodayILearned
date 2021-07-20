#include <stdio.h>
#define R 3

int b[R];

void Reper(void) {
	int i;
	for (i = 0; i < R; i++)
		printf("%5d", b[i]);
	printf("\n");
}

void RePermutation(int a[], int r, int n) {
	int i;
	if (r == R) Reper();
	else for (i = 0; i < n; i++) {
		b[r] = a[i];
		RePermutation(a, r + 1, n);
	}
}

int main(void) {
	int a[] = { 1,2,3,4,5 };
	int n = sizeof(a) / sizeof(int);

	RePermutation(a, 0, n);

	return 0;
}