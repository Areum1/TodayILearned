#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
void draw_square(int size, int size2);

int main() {
	int n, m;
	printf("< ���簢�� �׸��� >\n\n");
	printf("���ο� ������ ���̸� space��\n");
	printf("�и��Ͽ� �Է��ϰ� Enter : ");
	scanf("%d %d", &n, &m);
	draw_square(n, m);
	return 0;
}
void draw_square(int size, int size2) {
	int i, j;
	unsigned char a = 0xa6;
	unsigned char b[7];
	for (i = 1; i < 7; i++) {
		b[i] = 0xa0 + i;
	}

	printf("%c%c", a, b[3]);
	for (i = 0; i < size; i++) {
		printf("%c%c ", a, b[1]);
	}
	printf("%c%c", a, b[4]);
	printf("\n");
	for (i = 0; i < size2; i++) {
		printf("%c%c", a, b[2]);
		for (j = 0; j < size; j++) {
			printf("  ");
		}
		printf("%c%c", a, b[2]);
		printf("\n");
	}
	printf("%c%c", a, b[6]);
	for (i = 0; i < size; i++) {
		printf("%c%c ", a, b[1]);
	}
	printf("%c%c", a, b[5]);
	printf("\n");
}