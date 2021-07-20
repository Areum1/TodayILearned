
public class CreditLineAccount extends Account {
	int creditLine; //한도 필드
	
	public CreditLineAccount (String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo,ownerName,balance);
		this.creditLine = creditLine;
	}
	
	public int withdraw(int amount){
		if(balance + creditLine < amount) {
			System.out.println("한도가 넘어서 인출 불가능");
			return 0;
		}
		balance -= amount;
		return amount;
	}
}
