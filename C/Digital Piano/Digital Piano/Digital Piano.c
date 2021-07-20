#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <windows.h>
#define column 8
#define row 2

void draw_check01(void);
void gotoxy(int x, int y);

int main() {
	printf("<<< DIGITAL PIANO >>>\n\n");
	printf("키보드의 숫자를 누르면 해당 건반에 음이 표시되고,\n");
	printf("해당 음이 스피커로 출력됨(프로그램 종료 BB: Esc 키)\n");
	draw_check01();
	char musicnote[][8]={"도", "레", "미", "파", "솔", "라", "시", "도"};
	int note = 6;
	for (int j = 0; j < 2; j++) {
		int num = 3;
		for (int i = 0; i < 8; i++) {
			gotoxy(num, note);	
			if (j == 0) {
				printf("%d", i+1);
			}
			else {
				printf("%s", musicnote[i]);
			}
			num += 4;
		}
		note += 2;
		printf("\n");
	}
	/*gotoxy(3, 6);	printf("JE");
	gotoxy(7, 6);	printf("33");
	gotoxy(7, 8);	printf("♥");
	gotoxy(1, row * 3 + 4); printf("*");*/
	return 0;
}
void draw_check01() {
	int i, j, z;
	unsigned char a = 0xa6;
	unsigned char b[12];
	for (i = 1; i < 12; i++) {
		b[i] = 0xa0 + i;
	}
	//키보드 찍기
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
void gotoxy(int x, int y) {
	COORD Pos = { x - 1, y - 1 };
	SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE), Pos);
}