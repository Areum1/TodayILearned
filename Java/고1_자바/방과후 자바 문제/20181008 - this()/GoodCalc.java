abstract class Calculator {
	public abstract int add(int a,int b);
	public abstract int subtract(int a,int b);
	public abstract double average(int[] a);
}
class GoodCalc extends Calculator {

	public int add(int a,int b){
		return (a+b);
	}
	public int subtract(int a,int b){
		return (a-b);
	}
	public double average(int[] a){
		int sum = 0;
		for (int i = 0; i<3; i++)
			sum += a[i];
		return (sum/3);
	}

	public static void main(String ar[]) {
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(5,3));
		System.out.println(c.add(2,3));
		System.out.println(c.subtract(2,3));
		System.out.println(c.average(new int[] {2,3,4}));
		//int[] a = new int[] {2,3,4};
	}
}