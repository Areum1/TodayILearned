public class Programmer extends Employee {
	
	private int techGrade; // ����� ��� 1~4
	
	public Programmer(String name, String id, int techGrade) {
		super(name, id);
		this.techGrade = techGrade;
	}
	
	@Override
	public void startJob() {
		System.out.println(name + "���� SW���� ������ �����ϼ̽��ϴ�.");
	}
	
	public void dispGrade() {
		System.out.println(name + "���� ����� ����� " + techGrade + "�Դϴ�.");
	}
}