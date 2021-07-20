class Circle extends Shape{
	public void setArea(int x) {
	this.x = x;
} //면적구할 수 있는 값 세팅
public double getArea() {
	double sum;
	sum = (double)x*(double)x*3.14;
	return sum;
} //면적 구하기
	public static void main (String ar[]){
		Circle c = new Circle();
		c.setArea(5);
		System.out.println(c.getArea());
	}
}