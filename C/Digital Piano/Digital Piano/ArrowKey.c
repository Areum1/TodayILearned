#include <stdio.h>
#include <conio.h>
#include <windows.h>
#define X_MAX 79  //가로 (열)방향의 최대값
#define Y_MAX 24  //세로 (행)방향의 최대값
void move_arrow_key(char key, int *x, int *y, int x_m, int y_m);
void gotoxy(int x, int y);

int main(void) {
	char key;
	int x = 20, y = 3;
	do {
		gotoxy(x, y);
		printf("J");
		key = _getch();
		move_arrow_key(key, &x, &y, X_MAX, Y_MAX);
	} while (key != 27);
	return 0;
}
void gotoxy(int x, int y) {
	COORD Pos = { x - 1, y - 1 };
	SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE), Pos);
}
void move_arrow_key(char key, int *x, int *y, int x_m, int y_m) {
	switch (key) {
	case 72: *y=*y-1;//상
		if (*y<1) {
			*y = 1;
		}
		break;
	case 80: *y=*y+1;//하
		if (*y > y_m) {
			*y = y_m;
		}
		break;
	case 75: *x=*x-1;//좌
		if (*x < 1) {
			*x = 1;
		}
		break;
	case 77: *x=*x+1;//우
		if (*x > x_m) {
			*x = x_m;
		}
		break;
	default: return;
	}
}