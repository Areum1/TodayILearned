import java.util.*;
class homework1 { //n을 입력받아 1~n까지의 5의 배수 갯수 출력
public static void main (String ar[]) {
	System.out.print("정수를 입력하시오 : ");
	Scanner sc = new Scanner (System.in);
	int n = sc.nextInt();
	int sum = 0;
	int i = 1;

	do{
		if(i%5==0) {
			sum++; }
		i++;
	}
		while (i<=n);
		
	System.out.println(sum);
}
}
