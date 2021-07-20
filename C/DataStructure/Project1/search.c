#include <limits.h>
#include <stdio.h>
#define M INT_MAX
#define SIZE 8

int minVertex(int D[], int chk[]) {
	int index, minValue = M;
	int i;
	for (i = 0; i < SIZE; i++) {
		if (chk[i] == 0 && D[i] < minValue) {
			minValue = D[i];
			index = i;
		}
	}
	return index;
}

void Dijkstra(int G[][SIZE], int D[], int P[], int i) {
	int chk[SIZE] = { 0 }, j, cnt = 0;
	for (j = 0; j < SIZE; j++) {
		if (G[i][j] > 0 && G[i][j] < M) {
			D[j] = G[i][j]; P[j] = i;
		}
	}

	chk[i] = 1; cnt++;
	printf(" D: ");
	for (int k = 0; k < SIZE; k++)
		printf("%5d", D[k]);
	printf("\n P: ");
	for (int k = 0; k < SIZE; k++)
		printf("%5d", P[k]);
	printf("\n");
	while (cnt < SIZE) {
		i = minVertex(D, chk);
		for (j = 0; j < SIZE; j++) {
			if (G[i][j] > 0 && G[i][j] < M) {
				if (D[j] > D[i] + G[i][j]) {
					D[j] = D[i] + G[i][j];
					P[j] = i;
				}
			}
		}
		printf(" D: ");
		for (int k = 0; k < SIZE; k++)
			printf("%5d", D[k]);
		printf("\n P: ");
		for (int k = 0; k < SIZE; k++)
			printf("%5d", P[k]);
		printf("\n");
		chk[i] = 1; cnt++;
	}
}
int main(void) {
	int G[][SIZE] = {
		{ 0,12,15,18,M,M,M,M },
		{ 12,0,M,M,33,26,M,M },
		{ 15,M,0,7,M,10,M,M },
		{ 18,M,7,0,M,M,11,M },
		{ M,33,M,M,0,17,M,15 },
		{ M,26,10,M,17,0,M,28 },
		{ M,M,M,11,M,M,0,20 },
		{ M,M,M,M,15,28,20,0 }
	};
	char V[] = { 'A','B','C','D','E','F','G','H' };
	int D[] = { M,M,M,M,M,M,M,M };
	int P[SIZE] = { 0 };
	int i;
	char aV, bV;
	printf("출발정점 : ");
	scanf_s("%c", &aV, 1);
	getchar();

	printf("도착정점 : ");
	scanf_s("%c", &bV, 1);
	getchar();

	for (i = 0; i < SIZE; i++)
		if (V[i] == bV) break;

	D[i] = 0; P[i] = i;
	Dijkstra(G, D, P, i);

	for (i = 0; i < SIZE; i++)
		if (V[i] == aV) break;
	
	printf("\n%c에서 %c까지 최단거리 : %d\n", aV, bV, D[i]);
	printf("%c", aV);
	while (V[i] != bV) {
		i = P[i];
		printf("->%c", V[i]);
	}
	printf("\n");
	return 0;
}