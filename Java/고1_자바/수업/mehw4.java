class mehw4 {
	double area;
	public double circle(int x) {
		if(x<=0)
			x = 0;
		area = (double)x *(double) x* 3.14;
		return area;
	}
	public static void main(String ar[]) {
		mehw4 hw = new mehw4();
		System.out.println(hw.circle(-1));
	}
}