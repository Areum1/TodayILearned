class hw0623_2 {
public static void main(String ar[]){
	System.out.println(ar[0]);
	System.out.println(ar[1]);
	int temp = 0;
	int a = Integer.parseInt(ar[0]);
	int b = Integer.parseInt(ar[1]);
	if (a > b)
	{
		b = temp;
		b = a;
 		a = temp;
	}
	for (int i = a; i<=b; i++)
	{
		System.out.println("입력받은 두 수 사이에 있는 수 : "+ i);
	}
	}
}