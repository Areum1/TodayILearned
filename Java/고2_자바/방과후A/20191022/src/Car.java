
abstract public class Car {
	
	String color;
	int door;
	
	void drive() {
		System.out.println("�����ϴ�");
	}
	
	void stop() {
		System.out.println("���ߴ�");
	}
	
	abstract void special();
}

class FireEngine extends Car {
	void special() {
		System.out.println("�� �߻�~");
	}
}

class Ambulance extends Car {
	void special() {
		System.out.println("���̷�~");
	}
}

class PoliceCar extends Car{
	void special() {
		System.out.println("�߻ǻ߻�~");
	}
}

class BloodCar extends Car{
	void special() {
		System.out.println("�����~");
	}
}