class Shape1 {
	public void draw() {
	System.out.println("그리다");
}
public void painting(){}
}

class Circle extends Shape1 {
	public void draw() {
	System.out.println("원그리기");
}
public void painting() {
	System.out.println("원 색칠하기");
}
}

class Exam1 {
	public static void main(String ar[]) {
		Shape1 s = new Shape1();
		Circle c = new Circle();
		Shape1 s2 = new Circle();
		s.draw();
		c.draw();
		c.painting();
		s2.draw();// 가상메서드 안만들어도 ㄱㅊ
		s2.painting();//가상메서드 만나야함
	}//최상위 클래스는 object
}
//업캐스팅 시에 오버라이딩 된 메서드는 항상 자식메서드 호출