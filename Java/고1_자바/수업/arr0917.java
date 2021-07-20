class arr0917 {
	int sum=0,num=0;
	public void plus(){
		int []a = new int[900];
		for(int i = 100; i<=999; i++) {
			a[i-100] = i;
			if(i%6==0){
				sum +=i;
				num++;
			}
		}
		System.out.println(sum+"\n"+num);
	}
	public static void main(String ar[]) {
		arr0917 arr = new arr0917();
		arr.plus();
	}
}