class Leader extends Student9 {
boolean yes = true;
boolean no = false;
public void hello() {
	System.out.println("�ȳ��ϼ���");
	}
public static void main(String ar[]){
	Leader L = new Leader();
	L.hello();
	if (L.yes)
	{
		System.out.println("�л�ȸ���Դϴ�");
	}
}
}