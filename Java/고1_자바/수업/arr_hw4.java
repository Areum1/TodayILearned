class arr_hw4{
public static void main(String ar[]){
	int a[] =  {4,5,1,3,2};
	int sum	;
                     
	for (int i = 0; i <=4; i++)
	{
		if (a[i] > a[i+1])
		{
			sum = a[i+1];
			a[i+1] = a[i];
			a[i] = sum;
		}
		else 
			continue;
		System.out.println(a[i]);
	}
	}
}