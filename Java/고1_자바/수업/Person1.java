class Person1 {
String name;
int age;
public void sleep(){
	System.out.println("¿‹¥Ÿ");
}
public void play(){
	System.out.println("≥Ì¥Ÿ");
}
public static void main(String ar[]) {
		Person1 p1 = new Person1();
		p1.name = "Mike";
		p1.age = 20;
		System.out.println(p1.name);
		System.out.println(p1.age);
		p1.sleep();
		p1.play();
			System.out.println();
		Person1 p2 = new Person1();
		p2.name = "Tom";
		p2.age = 30;
		System.out.println(p2.name);
		System.out.println(p2.age);
		p2.sleep();
		p2.play();
}
}
