import java.util.*;
class Account {
int mon;
	private String accountNo; //���¸�
	private String password;//��й�ȣ
	private String owner; //������
	private int balance;  //�ܰ�

	public void deposit(int x){ //�Ա��ϴ�
		System.out.println(x+"���� �ԱݵǾ����ϴ�.");
	} //�Ա�
	public void widthDraw(int y,int x) { //����ϴ�
	if(x>=y)
		System.out.println(y+"���� ��ݵǾ����ϴ�.");
} // ���
public static	 void main(String ar[]) {
	Scanner sc = new Scanner(System.in);
	Account a = new Account();
int mon=0;

	System.out.print("���¸��� �Է��ϼ���  : ");
	String acc = sc.next();
	a.accountNo = acc;
	System.out.print("��й�ȣ�� �Է��ϼ��� : ");
	String pw = sc.next();
	a.password = pw;
	System.out.print("�����ָ� �Է��ϼ��� : ");
	String ow = sc.next();
	a.owner = ow;

		System.out.println("\n"+"�Է��� ������ Ȯ���ϰڽ��ϴ�.");
		while(true) {
	System.out.print("���¸��� �Է��ϼ���  : ");
	String acc1 = sc.next();
	System.out.print("��й�ȣ�� �Է��ϼ��� : ");
	String pw1 = sc.next();
	System.out.print("�����ָ� �Է��ϼ��� : ");
	String ow1 = sc.next();
	if (acc1.equals(acc) && pw1.equals(pw) && ow1.equals(ow)) {
		System.out.println("�Է��� ���� ��ΰ� �¾ҽ��ϴ�.");
	break;
	}
	else{
		System.out.print("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է� �Ͻðڽ��ϱ�? : ");
		String cho = sc.next();
		if (cho.equals("n") || cho.equals("N"))
			break;
	}
		}

		while (true)
		{
	System.out.println("\n"+"1. �Ա� | 2. ��� | 3. �ܰ�Ȯ�� | 4. ��");
		int num = sc.nextInt();
	if (num == 1){
		int x;
		x = sc.nextInt();
	 mon = mon+ x;
	 a.deposit(x);
	}
	else if (num == 2){
	int y;
		y = sc.nextInt();
		if (mon< y)
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
		else
		mon = mon - y;
		a.widthDraw(y,mon);
	}
	else if (num == 3){
		  a.balance = mon;
			System.out.println(mon+"��");
	}
	else if (num == 4)
		break;
	else
		System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
} // ����
} // Ŭ����