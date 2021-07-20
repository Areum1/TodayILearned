package Quiz1;

public class Triangle extends Shape{
	int w;
	int h;
	
	public Triangle (int w, int h){
		this.w = w;
		this.h = h;
	}
	
	double area() {
		return (w*h)/2;
	}

}
