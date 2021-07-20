import java.util.*;
class homework3 { //1~n까지의 3의배수 제외하고 출력
public static void main (String ar[]) {

	System.out.print("숫자를 입력하시오 : ");
	Scanner sc = new Scanner (System.in);
	int n = sc.nextInt();
	int i = 1;

	do
	{
		if (i %3==0)
		{	
			i++;
			continue;
			
		}
		System.out.println(i);
		i++;
	}
	while (i <= n);
}
}