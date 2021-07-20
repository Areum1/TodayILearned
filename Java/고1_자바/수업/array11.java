class array11 {
public static void main(String ar[]) {
	int a[][];
	a = new int [2][3];
	int n = 1;
	for (int i = 0; i<2;i++ )
	{
		for (int j = 0;j<3 ;j++ )
		{
			a[i][j] = n;
			System.out.print("a["+i+"]["+j+"]"+"="+n+" ");
			n++;
		}
		System.out.println();
	}
	}
}
