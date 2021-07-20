
abstract public class Car {
	
	String color;
	int door;
	
	void drive() {
		System.out.println("øÓ¿¸«œ¥Ÿ");
	}
	
	void stop() {
		System.out.println("∏ÿ√ﬂ¥Ÿ");
	}
	
	abstract void special();
}

class FireEngine extends Car {
	void special() {
		System.out.println("π∞ πﬂªÁ~");
	}
}

class Ambulance extends Car {
	void special() {
		System.out.println("ΩŒ¿Ã∑ª~");
	}
}

class PoliceCar extends Car{
	void special() {
		System.out.println("ªﬂª«ªﬂª«~");
	}
}

class BloodCar extends Car{
	void special() {
		System.out.println("ªÁ∂˚¿ª~");
	}
}