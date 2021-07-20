package Quiz1;

public class Quiz7_3 {
	public static void main(String[] args) {
		polyMethod(new Circle(5));
		polyMethod(new Rectangle(10,10));
		polyMethod(new Triangle(10,10));
	}
	public static void polyMethod(Shape ref) {
		//ref.area();
		if(ref instanceof Circle) {
			Circle c = (Circle)ref;
			System.out.println("�������� "+c.r+"�� ���� ������"+ref.area());
		}
		else if(ref instanceof Rectangle) {
			Rectangle r = (Rectangle)ref;
			System.out.println("���̰� "+r.w+"�̰�, ���̰� "+r.h+"�� �簢���� ������"+ref.area());
		}
		else if(ref instanceof Triangle) {
			Triangle t = (Triangle)ref;
			System.out.println("���̰� "+t.w+"�̰�, ���̰� "+t.h+"�� �ﰢ���� ������"+ref.area());
		}
	}
}
