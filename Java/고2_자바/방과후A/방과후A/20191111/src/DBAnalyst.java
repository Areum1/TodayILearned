
public class DBAnalyst extends Employee {
	
	private String dbms;
	
	public DBAnalyst (String name, String id, String dbms) {
		super(name,id);
		this.dbms = dbms;
	}
	
	public void dbAdmin() {
		System.out.println(name+" 님의 관리 서버는 "+dbms+"입니다");
	}

	@Override
	public void startJob() {
		System.out.println(name+" 님이 데이터베이스 관리업무를 시작하셨습니다.");
	}
}
