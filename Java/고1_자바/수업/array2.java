class array2 { 
public static void main (String ar[]) {
	int a[]  = new int [5];
	int i;
	for (i = 0; i <= a.length; i++)
	{
		a[i] = i+1;
		System.out.println("a["+i+"]"+"="+(i+1));
	}
	}
}