class Param_Test2 {
public static void main(String ar[]){
	System.out.println(ar[0]);
	System.out.println(ar[1]);
	int sum = 0;
	int a = Integer.parseInt(ar[0]);
	int b = Integer.parseInt(ar[1]);
	for (int i = a; i<=b; i++)
	{
		sum = i + sum;
	}
	System.out.println("입력받은 수까지의 합은? "+sum);
	}
}