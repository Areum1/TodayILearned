class freeTest_3{
public static void main(String ar[]){
	int a[] = new int[30];
	int sum1=0, sum2=0;
		for (int i = 1;i<=30;i++)
		{
			a[i-1] = i;
			if (a[i-1] %2 == 0)
				sum2 = sum2+a[i-1];
			else
				sum1 = sum1+a[i-1];
		}
		System.out.println("Ȧ�� : "+sum1+" ¦�� : "+sum2);
	}
}