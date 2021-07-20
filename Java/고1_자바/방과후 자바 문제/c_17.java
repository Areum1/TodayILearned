import java.util.*;
class c_17{
public static void main(String ar[]) {
	int count = 0, sum = 0,a;
	float avg = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
	while (true)
	{
		a = sc.nextInt();
		if(!(a==-1)){
			++count;
			sum = sum+ a;
		}
		else if(a==-1)
			break;
	}
	avg = sum /count;
	System.out.println("정수의 개수는 "+count+"개이며 평균은 "+avg+"입니다.");
}
}