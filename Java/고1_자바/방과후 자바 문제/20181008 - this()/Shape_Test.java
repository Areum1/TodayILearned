import java.util.*;

abstract class DObject {
	abstract public void draw();
}

class Figure extends DObject {
	String type;

	public void draw() {
		//switch case가 깔끔쓰하다
		if (type.equals("Line"))
			System.out.println("Line");
		else if (type.equals ("Circle"))
			System.out.println("Circle");
		else if (type.equals("Rect"))
			System.out.println("Rectangle");
	}
}

class Menu {
	Scanner sc = new Scanner (System.in);
	Figure f[] = new Figure[10];
	public Menu() {
		for (int i = 0; i<f.length; i++)
			f[i] = new Figure();
	}

	public void Insert(int i) {
		System.out.print("도형 종류 Line(1), Rect(2), Circle(3) >> ");
		int number = sc.nextInt();
		switch (number) {
		case 1: f[i].type = "Line"; break;
		case 2: f[i].type = "Rect"; break;
		case 3: f[i].type = "Circle"; break;
		default : System.out.println("잘못입력하셨습니다.");
		}
	}
	public void View(int count) { //배열의 갯수
		for (int i = 0; i<count; i++)
			f[i].draw();
	}
	public void Exit() {
		System.exit(0);
	}
	public void Delete(int i) {
		System.out.print("삭제할 도형의 위치 >> ");
		int a = sc.nextInt();
		if (!((f[a-1].type).equals(""))){
			f[a-1].type = "";
		}
		else
			System.out.println("삭제할 값이 없습니다");

	}
}
class Shape_Test {
	public static void main(String ar[]) {
		Menu m = new Menu();
		int count = 0;
		Scanner sc = new Scanner (System.in);
		while (true){
		System.out.print("삽입[1] 삭제[2] 모두보기[3] 종료[4] >> ");
		int choice = sc.nextInt();
	switch (choice){
		case 1:
			m.Insert(count);
			count++;
			break;
		case 2:
			m.Delete(count);
			break;
		case 3:
			m.View(count);
			break;
		case 4:
			m.Exit();
			break;	
		}
		}
	}
}