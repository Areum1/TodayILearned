import java.util.*;
Class Shapes {
	double area;
	final double PI = 3.141592;
}
Class Circle() extends Shapes {
	int n;
	double area;
	Circle (int a){
		this.n = a;
	} //Cirle �� ������
	public double getC() {
		return n*n*PI;
	}//getC 
}//Circle

Class Triangle() extends Shapes {
	int n,m;
	double area;
	Triangle (int a,int b){
		this.n = a;
		this.m = b;
	} //Triangle �� ������
	public double getT() {
		return (n*m)/2;
	}//getT 
}//Triangle

Class Trapezoid() extends Shapes {
	int n,m,s;
	double area;
	Trapezoid (int a,int b,int c){
		this.n = a;
		this.m = b;
		this.s = c;
	} //Triangle �� ������
	public double getTra() {
		return (n+m)*c/2;
	}//getTra
}//Trapezoid

Class menu() {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("**** �������� ****");
		while (true) {
		System.out.println("1.�ﰢ��\n2.��\n3.��ٸ���\n4.����");
		int n = sc.nextInt();
		switch (n){
		case 1: 
		case 2:
		case 3:
			default : System.exit(0); //����
		}//switch
		}//while
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	}
}