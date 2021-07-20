class arr0917_2{
	int even=0,odd=0;
	public void plus(){
		int []a = new int[30];
		for(int i = 1; i<=30; i++) {
			a[i-1] = i;
			if(a[i-1]%2==0)
				even +=i;
			else if (a[i-1]%2==1)
			odd += i;
		}
		System.out.println(even+"\n"+odd);
	}
	public static void main(String ar[]) {
		arr0917_2 arr = new arr0917_2();
		arr.plus();
	}
} //class