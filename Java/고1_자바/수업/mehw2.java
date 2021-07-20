class mehw2 {
	public void greeting(int x) {
		if(x == 1)
			System.out.println("¾È³çÇÏ¼¼¿ä");
		else if(x == 2)
			System.out.println("±Â¸ð´×");
		else if(x == 3)
			System.out.println("¿Ã¶ó");
		else if(x == 4)
			System.out.println("°ï´ÏÄ¡¿Í");
		else
			System.out.println("Àß¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù");
	} //subtract
	public static void main(String ar[]) {
		mehw2 hw = new mehw2();
			hw.greeting(2);
	} //main
} //class