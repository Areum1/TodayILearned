import java.util.*;
class waterbill{
	public void print() {
		System.out.println("-------------Menu-------------");
		System.out.println("1. 가정용(liter당 50원)");
		System.out.println("2. 상업용(liter당 45원)");
		System.out.println("3. 공업용(liter당 30원)");
		System.out.println("------------------------------");
	}
	public void Line1() {
		System.out.println("------------------------------");
	}
}
////////////////////////////////////////////////////////////////
class imp_Test3{
	public static void main(String ar[]) {
		waterbill w = new waterbill();
		Scanner sc = new Scanner(System.in);
		w.print();
		System.out.print("메뉴를 선택하세요 => ");
		int menu = sc.nextInt();
		w.Line1();
		System.out.print("사용량을 입력하세요(liter) => ");
		String use = sc.next();
		w.Line1();
		System.out.println("사용자 코드: "+menu);
		switch(menu){
			case 1: 
		}
	}
}