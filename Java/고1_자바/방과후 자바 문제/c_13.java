import java.util.*;
class c_13 {
public static void main(String ar[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("점수를 입력하시오 : ");
	int a =sc.nextInt();
	switch (a/10)
	{
	case 10: case 9: System.out.println("A"); break;
	case 8: case 7: System.out.println("B"); break;
		case 6: case 5: System.out.println("C"); break;
		case 4: System.out.println("D"); break;
		default: System.out.println("E");
	}
}
}