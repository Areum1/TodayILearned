import java.util.*;
class c_10 {
public static void main(String ar[]) {
	int b;
	System.out.println("가위바위보"+"\n");
	System.out.println("가위 : 0");
	System.out.println("바위 : 1");
	System.out.println("보 : 2\n");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	while(true){
	if (a>=3){
		System.out.print("다시 입력하세요 : "); 
	a = sc.nextInt(); }
	else
		break;
	}
	do{
		b = (int)(Math.random()*10); } while(b>=2);
	if(a==b)
		System.out.println("비겼습니다.");
	else if (a>b)
		System.out.println("사용자가 이겼습니다.");
	else if (a<b)
		System.out.println("pc가 이겼습니다.");

	System.out.println("pc의 값 : "+b);
}
}