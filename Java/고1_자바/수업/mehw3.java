class mehw3 {
	public void loopMethod(int x) {
		for(int i = 1; i<=x; i++)
			System.out.println("자바는 맛있다");
	}
	public static void main(String ar[]) {
		mehw3 hw = new mehw3();
		hw.loopMethod(5);
	}
}