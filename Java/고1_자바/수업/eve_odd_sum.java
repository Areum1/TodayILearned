import java.util.*;
class eve_odd_sum {
public static void main(String ar[]){
	int sum1=0, sum2=0;
	Scanner sc = new Scanner(System.in);
	int a[] = new int[5];
	for (int i = 0; i<5; i++){
		a[i] = sc.nextInt();
	if (a[i] %2 == 0)
		sum2 = sum2 + a[i];
	else if (a[i] %2 == 1)
		sum1 = sum1 + a[i];
	}
	System.out.println("Â¦¼öÀÇ ÇÕ : "+sum2+"\n"+"È¦¼öÀÇ ÇÕ : "+sum1+"\n");
	}
}