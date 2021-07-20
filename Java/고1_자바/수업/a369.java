class a369{
public static void main(String ar[]){
	int a[] = new int [100];
		int i;
		for (i = 0; i<a.length; i++)
		{
			a[i] = i+1;
		}
		for (int n = 0; n<a.length; n++)
		{
			if(a[i] %10 == 3 || a[i] %10 == 6 || a[i] %10 == 9)
				System.out.println(a[i]+"¦");
			if(a[i] /10 == 3 || a[i] /10 == 6 || a[i] /10 == 9)
				System.out.println("¦");
		}
	}
}