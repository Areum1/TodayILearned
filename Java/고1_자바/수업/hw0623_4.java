class hw0623_4 {
public static void main(String ar[]){
	int arr [] = new int [10];
	int sum1=0,sum2=0;
	for (int i = 0; i <10; i++){
		System.out.println(ar[i]);
	arr[i] = Integer.parseInt(ar[i]);
	if (arr[i] % 2 == 0)
		sum1 = sum1 + arr[i];
	else 
		sum2 = sum2 + arr[i];
	}
	System.out.println("Â¦¼öÀÇ ÃÑÇÕÀº : "+sum1+" È¦¼öÀÇ ÃÑÇÕÀº : "+sum2);
}
}