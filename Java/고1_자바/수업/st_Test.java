class st_Test{
	public static void main(String ar[]){
		Student1 s = new Student1();
		s.name  ="Mike";
		s.grade = 17;
		s.sub = "java";
		System.out.println(s.name);
		System.out.println(s.grade);
		System.out.println(s.sub);
		s.study("����",8);
		s.study(s.sub,s.grade);
		s.sleep();
		s.play("����","ģ��");
	}
}