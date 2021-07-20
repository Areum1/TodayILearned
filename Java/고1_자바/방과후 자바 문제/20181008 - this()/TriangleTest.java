class Triangle {
	double width;
	double height;
	double area;
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public double findArea() {
		area = (width*height)/2;
		return area;
	}
	public boolean isSameArea(Triangle t) {
		if (t instanceof Triangle){
			Triangle t0 = (Triangle) t;
			if(area == t0.area){
				return true; 
			}//t0 if
		}//t if
		else { 
			return false;
		}
	}
}
public class TriangleTest {
	public static void main(String ar[]) {
	Triangle t1 = new Triangle(10.0, 5.0);
	Triangle t2 = new Triangle(5.0, 10.0);
	Triangle t3 = new Triangle(8.0, 8.0);

	System.out.println(t1.isSameArea(t2));
	System.out.println(t1.isSameArea(t3));

	}
}
