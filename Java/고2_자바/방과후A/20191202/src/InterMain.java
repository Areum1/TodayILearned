
public class InterMain {

	public static void main(String[] args) {

		InterRadio radio = new InterRadio();
		radio.volUp(10);
		radio.show();
		
		radio.volDown(3);
		radio.show();
		
		radio.volOff();
		radio.show();
		
		radio.volResume();
		radio.show();
		
	} //main

}
