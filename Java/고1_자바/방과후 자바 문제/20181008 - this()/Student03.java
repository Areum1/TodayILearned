import java.util.*;

class Student02 {
	String name;
	int age;
	String phone;
	String skill;
	String addr;
	Student02 (String n, int a, String p, String s, String ad) {
		this.name = n;
		this.age = a;
		this.phone = p;
		this.skill = s;
		this.addr = ad;
	}
	public void setName(String n) { 
		this.name = n; }
	public String getName() {
		return name; }

	public void setAge(int a) { 
		this.age = a; }
	public int getAge() { 
		return age; }

	public void setSkill(String s) { 
		this.skill = s; }
	public String getSkill() { 
		return skill; }

	public void setPhone(String p) { 
		this.phone = p; }
	public String getPhone() { 
		return phone; }

	public void setAddr(String ad) { 
		this.addr = ad; }
	public String getAddr() { 
		return addr; }

	public void print(){
		System.out.print("--------------------------");
		System.out.print("이름 : "+name);
		System.out.print("나이 : "+age);
		System.out.print("전화번호 : "+phone);
		System.out.print("주특기 : "+skill);
		System.out.print("주소 : "+addr);
	}
}
class Student03{
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력인원 >> ");
		int num = sc.nextInt();
		Student02 s[] = new Student02[num];
		System.out.println("-------학생 정보 입력-------");

		for (int i = 0; i < s.length; i++){
			
		System.out.print("이름 >> ");
		String na = sc.next();

		System.out.print("나이 >> ");
		int ag = sc.nextInt();

		System.out.print("전화번호 >> ");
		String ph = sc.next();

		System.out.print("주특기 >> ");
		String sk = sc.next();

		System.out.print("주소 >> ");
		String add = sc.next();
		
		if (!(i == num))
		System.out.println("----------------------------");

		s[i] = new Student02(na,ag,ph,sk,add);

		s[i].setName(na);
		s[i].setAge(ag);
		s[i].setPhone(ph);
		s[i].setPhone(sk);
		s[i].setPhone(add);
		}
		for (int i = 0; i < s.length; i++){
			System.out.println("----------------------------");
			System.out.println("이름 : "+s[i].getName());
			System.out.println("나이 : "+s[i].getAge());
			System.out.println("전화번호 : "+s[i].getPhone());
			System.out.println("주특기 : "+s[i].getSkill());
			System.out.println("주소 : "+s[i].getAddr());
		}
		
	}
}