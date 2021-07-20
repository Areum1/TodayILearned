import java.util.*;
class hw0623_1 {
public static void main (String ar[]){
	Scanner sc =  new Scanner(System.in);
	int a[][] = new int [5][6];
	int i,j;
	for (i = 0; i<5; i++) {
		for (j = 0; j<6; j++) {
			switch (j) {
			case 0: System.out.print("학번을 입력하세요 : "); break;
			case 1: System.out.print("국어점수를 입력하세요 : "); break;
				case 2: System.out.print("영어점수를 입력하세요 : "); break;
				case 3: System.out.print("수학점수를 입력하세요 : "); break;
				case 4: a[i][j] = a[i][1] + a[i][2] + a[i][3]; break;
				case 5: a[i][j] = a[i][4] /4; break; }
			if(j<4)
			a[i][j] = sc.nextInt();
		}	}
		System.out.println("학번	국어	영어	수학	총점	평균");
	System.out.println("==============================================");
System.out.print(" "+a[0][0]+"   \t");
	System.out.print(" "+a[0][1]+"   \t");
	System.out.print(" "+a[0][2]+"   \t");
	System.out.print(" "+a[0][3]+"   \t");
	System.out.print(" "+a[0][4]+"   \t");
	System.out.println(" "+a[0][5]+"  ");

	System.out.print(" "+a[1][0]+"   \t");
	System.out.print(" "+a[1][1]+"   \t");
	System.out.print(" "+a[1][2]+"   \t");
	System.out.print(" "+a[1][3]+"   \t");
	System.out.print(" "+a[1][4]+"   \t");
	System.out.println(" "+a[1][5]+"  ");

System.out.print(" "+a[2][0]+"   \t");
	System.out.print(" "+a[2][1]+"   \t");
	System.out.print(" "+a[2][2]+"   \t");
	System.out.print(" "+a[2][3]+"   \t");
	System.out.print(" "+a[2][4]+"   \t");
	System.out.println(" "+a[2][5]+"  ");

	System.out.print(" "+a[3][0]+"   \t");
	System.out.print(" "+a[3][1]+"   \t");
	System.out.print(" "+a[3][2]+"   \t");
	System.out.print(" "+a[3][3]+"   \t");
	System.out.print(" "+a[3][4]+"   \t");
	System.out.println(" "+a[3][5]+"  ");

	System.out.print(" "+a[4][0]+"   \t");
	System.out.print(" "+a[4][1]+"   \t");
	System.out.print(" "+a[4][2]+"   \t");
	System.out.print(" "+a[4][3]+"   \t");
	System.out.print(" "+a[4][4]+"   \t");
	System.out.println(" "+a[4][5]+"  ");

	}
}