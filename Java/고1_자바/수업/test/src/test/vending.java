package test;

import java.util.*;
class vending { 
public static void main (String ar[]) {

	System.out.println("vending machine");
	System.out.println("=============================================================================");
	System.out.println("1. 콜라 (600원) 2. 초코우유 (900원) 3. 커피 (500원) 4. 생수 (400원)");
	System.out.println("=============================================================================");
	Scanner sc = new Scanner (System.in);

	int sum= 0;
	int mon, dri, amo;
	String cho;
System.out.print("금액을 입력하세요 : ");
	mon = sc.nextInt();

while(true){
	System.out.println();
	
	System.out.print("음료을 입력하세요 : ");
	dri = sc.nextInt();
	System.out.print("수량을 입력하세요 : ");
	amo = sc.nextInt();
	System.out.println("-----------------------------------------------------------------------------");
		if (dri == 1)
		{
			sum = mon -(600*amo);
			if(sum <= 0) {
				System.out.println("잔액이 부족합니다.");
				System.out.println("-----------------------------------------------------------------------------");
				break; }
			System.out.println("뽑으신 음료는 콜라입니다");
			System.out.println("남으신 돈은 "+"1000원 : "+(sum/1000)+" ,100원 : "+((sum%1000)/100));
		}

		else if (dri == 2)
		{
			sum = mon -(900*amo);
			if(sum <= 0) {
				System.out.println("잔액이 부족합니다.");
				System.out.println("-----------------------------------------------------------------------------");
				break; }
			System.out.println("뽑으신 음료는 초코우유입니다");
			System.out.println("남으신 돈은 "+"1000원 : "+(sum/1000)+" ,100원 : "+((sum%1000)/100));
		}

		else if (dri == 3)
		{
			sum = mon -(500*amo);
			if(sum <= 0) {
				System.out.println("잔액이 부족합니다.");
				System.out.println("-----------------------------------------------------------------------------");
				break; }
			System.out.println("뽑으신 음료는 커피입니다");
			System.out.println("남으신 돈은 "+"1000원 : "+(sum/1000)+" ,100원 : "+((sum%1000)/100));
		}
		else if (dri == 4)
		{
			sum = mon -(400*amo);
			if(sum <= 0) {
				System.out.println("잔액이 부족합니다.");
				System.out.println("-----------------------------------------------------------------------------");
				break; }
			System.out.println("뽑으신 음료는 생수입니다");
			System.out.println("남으신 돈은 "+"1000원 : "+(sum/1000)+" ,100원 : "+((sum%1000)/100)); 
		}
			System.out.print("다시 뽑으시겠습니까? (Y/N) ");
		cho = sc.next();
		if (cho.equals ("n")||cho.equals("N"))
		{
			break;
		}
		}
}
}