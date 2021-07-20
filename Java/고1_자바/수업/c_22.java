import java.util.*;
class c_22 {
public static void main(String ar[]) {
	int sum=0,money = 0;
	System.out.println("1.예금, 2.출금, 3.잔고, 4. 종료");
	Scanner sc = new Scanner (System.in);
	while(true){
System.out.print("번호를 입력하세요 : ");
	int i = sc.nextInt();
	if(i == 1){
		System.out.print("입금할 금액 : ");
		money = sc.nextInt();
		sum += money;
	}
	else if(i==2){
		while(true){
		System.out.print("출금할 금액 : ");
		money = sc.nextInt();
		sum -= money;
		if(sum <=0){
			System.out.println("돈이 부족합니다 다시 입력하세요.");
			sum += money;
		}
		}
	}
	else if(i==3)
		System.out.println("현재 잔고 : "+sum);
	else if (i ==4)
	break;
	else
		System.out.println("잘못 입력하셨습니다");
}
}
}