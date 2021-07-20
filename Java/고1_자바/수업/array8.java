import java.util.*;
class array8 {
public static void main(String ar[]) {
	Scanner sc = new Scanner(System.in);
		int a [] = new int [5];
		int sum = 0;
			for(int i = 0; i <5; i++) {
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}
		System.out.println(sum);
	}
}