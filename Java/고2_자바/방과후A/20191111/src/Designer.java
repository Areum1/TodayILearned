public class Designer extends Employee {
	
	private String majorTech; // 주사용기술
	
	public Designer(String name, String id, String majorTech) {
		super(name, id);
		this.majorTech = majorTech;
	} 
	
	public void startJob() { // 메소드 오버라이딩
		System.out.println(name + "님이 디자인업무를 시작하셨습니다.");
	}
	
	public void dispMajorTech() {
		System.out.println(name + "님의 주 사용 기술은 " + majorTech + "입니다.");
	}
}