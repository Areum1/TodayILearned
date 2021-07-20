#include <stdio.h>
#define R 3

//전역변수 선언
int b[R];

//함수 선언
void Combination(int  a[], int r, int n, int ii);
void Com();

void Com() {
	int i;
	for (i = 0; i < R; i++)
		printf("%5d", b[i]);
	printf("\n");
}

void ReCombination(int  a[], int r, int n, int ii) {
	int i;
	if (r == R) Com();
	else {
		for (i = ii; i < n; i++) {
			b[r] = a[i];
			ReCombination(a, r + 1, n, i);
		}
	}
}

int main(void) {
	int a[] = { 1,2,3,4,5 };
	int n = sizeof(a) / sizeof(int);

	ReCombination(a, 0, n,0);

	return 0;
}