package Quiz1;

public class Rectangle extends Shape{
	int w;
	int h;
	
	public Rectangle (int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	double area() { 
		return w * h;
	}
}
