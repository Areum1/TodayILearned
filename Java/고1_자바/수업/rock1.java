import java.util.*;
class rock1{
public static void main (String ar[]) {
	Scanner sc = new Scanner (System.in);
	System.out.println("����������");
		System.out.print("�ٵ� : ");
	String a = sc.next();
		System.out.print("�ټ� : ");
	String b = sc.next();

if (a.equals ("����") || b.equals ("����"))
	System.out.println("�ټ��̰� �̰���ϴ�.");

else if (a.equals ("����") || b.equals ("��"))
	System.out.println("�ٵ��̰� �̰���ϴ�.");

else if (a.equals ("����") || b.equals ("����"))
	System.out.println("�����ϴ�");

else if (a.equals ("����") || b.equals ("����"))
	System.out.println("�ٵ��̰� �̰���ϴ�.");

else if (a.equals ("����") || b.equals ("��"))
	System.out.println("�ټ��̰� �̰���ϴ�.");

else if (a.equals ("����") || b.equals ("����")) 
	System.out.println("�����ϴ�.");

else if (a.equals ("��") || b.equals ("����")) 
	System.out.println("�ټ��̰� �̰���ϴ�.");

else if (a.equals ("��") || b.equals ("����"))
	System.out.println("�ٵ��̰� �̰���ϴ�.");

else if (a.equals ("��") || b.equals ("��")) 
	System.out.println("�����ϴ�.");

}
}