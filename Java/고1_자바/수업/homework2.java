import java.util.*;
class homework2 { //�̸�,����,n�� �Է¹޾� �̸�,����,n�� ���
public static void main (String ar[]) {

	System.out.print("�̸��� �Է��Ͻÿ� : ");
	Scanner sc = new Scanner (System.in);
	String n = sc.next();

	System.out.print("���̸� �Է��Ͻÿ� : ");
	int i = sc.nextInt();

	System.out.print("�ݺ��ϰ� ���� Ƚ���� �Է��Ͻÿ� : ");
	int j = sc.nextInt();

		int a = 1;
		do
		{
			System.out.println("�̸� : "+n+" & "+"���� : "+i);
			a++;
		}
		while (a<=j);
}
}