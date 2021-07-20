// 클래스와 객체는 다르다
// 클래스에 객체를 넣는걸 인스턴스화라고 한다 (new)
// 멤버변수 메서드 생성자

public class GrandFa { //각각의 변수에 정보은닉화 한 것을 캡슐화를 했다고 함
	
	private int nai = 80; //접근제어자를 붙이는 것 정보 은닉화
	// 정보은닉이 뭐예요? 정보에 대한 권한을 수행할 수 있도록 하는 것 (information hiding)
	//public 모든 사람들 사용 가능, 데이터 훼손 위험성
	public String gabo = "상감청자";
	protected String gahun = "모든 일에 최선을";
	
	public GrandFa(){
		System.out.println("할아버지 생성자");	
	}
	
	public GrandFa(int nai){
		System.out.println("할아버지 생성자");
		this.nai = nai;
	}
	
	public String say() {
		return "할아버지 말씀 : 어려울 수록 즐겨라";
	}
	
	public String eat() {
		return "밥은 맛있게....";
	}
	
	public int getNai() {
		return nai;
	}
}

// 9월 3일
// 생성자 오버로딩 : 같은 이름을 가지고 있는 생성자를 많이 만들면 된다
// 생성자를 아무것도 만들지 않으면 JVM이 기본 생성자를 만들어줌
// 모든 클래스는 object의 자손 , 근데 object도 객체로 만들어야해서 super(); 이라는 문장이 들어감

// 9월 5일
// this. (내거) super. (아빠거)
// this() super() 생성자
// super(1, "Hi") 매개변수로 1과 Hi 가 넘어감
// 생성자 오버로딩 파라미터 갯수가 틀리거나 타입이 틀리거나 하는 것
// 전역변수 = 멤버변수  
