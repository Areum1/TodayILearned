
public class PolyTest2 {
	
	public static void main(String[] args) {
		Buyer b = new Buyer();
		TV tv = new TV();
		Computer com = new Computer();
		Audio audio = new Audio();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		
		b.summary();
		
		b.buy(com);
		b.buy(com);
		
		System.out.println();
		b.summary();
	}

}
