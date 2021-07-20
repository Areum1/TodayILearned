/*Meter 인터페이스는 start와 stop 이라는 추상메서드를 가지고 있습니다
stop메서드는 달린거리에 해당하는 값을 매개변수로 받아 요금을 인트형으로 반환
meter인터페이스를 구현하는 택시 클래스를 완성해보세요*/

interface Meter {
	public void start();
	public int stop(int distance);  
}
class Taxi implements Meter {
	public void start() {
	}
	public int stop(int distance){
		return distance*2;
	}
	public static void main(String ar[]) {
		Taxi t = new Taxi();
		System.out.println(t.stop(3000));
	}
}