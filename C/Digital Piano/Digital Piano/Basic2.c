#include <stdio.h>
#include <conio.h>
#include <windows.h>
int main(void) {
	//char *text = "color 0c";  //������ ���� ����
	char *text = "color b8";
	system(text);
	printf("�ƹ�Ű�� ������\n");
	printf("���� ������ ���ư��ϴ�.\n");
	_getch();
	system("color 07");  //������ ���
	return 0;
}