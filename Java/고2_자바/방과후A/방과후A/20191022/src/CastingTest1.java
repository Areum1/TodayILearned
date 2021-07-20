
public class CastingTest1 {
	public static void main(String[] args) {
		
		/* 주석 1
		Car car;
		FireEngine fe1 = new FireEngine();
		FireEngine fe2;
		
		car = fe1; //업캐스팅 (상속 관계라면 에러가 안남)
		//car.special();
		fe2 = (FireEngine)car; //다운 캐스팅
		fe2.special();*/
		
		/* 주석 2
		Car car = new Ambulance(); //업캐스팅
		car.special();
		Ambulance am2 = (Ambulance)car; // 다운캐스팅
		am2.special(); */
		
		/*
		Car car = new FireEngine();
		Car car = new Ambulance();
		Car car = new PoliceCar();
		
		if(car instanceof FireEngine) {
			System.out.println("소방차는 ");
			
		}
		else if(car instanceof Ambulance) {
			System.out.println("앰블런스는 ");
		}
		else if(car instanceof PoliceCar) {
			System.out.println("경찰차는 ");
		}
		car.special(); */
		
		Car car[] = new Car[4];
		car[0] = new FireEngine();
		car[1] = new Ambulance();
		car[2] = new PoliceCar();
		car[3] = new BloodCar();
		
		for(int i = 0; i<car.length; i++) {
			Car car1 = car[i];
		
			if(car1 instanceof FireEngine) {
				System.out.print("소방차는 ");
			}
			else if(car1 instanceof Ambulance) {
				System.out.print("앰블런스는 ");
			}
			else if(car1 instanceof PoliceCar) {
				System.out.print("경찰차는 ");
			}
			else if(car1 instanceof BloodCar) {
				System.out.print("헌혈차는 ");
			}
			car1.special();
		}
		
	}
}
