import java.util.*;
class imp_Test4 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner (System.in);
		String id = "Test";
		String pw = "hansegae";
		System.out.print("���̵� �Է��ϼ��� : ");
		String id_t = sc.next();
		System.out.print("��й�ȣ�� �Է��ϼ��� : ");
		String pw_t = sc.next();
		
		if (id.equals(id_t) && pw.equals(pw_t))
			System.out.println("�α��εǾ����ϴ�");
		else if (!id.equals(id_t) || !pw.equals(pw_t)){
			while (true){
				System.out.println("---------------------------------------");
				System.out.println("���̵� �Ǵ� ��й�ȣ�� �ٽ� Ȯ���ϼ���. \n��ϵ��� ���� ���̵�ų� �߸� �Է��ϼ̽��ϴ�.");
				System.out.print("���̵� �ٽ� �Է��ϼ��� : ");
				id_t = sc.next();
				System.out.print("��й�ȣ�� �ٽ� �Է��ϼ��� : ");
				pw_t = sc.next();
				if(id.equals(id_t) && pw.equals(pw_t)){
					System.out.println("---------------------------------------");
					System.out.println("�α��εǾ����ϴ�");
					break;
					}
			}//while
		}//else if 
	}//main
}//class