
public class AccountMain extends Account {
	public static void main(String args[]) {
		Account a1 = new Account("111-222-3333333","�迵��",200000);
		Account a2 = new Account("555-666-7777777","������",1000000);
		a1.deposit(1000000);
		printAccount(a1);
		System.out.print("\n");
		a2.withdraw(200000);
		printAccount(a2);
		
		
	}
	public static void printAccount(Account a) {
		System.out.println("���¹�ȣ : " + a.accountNo+ "\n������ : "+a.ownerName + "\n�ܾ� : "+a.balance);
	}
}
