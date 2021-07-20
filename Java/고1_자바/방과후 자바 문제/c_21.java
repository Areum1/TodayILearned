import java.util.*;
class c_21 {
public static void main(String ar[]) {
	Scanner sc = new Scanner(System.in);
	int sum =0;
	for (int i = 1; i<=5; i++){
		int a = sc.nextInt();
		if(a % 2==0)
		sum = a + sum;
	}
	System.out.println(sum);
}
}