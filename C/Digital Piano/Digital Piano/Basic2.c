#include <stdio.h>
#include <conio.h>
#include <windows.h>
int main(void) {
	//char *text = "color 0c";  //검은색 연한 빨강
	char *text = "color b8";
	system(text);
	printf("아무키나 누르면\n");
	printf("이전 색으로 돌아갑니다.\n");
	_getch();
	system("color 07");  //검은색 흰색
	return 0;
}