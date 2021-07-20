import java.util.*;

class Debit {
	int balance; //잔액
	int pay; //쓴 돈

	public Debit(int balance) {
		this.balance = balance;
	}
	public void SetBalance (int b){
		this.balance = b;
	}
	public void SetPay (int p){
		this.pay = p;
	}
	public int GetBalance (){
		return balance;
	}
	public int GetPay (){
		return pay;
	}
	public int use(int a){
		if (balance >= a){
			balance -= a;
			System.out.println("잔액은 "+balance+"원 입니다.");
			return 1;
		}//if
		else if (balance < a){
			System.out.println("잔액이 부족합니다.");
			return 0;
		}//else if
		return 1;
	}//use
}//debit

///////////////////////////////////////////////////////////////////////
class Credit extends Debit {
	Credit (int balance) {
		super(balance);
	}//cre
	public int use(int a){
		if(super.balance >= a) {
			super.balance -= a;
			System.out.println("남은 한도는 "+super.balance+"원 입니다");
			return 1;
		}//if
		else if (super.balance < a){
			System.out.println("신용한도가 부족합니다.");
			System.out.println("신용 한도 부족으로 직불카드로 사용합니다.");
			return 0;
		}//else if
		return 1;
	}//use
}
///////////////////////////////////////////////////////////////////////
class Cre_Test {
	public static void main(String ar[]) {
		Debit d = new Debit(10000);
		Credit c = new Credit(100000);
		int mon;
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("0. 직불카드 1. 신용카드 2. 종료 = ?");
		int maincho = sc.nextInt();
		switch (maincho){
		case 0:
			System.out.println("얼마를 사용하시겠습니까?");
			mon = sc.nextInt();
			d.use(mon);
			break;
		case 1:
			System.out.println("얼마를 사용하시겠습니까?");
			mon = sc.nextInt();
			if(c.use(mon) == 0){
				d.use(mon);
			} // c.use(mon) if
			break;
		case 2: System.exit(0);
		}//switch
		}
	}//main
}//cretest