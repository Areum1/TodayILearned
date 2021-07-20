package Quiz1;

public class Quiz7_2 {
	public static void main(String ar[]) {
		Shape s_arr[] = new Shape[3];	
		s_arr[0] = new Circle(5);
		s_arr[1] = new Rectangle(10,10);
		s_arr[2] = new Triangle(10,10);
		
		for(int i = 0; i<s_arr.length; i++) {
			System.out.println("도형의 면적은"+s_arr[i].area());
		}
	}
}
