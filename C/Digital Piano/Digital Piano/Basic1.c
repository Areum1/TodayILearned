#include <stdio.h>
int main() {
	printf("%c%c ", 0xC0, 0xCC); //�� C0CC ->�ΰ��� ������ �տ� 0x���̱�
	printf("%c%c ", 0xC1, 0xF6);
	printf("%c%c\n", 0xBE, 0xC6);
}