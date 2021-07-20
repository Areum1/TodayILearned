
public class CheckingAccount extends Account {
	String cardNo;
	
	public CheckingAccount(String a, String o, int b, String c) {
//		this.accountNo = a;
//		this.ownerName = o;
//		this.balance = b;
		super(a,o,b);
		this.cardNo = c;
	}
	public int pay(String cardNo, int amount) {
		if(!this.cardNo.equals(cardNo) || amount < balance) {
			System.out.println("지불액 : "+ amount);
			balance -= amount;
			System.out.println("잔액 : "+balance);
		}
		else {
			System.out.println("지불이 불가능 합니다.");
			System.out.println("지불액 : "+amount);
			System.out.println("잔액 : "+balance);
		}
		return 0; // return withdraw(amount); 도 가능 ㅠㅠㅠ
	}
	
	
}
