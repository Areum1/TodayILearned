package Quiz1;

public class Quiz7_1 {
	public static void main(String ar[]) {
		Shape ref = null;
		ref = new Circle(5); //��ĳ���� �ڽĲ� ������ �ٿ� ĳ���� (����ޱ�)
		System.out.println("������ ������ "+ref.area());
		ref = new Rectangle(10,10);
		System.out.println("������ ������ "+ref.area());
		ref = new Triangle(10,10);
		System.out.println("������ ������ "+ref.area());
	}
}
