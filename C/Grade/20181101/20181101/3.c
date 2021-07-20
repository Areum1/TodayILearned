#include <stdio.h>
#pragma warning (disable:4996)

int sum = 0;

void englishsum(char a) {
	if (a <= 'z' && a >= 'a') {
		sum += a - 96;
		printf("지금까지의 값은 %d입니다.\n", sum);
	}
	else if (a <= 'Z' && a >= 'A') {
		sum += a - 64;
		printf("지금까지의 값은 %d입니다.\n", sum);
	}
	else printf("잘못입력하셨습니다.\n");
}

int main() {
	while (1) {

		int ans;
		printf("종료하시려면 0을 눌러주십시오 : ");
		scanf("%d", &ans);
		if (ans == 0) break;

		else {
			char a;
			printf("알파벳을 입력해주십시오 :");
			scanf(" %c", &a);
			englishsum(a);
		}
	}
}