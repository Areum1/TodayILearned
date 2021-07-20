class c_34 {
public static void main(String ar[]){
	double sum = 0;
	double score[][];
	score = new double[][] { {3.3,3.4},{3.5,3.6},{3.7,4.0},{4.1,4.2} };
	for (int i = 0; i<4; i++) 	{
		for (int j = 0; j<2; j++) {
			sum += score[i][j];
		}
	}
	System.out.println(sum);
}
}