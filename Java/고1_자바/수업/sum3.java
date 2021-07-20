class sum3 {
	int sum = 0;
	public int add(){
		for (int i = 1; i<=10; i++)
			sum += i;
		return sum;
	}
	public static void main(String ar[]){
		sum3 s = new sum3();
		System.out.println(s.add());
	}
}