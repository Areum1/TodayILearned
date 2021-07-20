import java.util.*;
class j1110 {
public static void main(String ar[]){
	Scanner sc = new Scanner (System.in);
	String a[] = new	String[5];
	int b[] = new int[5];
	String ser;
	int sum = 0;
	int min = 0,max = 0,temp = 0,j;
	System.out.println("5개의 과목명을 입력하세요>>:");
	for (int i = 0; i<5; i++)
		a[i] = sc.next();
System.out.println("=================================");
System.out.println("5개의 점수를 입력하세요>>:");
min = max = b[0];
	for (j = 0;j <5;j++){
		b[j] = sc.nextInt();
	sum = b[j] +sum; 
	for (int k = j+1; k<5; k++)
	{
			if(b[j] > b[k]) {
			temp = b[j];
		b[j] = b[k];
		b[k] = b[j];
	}
	}
	if (b[0] != 0)
min = b[0];
max = b[4];
	}
	System.out.println("");
	System.out.println("=================================");
	System.out.println("과목총점>>"+sum);
	System.out.println("과목총점>>"+sum/5.0);
	System.out.println("최고점수>>"+max);
	System.out.println("최저점수>>"+min);
	System.out.println("\n=================================");
		System.out.println("검색할 과목명을 입력하세요: ");
		ser = sc.next();
		while (true)
		{
	if (ser.equals("java"))
	{
		System.out.println(ser+"의 점수: "+b[0]);
		System.out.print("검색할 과목명을 입력하세요: ");
		ser = sc.next();
	}
	else if (ser.equals("c"))
	{
		System.out.println(ser+"의 점수: "+b[1]);
		System.out.print("검색할 과목명을 입력하세요: ");
		ser = sc.next();
	}
	else if (ser.equals("c++"))
	{
		System.out.println(ser+"의 점수: "+b[2]);
		System.out.print("검색할 과목명을 입력하세요: ");
		ser = sc.next();
	}
	else if (ser.equals("spring"))
	{
		System.out.println(ser+"의 점수: "+b[3]);
		System.out.print("검색할 과목명을 입력하세요: ");
		ser = sc.next();
	}
	else if (ser.equals("jsp"))
	{
		System.out.println(ser+"의 점수: "+b[4]);
		System.out.print("검색할 과목명을 입력하세요: ");
		ser = sc.next();
	}
else if (ser == "그만")
{
	break;
}
		}
}
}