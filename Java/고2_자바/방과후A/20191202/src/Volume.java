
public interface Volume {
	
	// 인터페이스는 추상 메소드만 가질 수 있다.
	// 멤버변수를 기술하면  public static final 키워드가 붙는다.
	// public static final String name = "홍길동"; final 변수는 선언할 때 초기화도 함
	
	// 인터페이스는 다중상속이 가능하다.
	// 인터페이스는 new를 할 수 없다.
	// 하위클래스가 implements 키워드로 구현한다.
	// 인터페이스 간에 상속이 가능하다(같은 종족 : extends)
	
	void volumeUp(int level);
	void volumeDown(int level);
	
//	public void print() {
//		System.out.println("로직 가질 수 없지");
//	}
	
}
