class Student1 {
	String name,class1;
	int grade;

	Student1(){
		this.name = name;
		this.grade = grade;
		System.out.println(name+"\n"+grade);
	}

	Student1(String name) {
		this(name,1);
	}

	Student1(String name, int grade){
		this();
	}

public static void main (String ar[]) {
	Student1 s = new Student1 ("Mike");
	//19-20-11-12-15-16-5-6-7-8-9-17-13-21
}
}