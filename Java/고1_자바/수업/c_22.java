import java.util.*;
class c_22 {
public static void main(String ar[]) {
	int sum=0,money = 0;
	System.out.println("1.����, 2.���, 3.�ܰ�, 4. ����");
	Scanner sc = new Scanner (System.in);
	while(true){
System.out.print("��ȣ�� �Է��ϼ��� : ");
	int i = sc.nextInt();
	if(i == 1){
		System.out.print("�Ա��� �ݾ� : ");
		money = sc.nextInt();
		sum += money;
	}
	else if(i==2){
		while(true){
		System.out.print("����� �ݾ� : ");
		money = sc.nextInt();
		sum -= money;
		if(sum <=0){
			System.out.println("���� �����մϴ� �ٽ� �Է��ϼ���.");
			sum += money;
		}
		}
	}
	else if(i==3)
		System.out.println("���� �ܰ� : "+sum);
	else if (i ==4)
	break;
	else
		System.out.println("�߸� �Է��ϼ̽��ϴ�");
}
}
}