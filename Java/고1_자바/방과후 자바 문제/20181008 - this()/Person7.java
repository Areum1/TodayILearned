class Person7 {
	String name;
	int age;
	int height;

	Person7 (String name,int age, int height) {
		this(name,age);
	}
	Person7 (String name,int age) {
		this(age);
		this.name = "Tom";
	}
	Person7(int age) {
		this();
		this.age = age;
	}
	Person7() {
		this.height = 175;
		this.name = "Alice";
	}
public void eat(String s) {
	System.out.println("ธิดู");
}
public static void main(String ar[]) {
	Person7 p = new Person7("Mike",30,180);
	System.out.println("dfjanfdn");
}
}
//25-26-6-7-9-10-13-14-18-19-20-21-15-16-11-12-8-27-28