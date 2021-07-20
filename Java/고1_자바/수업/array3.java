class array3 { 
public static void main (String ar[]) { 
	int a[]  = new int [5];
	int i;
	int sum=0;
	for (i = 0; i < 5; i++)
	{
		a[i] = i+1;
		System.out.println("a["+i+"]"+"="+(i+1));
		sum = (i+1) + sum;
	}
	System.out.println("รัวี : "+sum);
	}
}