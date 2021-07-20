class sum2 {
	int sum = 0;
	public void add(int i){
		for (i = 1; i<=10; i++)
			sum += i;
		System.out.println(sum);
	}
	public static void main(String ar[]){
		sum2 s = new sum2();
		s.add(1);
	}
}