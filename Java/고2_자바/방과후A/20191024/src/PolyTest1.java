
public class PolyTest1 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		TV tv = new TV();
		Computer com = new Computer();
		
		b.buy(tv);
		b.buy(com);
		b.buy(com);
		
		System.out.println("\n현재 남은 돈은 "+b.money+"만원 입니다.");
		System.out.println("현재 보너스 점수는 "+b.bonusPoint+"만점 입니다.");
	}

}
