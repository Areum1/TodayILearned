class sum4 {
	int sum = 0;
	public int add(int i){
		for (i = 1; i<=10; i++)
			sum += i;
		return sum;
	}
	public static void main(String ar[]){
		sum4 s = new sum4();
		System.out.println(s.add(1));
	}
}