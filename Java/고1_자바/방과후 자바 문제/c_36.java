import java.util.*;
class c_36 {
public static void main(String ar[]){
	Scanner sc = new Scanner (System.in);
	int a[] = new int[10];
	for (int i = 0; i<10; i++) {
		a[i] = sc.nextInt();
		if (a[i] % 3 ==0)
			System.out.println(a[i]);
	}
}
}