class daniel_Test2{
public static void main(String ar[]){
	//매개변수로 어케 입력받나요??ㄴ
	System.out.println(ar[0]);
	int a = Integer.parseInt(ar[0]);
	if (a> 0)
	 System.out.println("양수");

	else if (a== 0)
	 System.out.println("0");

	else if (a< 0)
	 System.out.println("음수");
}
}