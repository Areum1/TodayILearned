class Student {
	String name;
	int grade, money;

	Student(String name,int grade, int money) {
		this.name = name;
		this.grade = grade;
		this.money = money;
	}

	public void takeBus(Bus bus) {
		bus.take(1000);
		money -= 1000;
	}

	public void showInfo() {
		System.out.println(name+"�� ���� ���� "+money)"+�Դϴ�");
	}

	public static void main(String ar[]) {

	}
}