#include <stdio.h>
#define R 3

int b[R];

void Com(void) {
	int i;
	for (i = 0; i < R; i++)
		printf("%5d", b[i]);
	printf("\n");
}

void Combination(int a[], int r, int n,int ii) {
	int i;
	if (r == R) Com();
	else for (i = ii+1; i < n; i++) {
		b[r] = a[i];
		Combination(a, r + 1, n,i);
	}
}

int main(void) {
	int a[] = { 1,2,3,4,5 };
	int n = sizeof(a) / sizeof(int);

	Combination(a, 0, n,-1);

	return 0;
}