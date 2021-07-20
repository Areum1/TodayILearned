#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <windows.h>
#include <conio.h>
#include <math.h>
#define column 8
#define row 2

void draw_check01(void);
void gotoxy(int x, int y);

int calc_frequency(int octave, int inx);
void practice_piano(void);

int main() {
	printf("<<< DIGITAL PIANO >>>\n\n");
	printf("Ű������ ���ڸ� ������ �ش� �ǹݿ� ���� ǥ�õǰ�,\n");
	printf("�ش� ���� ����Ŀ�� ��µ�(���α׷� ���� BB: Esc Ű)\n");
	printf("> Ű�� : �� ��Ÿ�� ���� <			> Ű�� : �� ��Ÿ�� �Ʒ��� <\n");
	printf("> Ű�� : ���� �����ð� ª�� <		> Ű�� : ���� �����ð� ��� <\n");

	draw_check01();
	char musicnote[][8] = { "��", "��", "��", "��", "��", "��", "��", "��" };
	int note = 8;
	for (int j = 0; j < 2; j++) {
		int num = 3;
		for (int i = 0; i < 8; i++) {
			gotoxy(num, note);
			if (j == 0) {
				printf("%d", i + 1);
			}
			else {
				printf("%s", musicnote[i]);
			}
			num += 4;
		}
		note += 2;
		printf("\n");
	}
	practice_piano();
	return 0;
}
void draw_check01() {
	int i, j, z;
	unsigned char a = 0xa6;
	unsigned char b[12];
	for (i = 1; i < 12; i++) {
		b[i] = 0xa0 + i;
	}
	//Ű���� ���
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
} //�⺻Ű����
void gotoxy(int x, int y) {
	COORD Pos = { x - 1, y - 1 };
	SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE), Pos);
}
int calc_frequency(int octave, int inx)
{
	double do_scale = 32.7032;
	double ratio = pow(2., 1 / 12.), temp;
	int i;

	temp = do_scale * pow(2, octave - 1);

	for (i = 0; i < inx; i++) {
		temp = (int)(temp + 0.5);
		temp *= ratio;
	}

	return (int)temp;
}
void practice_piano(void) {
	int index[] = { 0,2,4,5,7,9,11,12 };
	int freq[8], code, i;
	for (i = 0; i < 8; i++) {
		freq[i] = calc_frequency(4, index[i]);
	}
	do {
		code = _getch();
		if ('1' <= code && code <= '8') {
			code -= '1'; //code-=49;
			Beep(freq[code], 500);
			//draw_check(code);
		}
	} while (code != 27); //ESC(27)Ű�� ����
}