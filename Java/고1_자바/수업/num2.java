//절대값 판단
class num2 {
	public void daniel(int i) {
		if(i>=0)
			System.out.println(i);
		else if (i<0)
			System.out.println(-i);
	}//daniel
	public static void main(String ar[]){
		num2 num = new num2();
		num.daniel(9);
	}
} //class