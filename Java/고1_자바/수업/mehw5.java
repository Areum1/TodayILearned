class mehw5 {
	int area;
	public int square(int x,int y) {
		if(x<=0)
			x = 0;
		area = x * y;
		return area;
	}
	public static void main(String ar[]) {
		mehw5 hw = new mehw5();
		System.out.println(hw.square(3,5));
	}
}