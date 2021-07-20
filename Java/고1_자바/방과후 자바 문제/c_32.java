class c_32 {
public static void main(String ar[]){
	int num = 1;
	int a[][] = new int[3][4];
	for (int i = 0; i<3; i++)
	{
		for (int j = 0; j<4; j++)
		{
			a[i][j] = num;
			num++;
		}
	}
	for (int i = 0; i<3; i++)
	{
		for (int j = 0; j<4; j++)
		{
			System.out.print(a[i][j]+"\t");
		}
	System.out.println();
	}
}
}