
public class CheckingAccountMain {

	public static void main(String[] args) {
		CheckingAccount ca = new CheckingAccount("111-22-3333333", "ȫ�浿",0,"5555-6666-7777-8888");
		
		ca.deposit(100000);
		ca.pay("5555-6666-7777-8888",47000);

	}
}