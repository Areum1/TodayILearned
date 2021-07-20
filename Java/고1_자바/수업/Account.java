import java.util.*;
class Account {
int mon;
	private String accountNo; //계좌명
	private String password;//비밀번호
	private String owner; //예금주
	private int balance;  //잔고

	public void deposit(int x){ //입금하다
		System.out.println(x+"원이 입금되었습니다.");
	} //입금
	public void widthDraw(int y,int x) { //출금하다
	if(x>=y)
		System.out.println(y+"원이 출금되었습니다.");
} // 출금
public static	 void main(String ar[]) {
	Scanner sc = new Scanner(System.in);
	Account a = new Account();
int mon=0;

	System.out.print("계좌명을 입력하세요  : ");
	String acc = sc.next();
	a.accountNo = acc;
	System.out.print("비밀번호를 입력하세요 : ");
	String pw = sc.next();
	a.password = pw;
	System.out.print("예금주를 입력하세요 : ");
	String ow = sc.next();
	a.owner = ow;

		System.out.println("\n"+"입력한 정보를 확인하겠습니다.");
		while(true) {
	System.out.print("계좌명을 입력하세요  : ");
	String acc1 = sc.next();
	System.out.print("비밀번호를 입력하세요 : ");
	String pw1 = sc.next();
	System.out.print("예금주를 입력하세요 : ");
	String ow1 = sc.next();
	if (acc1.equals(acc) && pw1.equals(pw) && ow1.equals(ow)) {
		System.out.println("입력한 정보 모두가 맞았습니다.");
	break;
	}
	else{
		System.out.print("잘못 입력하셨습니다. 다시 입력 하시겠습니까? : ");
		String cho = sc.next();
		if (cho.equals("n") || cho.equals("N"))
			break;
	}
		}

		while (true)
		{
	System.out.println("\n"+"1. 입금 | 2. 출금 | 3. 잔고확인 | 4. 끝");
		int num = sc.nextInt();
	if (num == 1){
		int x;
		x = sc.nextInt();
	 mon = mon+ x;
	 a.deposit(x);
	}
	else if (num == 2){
	int y;
		y = sc.nextInt();
		if (mon< y)
			System.out.println("잘못 입력하셨습니다");
		else
		mon = mon - y;
		a.widthDraw(y,mon);
	}
	else if (num == 3){
		  a.balance = mon;
			System.out.println(mon+"원");
	}
	else if (num == 4)
		break;
	else
		System.out.println("잘못 입력하셨습니다.");
		}
} // 메인
} // 클래스