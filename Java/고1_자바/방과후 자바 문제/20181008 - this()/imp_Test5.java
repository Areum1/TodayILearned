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
		System.out.println("������ ���� "+300*d+" �� �Դϴ�.");
	}
}
////////////////////////////////////////////////////////////
class Poet extends Book {
	Poet(int n, String t, String a) {
		super(n,t,a);
	}
	public void getLateFees(int d) {
		System.out.println("������ ���� "+200*d+" �� �Դϴ�.");
	}
}
////////////////////////////////////////////////////////////
class ScienceFiction extends Book {
	ScienceFiction(int n, String t, String a) {
		super(n,t,a);
	}
	public void getLateFees(int d) {
		System.out.println("������ ���� "+600*d+" �� �Դϴ�.");
	}
}
////////////////////////////////////////////////////////////
class imp_Test5 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner (System.in);
		Book b;
		System.out.print("1. Novel  2. Poet  3. ScienceFiction >> ");
		int maincho = sc.nextInt();
		System.out.print("������ȣ�� �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		System.out.print("������ �Է��Ͻÿ� : ");
		String ti = sc.next();
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		String wri = sc.next();
		System.out.print("��ü�� ��¥�� �Է��Ͻÿ� : ");
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