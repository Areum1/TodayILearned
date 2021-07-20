#include <stdio.h>
int main() {
	printf("%c%c ", 0xC0, 0xCC); //이 C0CC ->두개씩 나눠서 앞에 0x붙이기
	printf("%c%c ", 0xC1, 0xF6);
	printf("%c%c\n", 0xBE, 0xC6);
}