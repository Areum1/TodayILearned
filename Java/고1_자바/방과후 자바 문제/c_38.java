import java.util.*;
class c_38 {
public static void main(String ar[]){
	int num;
	Scanner sc = new Scanner (System.in);
	int a[] = new int[10];
	for (int i = 0; i<10; i++) {
		a[i] = sc.nextInt();
	}
	for(int i = 0; i<9; i++) {
		for (int j = i+1; j<10; j++) {
		if (a[i] < a[j])
		{
			num = a[j];
			a[j] = a[i];
			a[i] = num;
		}
		}
	}
	for (int i = 0; i<10; i++) {
		System.out.print(a[i]+"\t");
	}
}
}
			