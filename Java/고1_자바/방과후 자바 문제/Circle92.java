class Circle {
	int radius;
	public Circle (int radius) {
		this.radius = radius;
	}
	public double GetArea() {
		return radius*radius*3.14;
	}
}
class Circle92 {
	public static void main(String ar[]){
		Circle [] c=new Circle[5];
		for (int i = 0; i<c.length; i++){
			c[i] = new Circle(i);
			System.out.println((int)c[i].GetArea());
		}
	}
}