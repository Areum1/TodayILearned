class dog2 extends Animal2 {
	public void bark() {
		System.out.println("¢��");
	}
	public void eat() {
		System.out.println("��Ḧ �Դ�");
	}
	public static void main(String ar[]) {
		dog2 d = new dog2();
		d.name = "��";
		d.leg = "4��";
		d.eat();
		System.out.println(d.name);
		System.out.println(d.leg);
	}
}