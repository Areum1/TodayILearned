#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
void draw_check01(int column, int row);

int main() {
	int column, row;
	printf("< Ȯ��� �ٵ��� �׸��� >\n\n");
	printf("���ο� ������ ���̸� space��\n");
	printf("�и��Ͽ� �Է��ϰ� Enter : ");
	scanf("%d %d", &column, &row);
	draw_check01(column, row);
	return 0;
}
void draw_check01(int column, int row) {
	int i, j, z;
	unsigned char a = 0xa6;
	unsigned char b[12];
	for (i = 1; i < 12; i++) {
		b[i] = 0xa0 + i;
	}

	printf("%c%c ", a, b[3]);
	for (i = 1; i < column; i++) {
		printf("%c%c ", a, b[1]);
		printf("%c%c ", a, b[8]);
	}
	printf("%c%c ", a, b[1]);
	printf("%c%c ", a, b[4]);
	printf("\n");
	for (z = 0; z < column; z++) {
		printf("%c%c ", a, b[2]);
		printf("  ");
	}
	printf("%c%c ", a, b[2]);
	printf("\n");
	for (i = 1; i < row; i++) {
		printf("%c%c ", a, b[7]);
		printf("%c%c ", a, b[1]);
		for (j = 1; j < column; j++) {
			printf("%c%c ", a, b[11]);
			printf("%c%c ", a, b[1]);
		}
		printf("%c%c", a, b[9]);
		printf("\n");
		for (z = 0; z < column; z++) {
			printf("%c%c ", a, b[2]);
			printf("  ");
		}
		printf("%c%c ", a, b[2]);
		printf("\n");
	}
	printf("%c%c ", a, b[6]);
	for (i = 1; i < column; i++) {
		printf("%c%c ", a, b[1]);
		printf("%c%c ", a, b[10]);
	}
	printf("%c%c ", a, b[1]);
	printf("%c%c ", a, b[5]);
	printf("\n");
}