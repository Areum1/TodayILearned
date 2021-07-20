class Rectangle {
	int x1,y1,x2,y2,size;
	Rectangle () {}
	Rectangle (int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	public void set(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		System.out.println("("+x1+","+y1+")"+"("+x2+","+y2+")");
	}
	public int square(){
		int a,b;
		a = x1 - x2;
		b = y1- y2;
		size = a*b;
	if (size < 0)
		size = -size;
	return size;
	}
	public void show() {
		System.out.println("("+x1+","+y1+")"+"("+x2+","+y2+")");
		int a,b;
		a = x1 - x2;
		b = y1- y2;
		size = a*b;
	if (size < 0)
		size = -size;
		System.out.println(size);
	}

public boolean equals (Rectangle r) {
	return true;
}

	public static void main(String ar[]) {
		Rectangle r = new Rectangle();
		Rectangle s = new Rectangle(1,1,2,3);
		r.show();
		s.show();
		System.out.println(s.square());
		r.set(-2,2,-1,4);
		r.show();
		System.out.println(r.square());
		if(r.equals(s))
			System.out.println("두 사각형은 같습니다.");
}
}