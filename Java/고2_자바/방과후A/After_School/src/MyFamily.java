
public class MyFamily {

	public static void main(String[] args) {
		
		//��ü�� ��� �����? ������ ȣ���ؼ�
		Father fa = new Father();
		fa.show();
		
		Me me = new Me();
		
		GrandFa gr = new GrandFa();
		
		System.out.println("==================");
		System.out.println("���� "+gr.gabo);
		System.out.println("���� "+gr.gahun);
		System.out.println(gr.say());
		System.out.println(gr.eat());
		System.out.println();
		
		GrandFa gr1 = new GrandFa(88);
		
		System.out.println("=====��� ����=====");
		System.out.println("�ƹ��� ���� "+fa.getNai());
		System.out.println("�ƹ��� �� "+fa.getHouse());
		System.out.println("���� : "+fa.gabo);
		System.out.println("���� : "+fa.gahun);
		System.out.println(fa.say());
		System.out.println(fa.eat());
		
		System.out.println();
		
		System.out.println("�� �� : "+me.getHouse());
		System.out.println("���� : "+me.gabo);
		System.out.println("���� : "+me.gahun);
		System.out.println(me.say());
		System.out.println(me.eat());
		
		me.biking();
		
		Father fa1 = new Me(); // Me�� ������ �ִ� �͵��� ���� ���� 
		Me me1 = (Me)fa1; // Me�� �ִ� �͵鵵 ��� ����� �� �ֵ����� (���� ���ϱ�)
		
	}
}
