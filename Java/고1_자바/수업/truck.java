class Car10 {
String carname;
String color;
int velocity; //속도

public void speedUp() {
} //5씩 증가
public void speeddown(){
} //5씩 감소
}
class truck extends Car10
{
	int load;

public static void main (String ar[]){
	Car10 car = new Car10();
	car.carname = "프론티어";
	car.color = "검정색";
	truck t = new truck();
	t.load = 3;
	System.out.println("나의 트럭은 "+car.color+"이다.");
	System.out.println(car.carname+"는 " +t.load+"톤을 실을 수 있다.");
	} //class
}