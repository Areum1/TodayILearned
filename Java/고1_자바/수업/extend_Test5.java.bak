class Employee {
String name;
String num; //사원번호
public void setName(String _name) {
	this.name = _name;
}
public void setNum(String _num) {
	this.num = _num;
}
public String getName() {
	return name;
}
public String getNum() {
	return num;
}
Employee(String name, String num){
this.name = name;
this.num = num;
}
public void computeSalary(double Salary) { //100*12개월 급여계산
System.out.println(Salary*12);
}
}

class SalariedEmployee extends Employee {
SalariedEmployee(String _name, String _num){
super(_name,_num);
}
double salary; //월급
public void setSalary(double _salary) {
	this.salary = _salary;
}
public double getSalary() {
	return salary;
}
public void computeSalary(){
	System.out.println(salary*12);
}
} 


public class extend_Test5 {
public static void main(String[] args) {
	Employee e01 = new Employee("Sam", "01");
	SalariedEmployee e02 = new SalariedEmployee("Bob", "02");
	System.out.print("직원의 이름은 : "+e01.name+", 사원번호는 : "+e01.num+", 급여는 : ");
	e01.computeSalary(100.0);
	System.out.println();
	System.out.print("직원의 이름은 : "+e02.name+", 사원번호는 : "+e02.num+", 급여는 : ");
	e02.computeSalary(200.0);
	System.out.println();
	} //main
} //extend_Test5