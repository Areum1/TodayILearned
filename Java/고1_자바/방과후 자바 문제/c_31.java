import java.util.*;
class c_31 {
public static void main(String ar[]){
	int a[] = new int[4];
	int sum = 0;
	Scanner sc = new Scanner(System.in);
	for (int i = 0; i<4; i++) {
		a[i] = sc.nextInt();
		sum += a[i];
	}
	System.out.println("�� : "+sum);
		}
}