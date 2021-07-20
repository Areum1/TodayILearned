import java.util.*;
class c_29 {
public static void main(String ar[]) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int ten = a/10;
	int one = a-((a/10)*10);
	int i=0;
	if (one == 3 || one == 6 || one == 9)
		i++;
	if (ten ==3 || ten ==6|| ten ==9)
		i++;
		if(i==2)
			System.out.println("¹Ú¼ö Â¦Â¦");
		else if(i==1)
			System.out.println("¹Ú¼ö Â¦");
	}
}