class dog2 extends Animal2 {
	public void bark() {
		System.out.println("Â¢´Ù");
	}
	public void eat() {
		System.out.println("»ç·á¸¦ ¸Ô´Ù");
	}
	public static void main(String ar[]) {
		dog2 d = new dog2();
		d.name = "¾ç";
		d.leg = "4°»";
		d.eat();
		System.out.println(d.name);
		System.out.println(d.leg);
	}
}