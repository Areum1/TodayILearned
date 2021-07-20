#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <windows.h>
#include <conio.h>

void gotoxy(int x, int y) {
	COORD Pos = { x - 1, y - 1 };
	SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE), Pos);
}
void drwaw_rectangle(int c, int r) {
	unsigned char a = 0xa6;
	unsigned char b[7];
	for (int i = 1; i < 7; i++) {
		b[i] = 0xa0 + i;
	}

	printf("%c%c ", a, b[3]);
	for (int i = 0; i < c; i++) {
		printf("%c%c ", a, b[1]);
	}
	printf("%c%c\n", a, b[4]);

	for (int i = 0; i < r; i++) {
		printf("%c%c ", a, b[2]);
		for (int j = 0; j < c; j++) {
			printf("  ");
		}
		printf("%c%c\n", a, b[2]);
	}
	printf("%c%c ", a, b[6]);
	for (int i = 0; i < c; i++) {
		printf("%c%c ", a, b[1]);
	}
	printf("%c%c\n", a, b[5]);
}

void draw_vertical_slide(int x, int y, int length, char *s) {
	gotoxy(x, 1);
	drwaw_rectangle(1, length);
	gotoxy(x + 2, y + 1);
	printf("%s", s);
	gotoxy(x+6, length+1);
	printf("%2d", y);
}
void draw_horizontal_slide(int x, int y, int length, char *s) {
	gotoxy(1, y);
	drwaw_rectangle(length, 1);
	gotoxy(x + 2, y + 1);
	printf("%s", s);
	gotoxy(length* 2 + 4, y + 1);
	printf("%2d", x);
}
void move_arrow_key(char key, int *x, int *y, int x_m, int y_m) {
	switch (key) {
	case 72: *y = *y - 1;//상
		if (*y < 1) {
			*y = 1;
		}
		break;
	case 80: *y = *y + 1;//하
		if (*y > y_m) {
			*y = y_m;
		}
		break;
	case 75: *x = *x - 1;//좌
		if (*x < 1) {
			*x = 1;
		}
		break;
	case 77: *x = *x + 1;//우
		if (*x > x_m) {
			*x = x_m;
		}
		break;
	default: return;
	}
}
int main() {
	//int coloumn, row;
	char *slide = "■", key;
	int x = 1, y = 1; //x 가로의 초기값 y 세로의 초기값
	int h_slide_length, v_slide_length;

	printf("[ 슬라이드바 표시 ]\n");
	printf("수직 슬라이드바의 길이(최대 19)를\n");
	printf("입력하고 Enter : ");
	scanf("%d", &v_slide_length);
	printf("수평 슬라이드바의 길이(최대 70)를\n");
	printf("입력하고 Enter : ");
	scanf("%d", &h_slide_length);
	system("cls");
	do {
		draw_vertical_slide(1, y, v_slide_length, slide); //수직
		draw_horizontal_slide(x, v_slide_length+3, h_slide_length, slide); //수평
		key = _getch();	
		move_arrow_key(key, &x, &y, h_slide_length*2-1, v_slide_length);
			
		printf("\n\n");
	} while (key != 27);
	
	/*scanf("%d %d", &coloumn, &row);
	drwaw_rectangle(1, row);
	drwaw_rectangle(coloumn, 1);*/
	
}