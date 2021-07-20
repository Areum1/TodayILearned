package Quiz1;

public class Quiz7_1 {
	public static void main(String ar[]) {
		Shape ref = null;
		ref = new Circle(5); //업캐스팅 자식꺼 쓰려면 다운 캐스팅 (허락받기)
		System.out.println("도형의 면적은 "+ref.area());
		ref = new Rectangle(10,10);
		System.out.println("도형의 면적은 "+ref.area());
		ref = new Triangle(10,10);
		System.out.println("도형의 면적은 "+ref.area());
	}
}
