
public class DBAnalyst extends Employee {
	
	private String dbms;
	
	public DBAnalyst (String name, String id, String dbms) {
		super(name,id);
		this.dbms = dbms;
	}
	
	public void dbAdmin() {
		System.out.println(name+" ���� ���� ������ "+dbms+"�Դϴ�");
	}

	@Override
	public void startJob() {
		System.out.println(name+" ���� �����ͺ��̽� ���������� �����ϼ̽��ϴ�.");
	}
}
