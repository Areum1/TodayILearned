class Employee {
String name;
String num; //�����ȣ
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
public void computeSalary(double Salary) { //100*12���� �޿����
System.out.println(Salary*12);
}
}

class SalariedEmployee extends Employee {
SalariedEmployee(String _name, String _num){
super(_name,_num);
}
double salary; //����
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
	System.out.print("������ �̸��� : "+e01.name+", �����ȣ�� : "+e01.num+", �޿��� : ");
	e01.computeSalary(100.0);
	System.out.println();
	System.out.print("������ �̸��� : "+e02.name+", �����ȣ�� : "+e02.num+", �޿��� : ");
	e02.computeSalary(200.0);
	System.out.println();
	} //main
} //extend_Test5