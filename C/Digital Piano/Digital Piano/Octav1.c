#include <stdio.h>
#include <math.h>
void print_frequency(int octave);
void main() {
	char *scale[] = { "도", "도#", "레", "레#", "미", "파", "파#", "솔", "솔#", "라", "라#", "시", "도" };
	int i, octave, count = 0;
	printf("음계와 주파수\n\n음계\t     ");
	for (i = 0; i < 12; i++) {
		printf("%-5s", scale[i]);
	}
	printf("\n");
	for (i = 0; i <= 70; i++) {
		printf("-");
	}
	printf("\n");
	for (octave = 1; octave < 7; octave++) {
		print_frequency(octave);
	}
}
void print_frequency(int octave) {
	double do_scale = 32.7032;
	double ratio = pow(2., 1 / 12.), temp;
	int i;
	temp = do_scale*pow(2, octave-1);
	printf("%d옥타브 : ", octave);
	for (i = 0; i < 12; i++) {
		printf("%5ld", (unsigned long)(temp + 0.5));
		temp *= ratio;
	}
	printf("\n");
}