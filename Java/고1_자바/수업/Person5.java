class Person5 {
	private String name;
	private int age;
public void setName(String name) { //값 넣어줌 , 대부분 return 값이 없음, 대부분 매개변수 있음
	this.name = name;
}
public String getName() { //값 뽑음, 대부분 return 있고, 매개변수 없음
	return name;
}
public Person5(String name){
	this.name = name;
}
public String eat() {
	return("먹다");
}
public void pr() {
	System.out.println(name);
	System.out.println(age);
}
public static void main(String ar[]) {
	Person5 p1 = new Person5();
	Person5 p2 = new Person5("John");
	System.out.println(p1.getName());
	p3.eat();
	p1.pr();
	p1.pr();
}
}