#define _CRT_SECURE_NO_WARNINGS
#define STU 2 //�л���
#define SUBJ 4 //�����
#include <stdio.h>
void Line() {
	printf("---------------------------------------------\n");
}
void main() {
	char id[STU][5], name[STU][11], sub[5][5] = { "����","����","����","C���" },grade[STU];
	int score[STU + 1][SUBJ + 1] = { 0 }, avg1[STU], rank[STU],tot=0;
	float avg[STU+1];

	for (int i = 0; i < STU; i++) {
		if (!(i == 0))
			Line();
		printf("�й� �̸� �Է� : ");
		scanf("%s %s", id[i], name[i]);
		rank[i] = 1;
		for (int k = 0; k < SUBJ;k++) {
			while (1) {
				printf("%s ���� �Է� : ", sub[k]);
				scanf("%d", &score[i][k]);
				if (score[i][k] < 0 || score[i][k] > 100) printf("%s ����\n", sub[k]);
				else if (!(score[i][k] < 0 || score[i][k] > 100)) break;
			} //while
			score[STU][k] += score[i][k];
			tot += score[i][k];
		} //for int k
	}//for int i
	 //�Է�,����

	for (int i = 0; i < STU; i++) {
		for (int j = 0; j < SUBJ;j++) {
			score[i][SUBJ] += score[i][j];
		}//��� for j
			avg[i] = (float)score[i][SUBJ] / SUBJ;
			avg1[i] = (int)avg[i] / 10;
			switch (avg1[i]) {
			case 10: case 9: grade[i] = 'A'; break;
			case 8: grade[i] = 'B'; break;
			case 7: grade[i] = 'C'; break;
			case 6: grade[i] = 'D'; break;
			default: grade[i] = 'E';
			}//switch
	}//��� for i
	 //���
	for (int m = 0; m <= STU - 2; m++) {
		for (int n = m + 1; n < STU; n++) {
			if (score[m][SUBJ] > score[n][SUBJ])
				rank[n] ++;
			else if (score[m][SUBJ] < score[n][SUBJ])
				rank[m] ++;
		}
	}
	//rank ���
	Line();
	printf("�й�\t�̸�\t");
	for (int a = 0; a < SUBJ; a++)
		printf("%s\t", sub[a]);
	printf("�հ�\t���\t���\t����\n");
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
	//���
}