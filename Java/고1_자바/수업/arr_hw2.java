class arr_hw2{
public static void main(String ar[]){
	int sum=0;
	int a[][] =  { { 78,48,78,98 },{ 99,92,83,29 },{ 29,64,83,89 },{ 34,78,92,56 } };
	int i, j;
	for (i = 0; i < 4; i++) {
		for (j = 0; j < 4; j++) {
			sum = a[i][j] + sum;
			//System.out.println("행의 합 : "+sum);
		}
		System.out.println("행의 합 : "+sum);
	}
	}
}