class arr_hw3{
public static void main(String ar[]){
	int i,j;
	int a[][] = new int[9][9];
	for(i = 0; i<9;i++) {
		System.out.println((i+1)+"��");
		for (j = 0;j<9;j++)
		{
			a[i][j] = (i+1)*(j+1);
			System.out.println(a[i][j]);
		}
		System.out.println("\n");
	}
	}
}