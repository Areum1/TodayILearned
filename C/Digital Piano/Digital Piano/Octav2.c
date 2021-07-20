#include <stdio.h>
#include <math.h>
#include <Windows.h>
int calc_frequency(int octave, int inx);
void main() {
	int index[] = { 0,2,4,5,7,9,11,12 };
	int freq[8];
	int i;
	for (i = 0; i < 8; i++) {
		freq[i] = calc_frequency(4, index[i]);
	}
	//Beep(262, 500);
	for (i = 0; i <= 7; i++) {
		Beep(freq[i], 600);
	}
	Sleep(1000); //음간의 지연시간 1초

	for (i = 7; i >= 0; i--) {
		Beep(freq[i], 600);
		Sleep(1000);
	}
}
int calc_frequency(int octave, int inx) {
	double do_scale = 32.7032;
	double ratio = pow(2., 1 / 12.), temp;
	int i;

	temp = do_scale*pow(2., octave-1);

	for (i = 0; i < inx; i++) {
		temp = (int)(temp + 0.5);
		temp *= ratio;
	}
	return (int)temp;
}