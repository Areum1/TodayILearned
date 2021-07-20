import java.util.*;
class homework5 { //UP&DOWN
public static void main (String ar[]) {
Random r = new Random();
int no = r.nextInt(100); //컴퓨터가 생성한 수
for (int i = 1; i<=10; i++)
{
	System.out.print("숫자를 입력하세요 : ");
	Scanner sc = new Scanner (System.in);
	int n = sc.nextInt();
	if (no > n)
	{
		System.out.println("UP");
		continue;
	}
	if (no == n)
	{
		System.out.println("맞았습니다");
		break;
	}
		if (no < n)
	{
		System.out.println("DOWN");
		continue;
	}
	else{
		System.out.println("틀렸습니다");
		continue;
	}
}
	System.out.println("정답은"+no);
	System.out.println("YOU LOSE");
}
}