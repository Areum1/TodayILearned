import java.util.*;
class c_8 {
public static void main(String ar[]) {
	while (true)
	{
		System.out.print("숫자를 입력하세요 : ");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	if(a>= 65 && a<=90){
		System.out.println("대문자입니다 : "+(char)a);
		break;
	}
	else if(a>= 97 && a<=122){
		System.out.println("소문자입니다 : "+(char)a);
		break;
	}
	else
		System.out.println("다시 입력하세요");
	}
}
}