class Employee {
String name;
String num; //사원번호
Employee(String name, int num) {
	this.name = name;
	this.num = num;
}
void setName(String _name) {
	this.name = name;
}
String getName() {
	return name;
}
void setNum(String _num) {
	this.num = _num;
}
String getNum() {
	return num;
}
void computeSalary(){
	System.out.println(salary*12);
} //100*12개월
}