
public class PolyTest3 {

	public static void main(String ar[]) {
		Buyer b = new Buyer();
		TV tv = new TV();
		Computer com = new Computer();
		Audio audio = new Audio();
		
		b.buy(tv);
		b.buy(audio);
		System.out.println();
		b.summary();
		
		b.buy(com);
		b.buy(com);
		System.out.println();
		b.summary();
		
		b.refund(audio);
	}
}
