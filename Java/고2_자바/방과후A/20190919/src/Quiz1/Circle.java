package Quiz1;

public class Circle extends Shape {
	int r;
	
	public Circle (int r) {
		this.r = r;
	}
	
	double area() {
		return r * r * Math.PI;
	}
}
