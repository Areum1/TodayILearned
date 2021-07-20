#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
void draw_check01(int column, int row);

int main() {
	int column, row;
	printf("< 바둑판 그리기 >\n\n");
	printf("가로와 세로의 길이를 space로\n");
	printf("분리하여 입력하고 Enter : ");
	scanf("%d %d", &column, &row);
	draw_check01(column, row);
	return 0;
}
void draw_check01(int column, int row) {
	int i, j;
	unsigned char a = 0xa6;
	unsigned char b[12];
	for (i = 1; i < 12; i++) {
		b[i] = 0xa0 + i;
	}

	printf("%c%c ", a, b[3]);
	for (i = 1; i < column; i++) {
		printf("%c%c ", a, b[8]);
	}
	printf("%c%c", a, b[4]);
	printf("\n");
	for (i = 1; i < row; i++) {
		printf("%c%c ", a, b[7]);
		for (j = 1; j < column; j++) {
			printf("%c%c ", a, b[11]);
		}
		printf("%c%c", a, b[9]);
		printf("\n");
	}
	printf("%c%c ", a, b[6]);
	for (i = 1; i < column; i++) {
		printf("%c%c ", a, b[10]);
	}
	printf("%c%c", a, b[5]);
	printf("\n");
}