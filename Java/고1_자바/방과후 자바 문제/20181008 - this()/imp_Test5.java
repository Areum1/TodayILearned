import java.util.*;
class Book {
	int number;
	String title;
	String author;
	Book(int num, String t, String au) {
		this.number = num;
		this.title = t;
		this.author = au;
	}
	public void setNum(int n){
		this.number = n;
	}
	public void setTitle(String t){
		this.title = t;
	}
	public void setAut(String a){
		this.author = a;
	}
	public int getNum(int n){
		return number;
	}
	public String getTitle(String t){
		return title;
	}
	public String getAut(String a){
		return author;
	}
	public void getLateFees(int d){
	}
}
////////////////////////////////////////////////////////////
class Novel extends Book {
	Novel(int n, String t, String a) {
		super(n,t,a);
	}
	public void getLateFees(int d) {
		System.out.println("내야할 돈은 "+300*d+" 원 입니다.");
	}
}
////////////////////////////////////////////////////////////
class Poet extends Book {
	Poet(int n, String t, String a) {
		super(n,t,a);
	}
	public void getLateFees(int d) {
		System.out.println("내야할 돈은 "+200*d+" 원 입니다.");
	}
}
////////////////////////////////////////////////////////////
class ScienceFiction extends Book {
	ScienceFiction(int n, String t, String a) {
		super(n,t,a);
	}
	public void getLateFees(int d) {
		System.out.println("내야할 돈은 "+600*d+" 원 입니다.");
	}
}
////////////////////////////////////////////////////////////
class imp_Test5 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner (System.in);
		Book b;
		System.out.print("1. Novel  2. Poet  3. ScienceFiction >> ");
		int maincho = sc.nextInt();
		System.out.print("관리번호를 입력하시오 : ");
		int num = sc.nextInt();
		System.out.print("제목을 입력하시오 : ");
		String ti = sc.next();
		System.out.print("저자를 입력하시오 : ");
		String wri = sc.next();
		System.out.print("연체된 날짜를 입력하시오 : ");
		int day = sc.nextInt();
		switch (maincho){
		case 1: 
			b = new Novel(num,ti,wri);
			b.getLateFees(day);
			break;
		case 2: 
			b = new Poet(num,ti,wri);
			b.getLateFees(day);
			break;
		case 3: 
			b = new ScienceFiction(num,ti,wri);
			b.getLateFees(day);
		}
	}
}