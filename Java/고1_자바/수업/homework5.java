import java.util.*;
class homework5 { //UP&DOWN
public static void main (String ar[]) {
Random r = new Random();
int no = r.nextInt(100); //��ǻ�Ͱ� ������ ��
for (int i = 1; i<=10; i++)
{
	System.out.print("���ڸ� �Է��ϼ��� : ");
	Scanner sc = new Scanner (System.in);
	int n = sc.nextInt();
	if (no > n)
	{
		System.out.println("UP");
		continue;
	}
	if (no == n)
	{
		System.out.println("�¾ҽ��ϴ�");
		break;
	}
		if (no < n)
	{
		System.out.println("DOWN");
		continue;
	}
	else{
		System.out.println("Ʋ�Ƚ��ϴ�");
		continue;
	}
}
	System.out.println("������"+no);
	System.out.println("YOU LOSE");
}
}