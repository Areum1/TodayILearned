abstract class Ship {
public abstract int Passengers();
public abstract int Luggage();
}
class ship1 extends Ship {
	public int Passengers() {
		return 10;
	}
	public int Luggage() {
		return 10;
	}
}
class ship2 {
	public static void main (String ar[]) {
		ship1 s = new ship1();
		System.out.println("최대 탑승 인원 : "+s.Passengers()+"명");
		System.out.println("최대 적재량 : "+s.Luggage()+"kg");
	}
}