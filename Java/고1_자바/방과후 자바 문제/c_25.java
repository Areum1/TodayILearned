import java.util.*;
class c_25 {
public static void main(String ar[]) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b,c;
	b = a/10;
	c = a-(a- a%10);
	if(b==c)
	System.out.println("같습니다");
	else
	System.out.println("다릅니다");
}
}