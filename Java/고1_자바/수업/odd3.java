//¦�� Ȧ�� �Ǵ�
class odd3 {
	int i = 9;
	String a;
	public String daniel() {
		if(i%2==0)
			a = "¦��";
		else if (i%2==1)
			a= "Ȧ��";

		return a;
	}
	public static void main(String ar[]){
		odd3 odd = new odd3();
		System.out.println(odd.daniel());
	}
} //class