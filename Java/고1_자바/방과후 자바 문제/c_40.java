class c_40 {
	String com;
	String model;
	String color;
	int high;
	int now;
	int speed;
	public static void main(String ar[]) {
		c_40 hw = new c_40();
		hw.com = "�Ｚ";
		hw.model = "SW-9008";
		hw.color = "black";
		hw.high = 80;
		hw.now = 60;
		hw.speed = 70;

		System.out.println("����ȸ�� : "+hw.com);
		System.out.println("�𵨸� : "+hw.model);
		System.out.println("���� : "+hw.color);
		System.out.println("�ְ�ӵ� : "+hw.high);
		System.out.println("����ӵ� : "+hw.now);
		System.out.println("����ӵ� �� ������ �ӵ� : "+hw.speed);
	}
}