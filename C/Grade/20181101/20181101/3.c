#include <stdio.h>
#pragma warning (disable:4996)

int sum = 0;

void englishsum(char a) {
	if (a <= 'z' && a >= 'a') {
		sum += a - 96;
		printf("���ݱ����� ���� %d�Դϴ�.\n", sum);
	}
	else if (a <= 'Z' && a >= 'A') {
		sum += a - 64;
		printf("���ݱ����� ���� %d�Դϴ�.\n", sum);
	}
	else printf("�߸��Է��ϼ̽��ϴ�.\n");
}

int main() {
	while (1) {

		int ans;
		printf("�����Ͻ÷��� 0�� �����ֽʽÿ� : ");
		scanf("%d", &ans);
		if (ans == 0) break;

		else {
			char a;
			printf("���ĺ��� �Է����ֽʽÿ� :");
			scanf(" %c", &a);
			englishsum(a);
		}
	}
}