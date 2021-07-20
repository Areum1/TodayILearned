abstract public class Employee {

	protected String name;
	protected String id;

	public Employee(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public void gotoOffice() {
		System.out.println(name + "´Ô Ãâ±ÙÇÏ¼Ì½À´Ï´Ù.");
	}

	public void gotoHome() {
		System.out.println(name + "´Ô Åð±ÙÇÏ¼Ì½À´Ï´Ù.");
	}

	abstract public void startJob();
}