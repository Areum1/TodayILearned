public class Programmer extends Employee {
	
	private int techGrade; // 기술자 등급 1~4
	
	public Programmer(String name, String id, int techGrade) {
		super(name, id);
		this.techGrade = techGrade;
	}
	
	@Override
	public void startJob() {
		System.out.println(name + "님이 SW개발 업무를 시작하셨습니다.");
	}
	
	public void dispGrade() {
		System.out.println(name + "님의 기술자 등급은 " + techGrade + "입니다.");
	}
}