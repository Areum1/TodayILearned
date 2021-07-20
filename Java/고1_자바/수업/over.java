class over {
	public void add(int x, int y){
		System.out.println(x+y);
	}
	public void add(String x, String y,String z){
		System.out.println(x+y+z);
	}
	public void add(int x, int y,double z){
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	public static void main(String ar[]){
		over o = new over();
		o.add(5,3);
		o.add("java","c","html");
		o.add(3,5,2.7);
	}
}
