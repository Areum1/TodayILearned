public class Designer extends Employee {
	
	private String majorTech; // �ֻ����
	
	public Designer(String name, String id, String majorTech) {
		super(name, id);
		this.majorTech = majorTech;
	} 
	
	public void startJob() { // �޼ҵ� �������̵�
		System.out.println(name + "���� �����ξ����� �����ϼ̽��ϴ�.");
	}
	
	public void dispMajorTech() {
		System.out.println(name + "���� �� ��� ����� " + majorTech + "�Դϴ�.");
	}
}