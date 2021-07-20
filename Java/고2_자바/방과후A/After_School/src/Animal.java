
abstract public class Animal {

	abstract public String name();
	abstract public String eat(); 
	abstract public String action(); 
	public void print() {
		System.out.println("Animal 클래스의 print 메서드");
	}
}

//9월 10일
// 인스턴스 메서드 : new를 해야 사용할 수 있는 메서드듩
//추상클래스
//존재할 수 없는데 자식들이 오버라이딩 재정의 해줘야 쓸 수 있음
//클래스가ㅣ abstract 를 하나라도 가지고 있으면 써줘야함