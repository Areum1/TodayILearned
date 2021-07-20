
public class Account {
	public String accountNo; //���¹�ȣ
	public String ownerName; //������
	public int balance; //�ܾ�
	
	public Account () {
		
	}
	public Account (String accountNo) {
		this.accountNo = accountNo;
	}
	public Account (String accountNo, String ownerName) {
		this(accountNo);
		this.ownerName = ownerName;
	}
	public Account (String accountNo, String ownerName, int balance) {
		this(accountNo,ownerName);
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
	public int withdraw(int amount) {
		if(balance >= amount) {
			balance -= amount;
			return balance;
		}
		else 
			return 0;
	}
	
	
	
}
