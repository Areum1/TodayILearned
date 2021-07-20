class c_40 {
	String com;
	String model;
	String color;
	int high;
	int now;
	int speed;
	public static void main(String ar[]) {
		c_40 hw = new c_40();
		hw.com = "삼성";
		hw.model = "SW-9008";
		hw.color = "black";
		hw.high = 80;
		hw.now = 60;
		hw.speed = 70;

		System.out.println("제작회사 : "+hw.com);
		System.out.println("모델명 : "+hw.model);
		System.out.println("색상 : "+hw.color);
		System.out.println("최고속도 : "+hw.high);
		System.out.println("현재속도 : "+hw.now);
		System.out.println("현재속도 → 수정된 속도 : "+hw.speed);
	}
}