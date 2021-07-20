public class CreditLineAccountMain {

	public static void main(String[] args) {
		
		CreditLineAccount cl = new CreditLineAccount("000-11-111111","김선달",10000,20000000);

		System.out.println("인출액 : "+cl.withdraw(50000));
		System.out.println("잔액 : "+cl.balance);
		System.out.println("마이너스 한도 : "+cl.creditLine);
	}

}
