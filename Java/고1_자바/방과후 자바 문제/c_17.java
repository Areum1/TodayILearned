import java.util.*;
class c_17{
public static void main(String ar[]) {
	int count = 0, sum = 0,a;
	float avg = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
	while (true)
	{
		a = sc.nextInt();
		if(!(a==-1)){
			++count;
			sum = sum+ a;
		}
		else if(a==-1)
			break;
	}
	avg = sum /count;
	System.out.println("������ ������ "+count+"���̸� ����� "+avg+"�Դϴ�.");
}
}