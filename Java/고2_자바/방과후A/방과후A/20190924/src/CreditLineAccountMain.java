public class CreditLineAccountMain {

	public static void main(String[] args) {
		
		CreditLineAccount cl = new CreditLineAccount("000-11-111111","�輱��",10000,20000000);

		System.out.println("����� : "+cl.withdraw(50000));
		System.out.println("�ܾ� : "+cl.balance);
		System.out.println("���̳ʽ� �ѵ� : "+cl.creditLine);
	}

}
