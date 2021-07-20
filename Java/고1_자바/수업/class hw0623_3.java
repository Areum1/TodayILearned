class hw0623_5 {
public static void main(String ar[]){
	System.out.println(ar[0]);
	System.out.println(ar[1]);
	int sum=0, ave=0, num = 0;
	int a = Integer.parseInt(ar[0]);
	int b = Integer.parseInt(ar[1]);
	for (int i = a; i<=b; i++)
	{
		if(i%3==0 || i%7 == 0){
			sum = sum +i;
			num = num++;
		}
	}
	ave = sum / num;
	System.out.println("Че : "+sum+" ЦђБе : "+ave);
}