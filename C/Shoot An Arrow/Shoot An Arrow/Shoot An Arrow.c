#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <time.h>
#include <windows.h>

void intro_game(void);
void display_text(int count, int r_count);
void game_control(int *r_c, int rnd, int rnd2, int count);
void horizontal_slide(int x, int y, char *c2);
void draw_rectangle(int c, int r);
void gotoxy(int x, int y);

int main() { 
	int count = 0, rnd, rnd2;
	int r_count = 0;
	char *target = "��";
	srand((unsigned int)time(NULL));
	intro_game();
	_getch();
	
	do {
		system("cls");
		draw_rectangle(20, 20);
		rnd = rand() % 35 + 4;
		rnd2 = rand() % 35 + 4;
		while (rnd == rnd2) {
			rnd2 = rand() % 35 + 4;
			if (rnd != rnd2) break;
		}
		gotoxy(rnd, 2);
		printf("%s", target);
		gotoxy(rnd2, 2);
		printf("%s", target);
		count=count+1;
		display_text(count, r_count);
		
		game_control(&r_count, rnd, rnd2, count);
		//count--;
	} while (count < 10);
	return 0;
}
void intro_game() {
	printf("<<< ��Ÿ�� ȭ���� ���� >>>\n\n");
	printf("���� Ÿ�� �̵��ϸ鼭\n");
	printf("��ǥ��(��)�� ���ߴ� ����!\n");
	printf("ȭ�� �߻� : �����̽� Ű\n\n");
	printf("������ �����Ϸ��� �ƹ�Ű�� �������� GO! \n");
}

void display_text(int count, int r_count) {
	//int c = 40, r = 25;
	//draw_rectangle(c, r);
	gotoxy(45, 2);
	printf("ȭ�� �߻�� �����̽� Ű!\n\n");
	gotoxy(45, 4);
	printf("�� ���� ���� Ƚ�� : 10ȸ\n\n");
	gotoxy(45, 6);
	printf("> Ƚ�� : %d\n", count);
	gotoxy(45, 8);
	printf("> ���� : %d", r_count);
	gotoxy(45, 22);
	//_getch();
}
void draw_rectangle(int c, int r) {
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
void gotoxy(int x, int y) {
	COORD Pos = { x - 1, y - 1 };
	SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE), Pos);
}
void game_control(int *r_c, int rnd, int rnd2, int count) {
	int i = 1, k = 1, y;
	char *horse = "��", chr;

	do {
		i += k;
		if (i > 39) {
			k = -1;
		}
		else if (i < 3) {
			k = +1;
		}
		horizontal_slide(i+1, 21, horse);
		
	} while (!_kbhit());

	chr = _getch();
	y = 21;
	if (chr == 32) {
		while (y > 2) {
			gotoxy(i, y);
			printf("��");
			Sleep(50);
			printf("\b\b ");
			y--;
		}
		if ((rnd - 1 <= i) && (i <= (rnd))) {
			gotoxy(rnd - 1, 2);
			printf("��");
			gotoxy(50, 13);
			printf("����!");
			Sleep(50);
			*r_c = *r_c + 1;
		}

		if ((rnd2 - 1 <= i) && (i <= (rnd2))) {
			gotoxy(rnd - 1, 2);
			printf("?");
			gotoxy(50, 13);
			printf("����ũ");
		}
		gotoxy(50, 21);
		printf("�ƹ� Ű�� ������ ���� ����");
		_getch();
		_getch();
		count--;
	}			
	//������ Ű�� 32�����̽���Ű �̸� ȭ���� �߻��ϰ�
	//ȭ���� �������� ȭ�鿡 ���
	//��ǥ���� �¾Ҵ����� Ȯ��
	//�¾����� ���� ������ ����
	//�ƹ�Ű�� ������ �������� ����
}
void horizontal_slide(int x, int y, char *c2) {
	gotoxy(x, y);
	printf("%s", c2);
	Sleep(100);
	printf("\b\b ");
}