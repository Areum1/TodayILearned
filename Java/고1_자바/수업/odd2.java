//Â¦¼ö È¦¼ö ÆÇ´Ü
class odd2 {
	public void daniel(int i) {
		if(i%2==0)
			System.out.println("Â¦¼ö");
		else if (i%2==1)
			System.out.println("È¦¼ö");
	}//daniel
	public static void main(String ar[]){
		odd2 odd = new odd2();
		odd.daniel(8);
	}
} //class