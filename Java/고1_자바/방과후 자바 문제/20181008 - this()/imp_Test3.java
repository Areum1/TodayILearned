import java.util.*;
class waterbill{
	public void print() {
		System.out.println("-------------Menu-------------");
		System.out.println("1. ������(liter�� 50��)");
		System.out.println("2. �����(liter�� 45��)");
		System.out.println("3. ������(liter�� 30��)");
		System.out.println("------------------------------");
	}
	public void Line1() {
		System.out.println("------------------------------");
	}
}
////////////////////////////////////////////////////////////////
class imp_Test3{
	public static void main(String ar[]) {
		waterbill w = new waterbill();
		Scanner sc = new Scanner(System.in);
		w.print();
		System.out.print("�޴��� �����ϼ��� => ");
		int menu = sc.nextInt();
		w.Line1();
		System.out.print("��뷮�� �Է��ϼ���(liter) => ");
		String use = sc.next();
		w.Line1();
		System.out.println("����� �ڵ�: "+menu);
		switch(menu){
			case 1: 
		}
	}
}