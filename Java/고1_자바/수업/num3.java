//절대값 판단
class num3 {
	int i = -10;
	int j;
	public int daniel() {
		if(i>=0)
			j = i;
		else if (i<0)
			j= -i;
		return j;
	}//daniel
	public static void main(String ar[]){
		num3 num = new num3();
		System.out.println(num.daniel());
	}
} //class