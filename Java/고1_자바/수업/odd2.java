//¦�� Ȧ�� �Ǵ�
class odd2 {
	public void daniel(int i) {
		if(i%2==0)
			System.out.println("¦��");
		else if (i%2==1)
			System.out.println("Ȧ��");
	}//daniel
	public static void main(String ar[]){
		odd2 odd = new odd2();
		odd.daniel(8);
	}
} //class