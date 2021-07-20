class c_15 {
public static void main(String ar[]) {
	int sum3 =0,sum1=0;
		for(int i = 1; i<=100; i++){
		if(!(i%3==0))
			sum3= i+sum3;
		if (!((i%3==0)||(i%5==0)||(i%7==0)))
			sum1= i + sum1;
		}
		System.out.println(sum3+"\n"+sum1);
}
}