//절대값 판단
class num1 {
	int i = -9;
	public void daniel() {
		if(i>=0)
			System.out.println(i);
		else if (i<0)
			System.out.println(-i);
	}//daniel
	public static void main(String ar[]){
		num1 num = new num1();
		num.daniel();
	}
} //class