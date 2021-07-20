/* work()라는 추상적 메소드가 있는 Employee 인터페이스 프로그램을 작성하라 함수의 리턴타입은 문자열로 하라
Employee 인터페이스를 구현하는 Saleman 클래스를 작성하라 */
interface Employee {
	public String work();
}
class Saleman implements Employee {
	public String work(){
		return "아름";
	}
	public static void main (String ar[]) {
		Saleman s = new Saleman();
		System.out.println(s.work());
	}
}