class c_42 {
		int r;
	public c_42 (int r) {
		this.r = r;
	}
	public void circle() {
		System.out.println(r*r*3.14);
		System.out.println(r*2*3.14);
	}
	public static void main(String ar[]) {
		c_42 hw = new c_42(8);
		hw.circle();
	}
}