#define NUM 8 //입력하고자 하는 알파벳 개수
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
void main() {
	int sum = 0;
	char a[NUM];
	for (int j = 0; j < NUM; j++) {
		if (!(j == NUM-1))
		scanf("%c ", &a[j]); //a b c => -61,abc = 6 -> 고침
		else scanf("%c", &a[j]);
	}
	for (int i = 0; i < NUM;i++) {
		a[i] = (int)a[i] - 96;
		sum += a[i];
	}
	printf("%d", sum);
}