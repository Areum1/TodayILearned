//¦�� Ȧ�� �Ǵ�
class odd4 {
	String a;
	public String daniel(int i) {
		if(i%2==0)
			a = "¦��";
		else if (i%2==1)
			a= "Ȧ��";
			return a;
	}//daniel
	public static void main(String ar[]){
		odd4 odd = new odd4();
		System.out.println(odd.daniel(9));
	}
} //class