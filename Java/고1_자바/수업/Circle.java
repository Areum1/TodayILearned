class Circle extends Shape{
	public void setArea(int x) {
	this.x = x;
} //�������� �� �ִ� �� ����
public double getArea() {
	double sum;
	sum = (double)x*(double)x*3.14;
	return sum;
} //���� ���ϱ�
	public static void main (String ar[]){
		Circle c = new Circle();
		c.setArea(5);
		System.out.println(c.getArea());
	}
}