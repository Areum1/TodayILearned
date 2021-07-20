#define _CRT_SECURE_NO_WARNINGS
#define STU 2 //학생수
#define SUBJ 4 //과목수
#include <stdio.h>
void Line() {
	printf("---------------------------------------------\n");
}
void main() {
	char id[STU][5], name[STU][11], sub[5][5] = { "국어","영어","수학","C언어" },grade[STU];
	int score[STU + 1][SUBJ + 1] = { 0 }, avg1[STU], rank[STU],tot=0;
	float avg[STU+1];

	for (int i = 0; i < STU; i++) {
		if (!(i == 0))
			Line();
		printf("학번 이름 입력 : ");
		scanf("%s %s", id[i], name[i]);
		rank[i] = 1;
		for (int k = 0; k < SUBJ;k++) {
			while (1) {
				printf("%s 점수 입력 : ", sub[k]);
				scanf("%d", &score[i][k]);
				if (score[i][k] < 0 || score[i][k] > 100) printf("%s 에러\n", sub[k]);
				else if (!(score[i][k] < 0 || score[i][k] > 100)) break;
			} //while
			score[STU][k] += score[i][k];
			tot += score[i][k];
		} //for int k
	}//for int i
	 //입력,에러

	for (int i = 0; i < STU; i++) {
		for (int j = 0; j < SUBJ;j++) {
			score[i][SUBJ] += score[i][j];
		}//계산 for j
			avg[i] = (float)score[i][SUBJ] / SUBJ;
			avg1[i] = (int)avg[i] / 10;
			switch (avg1[i]) {
			case 10: case 9: grade[i] = 'A'; break;
			case 8: grade[i] = 'B'; break;
			case 7: grade[i] = 'C'; break;
			case 6: grade[i] = 'D'; break;
			default: grade[i] = 'E';
			}//switch
	}//계산 for i
	 //계산
	for (int m = 0; m <= STU - 2; m++) {
		for (int n = m + 1; n < STU; n++) {
			if (score[m][SUBJ] > score[n][SUBJ])
				rank[n] ++;
			else if (score[m][SUBJ] < score[n][SUBJ])
				rank[m] ++;
		}
	}
	//rank 계산
	Line();
	printf("학번\t이름\t");
	for (int a = 0; a < SUBJ; a++)
		printf("%s\t", sub[a]);
	printf("합계\t평균\t등급\t석차\n");
	for (int a = 0; a < STU; a++) {
		printf("%s\t%s\t", id[a], name[a]);
		for (int b = 0; b < SUBJ;b++)
			printf("%4d\t", score[a][b]);
		printf("%4d\t%.2f\t%4c\t%4d\n", score[a][SUBJ], avg[a], grade[a], rank[a]);
	}
	printf("\t\t");
	for (int a = 0; a < SUBJ;a++) 
		printf("%4d\t", score[STU][a]);
	printf("%4d\t%4.2f\n\t\t", tot, (float)tot/STU);
	for (int a = 0; a < SUBJ;a++)
		printf("%4.2f\t", (float)score[STU][a]/STU);
	//출력
}