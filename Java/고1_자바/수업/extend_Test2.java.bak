class Person10 {
String name;
String addr;
String tel;

public void setName(String _name) {
	this.name = _name;
}
public void setAddr(String _addr) {
	this.addr = _addr;
}
public void setTel(String _tel) {
	this.tel = _tel;
}
public String getName() {
	return name;
}
public String getAddr() {
	return addr;
}
public String getTel(){
	return tel;
}

} //상위 클래스

class Customer extends Person10 {
String customNum;//고객번호
int mileage;//마일리지
public Customer(String _name, String _addr, String _tel, String _customNum, int _mileage) {
	this.name = _name;
	this.addr = _addr;
	this.tel = _tel;
	this.customNum =  _customNum;
	this.mileage =  _mileage;
}

} //Customer

public class extend_Test2 {
public static void main(String[] args) {
Customer c1 = new Customer("Tom", "101-412", "#82-622-8909", "10249304", 100);
	System.out.println(c1.name);
	System.out.println(c1.addr);
	System.out.println(c1.tel);
	System.out.println(c1.customNum);
	System.out.println(c1.mileage);
	} // extend 테스트의 메인
} // extend 테스트