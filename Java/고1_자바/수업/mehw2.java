class mehw2 {
	public void greeting(int x) {
		if(x == 1)
			System.out.println("�ȳ��ϼ���");
		else if(x == 2)
			System.out.println("�¸��");
		else if(x == 3)
			System.out.println("�ö�");
		else if(x == 4)
			System.out.println("���ġ��");
		else
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
	} //subtract
	public static void main(String ar[]) {
		mehw2 hw = new mehw2();
			hw.greeting(2);
	} //main
} //class