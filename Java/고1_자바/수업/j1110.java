import java.util.*;
class j1110 {
public static void main(String ar[]){
	Scanner sc = new Scanner (System.in);
	String a[] = new	String[5];
	int b[] = new int[5];
	String ser;
	int sum = 0;
	int min = 0,max = 0,temp = 0,j;
	System.out.println("5���� ������� �Է��ϼ���>>:");
	for (int i = 0; i<5; i++)
		a[i] = sc.next();
System.out.println("=================================");
System.out.println("5���� ������ �Է��ϼ���>>:");
min = max = b[0];
	for (j = 0;j <5;j++){
		b[j] = sc.nextInt();
	sum = b[j] +sum; 
	for (int k = j+1; k<5; k++)
	{
			if(b[j] > b[k]) {
			temp = b[j];
		b[j] = b[k];
		b[k] = b[j];
	}
	}
	if (b[0] != 0)
min = b[0];
max = b[4];
	}
	System.out.println("");
	System.out.println("=================================");
	System.out.println("��������>>"+sum);
	System.out.println("��������>>"+sum/5.0);
	System.out.println("�ְ�����>>"+max);
	System.out.println("��������>>"+min);
	System.out.println("\n=================================");
		System.out.println("�˻��� ������� �Է��ϼ���: ");
		ser = sc.next();
		while (true)
		{
	if (ser.equals("java"))
	{
		System.out.println(ser+"�� ����: "+b[0]);
		System.out.print("�˻��� ������� �Է��ϼ���: ");
		ser = sc.next();
	}
	else if (ser.equals("c"))
	{
		System.out.println(ser+"�� ����: "+b[1]);
		System.out.print("�˻��� ������� �Է��ϼ���: ");
		ser = sc.next();
	}
	else if (ser.equals("c++"))
	{
		System.out.println(ser+"�� ����: "+b[2]);
		System.out.print("�˻��� ������� �Է��ϼ���: ");
		ser = sc.next();
	}
	else if (ser.equals("spring"))
	{
		System.out.println(ser+"�� ����: "+b[3]);
		System.out.print("�˻��� ������� �Է��ϼ���: ");
		ser = sc.next();
	}
	else if (ser.equals("jsp"))
	{
		System.out.println(ser+"�� ����: "+b[4]);
		System.out.print("�˻��� ������� �Է��ϼ���: ");
		ser = sc.next();
	}
else if (ser == "�׸�")
{
	break;
}
		}
}
}