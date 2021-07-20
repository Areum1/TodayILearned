import java.util.*;
class c_39 {
public static void main(String ar[]){
	Scanner sc = new Scanner(System.in);
	String eng[];
	String kor[];
	String game;
	eng = new String[] { "happy","sad","upset","hungry","angry" };
	kor = new String[] { "행복한","슬픈","우울한","배고픈","화난" };
	while (true) {
		game = sc.next();
		if (game.equals("happy"))
		System.out.println(kor[0]);
		else if (game.equals("sad"))
		System.out.println(kor[1]);
		else if (game.equals("upset"))
		System.out.println(kor[2]);
		else if (game.equals("hungry"))
		System.out.println(kor[3]);
		else if (game.equals("angry"))
		System.out.println(kor[4]);
		else if (game.equals("exit"))
		break;
	}
}
}