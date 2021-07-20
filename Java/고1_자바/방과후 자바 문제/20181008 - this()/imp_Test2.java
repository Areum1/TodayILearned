class Car {
	String name;
	int exhaust;
	Car(String n, int e) {
		this.name = n;
		this.exhaust = e;
	}
	public void horn(){
		System.out.println("���~~");
	}
}
///////////////////////////////////////////////////
class Truck extends Car {
	int carry = 0;
	Truck(String n, int e,int ca) {
		super(n,e);
		this.carry = ca;
	}
	public void horn(){
		System.out.println("����!");
	}
	public void load() {
		carry++;
	}
}
///////////////////////////////////////////////////
class Sportcar extends Car {
	Sportcar(String n, int e) {
		super(n,e);
	}
	public void horn(){
		System.out.println("�ѾƾӖؾ�!");
	}
}
class imp_Test2{
	public static void main(String ar[]) {
		Car c = new Car("����",100);
		Car c1 = new Truck("���",100,23);
		Car c2 = new Sportcar("�����",29);
		c.horn();
		c1.horn();
		c2.horn();
	}
}