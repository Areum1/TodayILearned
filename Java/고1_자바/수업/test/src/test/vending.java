package test;

import java.util.*;
class vending { 
public static void main (String ar[]) {

	System.out.println("vending machine");
	System.out.println("=============================================================================");
	System.out.println("1. �ݶ� (600��) 2. ���ڿ��� (900��) 3. Ŀ�� (500��) 4. ���� (400��)");
	System.out.println("=============================================================================");
	Scanner sc = new Scanner (System.in);

	int sum= 0;
	int mon, dri, amo;
	String cho;
System.out.print("�ݾ��� �Է��ϼ��� : ");
	mon = sc.nextInt();

while(true){
	System.out.println();
	
	System.out.print("������ �Է��ϼ��� : ");
	dri = sc.nextInt();
	System.out.print("������ �Է��ϼ��� : ");
	amo = sc.nextInt();
	System.out.println("-----------------------------------------------------------------------------");
		if (dri == 1)
		{
			sum = mon -(600*amo);
			if(sum <= 0) {
				System.out.println("�ܾ��� �����մϴ�.");
				System.out.println("-----------------------------------------------------------------------------");
				break; }
			System.out.println("������ ����� �ݶ��Դϴ�");
			System.out.println("������ ���� "+"1000�� : "+(sum/1000)+" ,100�� : "+((sum%1000)/100));
		}

		else if (dri == 2)
		{
			sum = mon -(900*amo);
			if(sum <= 0) {
				System.out.println("�ܾ��� �����մϴ�.");
				System.out.println("-----------------------------------------------------------------------------");
				break; }
			System.out.println("������ ����� ���ڿ����Դϴ�");
			System.out.println("������ ���� "+"1000�� : "+(sum/1000)+" ,100�� : "+((sum%1000)/100));
		}

		else if (dri == 3)
		{
			sum = mon -(500*amo);
			if(sum <= 0) {
				System.out.println("�ܾ��� �����մϴ�.");
				System.out.println("-----------------------------------------------------------------------------");
				break; }
			System.out.println("������ ����� Ŀ���Դϴ�");
			System.out.println("������ ���� "+"1000�� : "+(sum/1000)+" ,100�� : "+((sum%1000)/100));
		}
		else if (dri == 4)
		{
			sum = mon -(400*amo);
			if(sum <= 0) {
				System.out.println("�ܾ��� �����մϴ�.");
				System.out.println("-----------------------------------------------------------------------------");
				break; }
			System.out.println("������ ����� �����Դϴ�");
			System.out.println("������ ���� "+"1000�� : "+(sum/1000)+" ,100�� : "+((sum%1000)/100)); 
		}
			System.out.print("�ٽ� �����ðڽ��ϱ�? (Y/N) ");
		cho = sc.next();
		if (cho.equals ("n")||cho.equals("N"))
		{
			break;
		}
		}
}
}