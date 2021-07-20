import java.util.*;
class c_9 {
public static void main(String ar[]) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	char t  = ( a > 90) ? 'A' :  (a>80) ? 'B' : 'C';
		System.out.println(t);
	}
}