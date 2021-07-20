
public class MyFamily {

	public static void main(String[] args) {
		
		//객체를 어떻게 만들어? 생성자 호출해서
		Father fa = new Father();
		fa.show();
		
		Me me = new Me();
		
		GrandFa gr = new GrandFa();
		
		System.out.println("==================");
		System.out.println("가보 "+gr.gabo);
		System.out.println("가훈 "+gr.gahun);
		System.out.println(gr.say());
		System.out.println(gr.eat());
		System.out.println();
		
		GrandFa gr1 = new GrandFa(88);
		
		System.out.println("=====상속 시작=====");
		System.out.println("아버지 나이 "+fa.getNai());
		System.out.println("아버지 집 "+fa.getHouse());
		System.out.println("가보 : "+fa.gabo);
		System.out.println("가훈 : "+fa.gahun);
		System.out.println(fa.say());
		System.out.println(fa.eat());
		
		System.out.println();
		
		System.out.println("내 집 : "+me.getHouse());
		System.out.println("가보 : "+me.gabo);
		System.out.println("가훈 : "+me.gahun);
		System.out.println(me.say());
		System.out.println(me.eat());
		
		me.biking();
		
		Father fa1 = new Me(); // Me가 가지고 있는 것들은 받지 못함 
		Me me1 = (Me)fa1; // Me에 있는 것들도 모두 사용할 수 있도록함 (동의 구하기)
		
	}
}
