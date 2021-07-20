import java.util.*;
class homework2 { //이름,나이,n을 입력받아 이름,나이,n번 출력
public static void main (String ar[]) {

	System.out.print("이름을 입력하시오 : ");
	Scanner sc = new Scanner (System.in);
	String n = sc.next();

	System.out.print("나이를 입력하시오 : ");
	int i = sc.nextInt();

	System.out.print("반복하고 싶은 횟수를 입력하시오 : ");
	int j = sc.nextInt();

		int a = 1;
		do
		{
			System.out.println("이름 : "+n+" & "+"나이 : "+i);
			a++;
		}
		while (a<=j);
}
}