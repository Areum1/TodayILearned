
public class CastingTest1 {
	public static void main(String[] args) {
		
		/* �ּ� 1
		Car car;
		FireEngine fe1 = new FireEngine();
		FireEngine fe2;
		
		car = fe1; //��ĳ���� (��� ������ ������ �ȳ�)
		//car.special();
		fe2 = (FireEngine)car; //�ٿ� ĳ����
		fe2.special();*/
		
		/* �ּ� 2
		Car car = new Ambulance(); //��ĳ����
		car.special();
		Ambulance am2 = (Ambulance)car; // �ٿ�ĳ����
		am2.special(); */
		
		/*
		Car car = new FireEngine();
		Car car = new Ambulance();
		Car car = new PoliceCar();
		
		if(car instanceof FireEngine) {
			System.out.println("�ҹ����� ");
			
		}
		else if(car instanceof Ambulance) {
			System.out.println("�ں����� ");
		}
		else if(car instanceof PoliceCar) {
			System.out.println("�������� ");
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
				System.out.print("�ҹ����� ");
			}
			else if(car1 instanceof Ambulance) {
				System.out.print("�ں����� ");
			}
			else if(car1 instanceof PoliceCar) {
				System.out.print("�������� ");
			}
			else if(car1 instanceof BloodCar) {
				System.out.print("�������� ");
			}
			car1.special();
		}
		
	}
}
