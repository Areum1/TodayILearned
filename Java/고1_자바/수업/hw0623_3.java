class hw0623_3 {
public static void main(String ar[]){
	System.out.println(ar[0]);
	int a = Integer.parseInt(ar[0]);
	for (int i = 1; i<=a; i++)
	{
		if (i % 4 == 0)
		{
			System.out.println("1부터 입력받은 정수까지의 4의 배수 "+i);
		}
	}
}
}