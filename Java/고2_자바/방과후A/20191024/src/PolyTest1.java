
public class PolyTest1 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		TV tv = new TV();
		Computer com = new Computer();
		
		b.buy(tv);
		b.buy(com);
		b.buy(com);
		
		System.out.println("\n���� ���� ���� "+b.money+"���� �Դϴ�.");
		System.out.println("���� ���ʽ� ������ "+b.bonusPoint+"���� �Դϴ�.");
	}

}
