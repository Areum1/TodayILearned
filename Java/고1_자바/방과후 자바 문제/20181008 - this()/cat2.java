class cat2 extends Animal2 {
	public void eat() {
		System.out.println("생선을 먹다");
	}
	public void Scratch() {
		System.out.println("스크래치");
	}
	public static void main(String ar[]) {
		cat2 c = new cat2();
		c.eat();
	}
}