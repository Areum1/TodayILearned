//Â¦¼ö È¦¼ö ÆÇ´Ü
class odd3 {
	int i = 9;
	String a;
	public String daniel() {
		if(i%2==0)
			a = "Â¦¼ö";
		else if (i%2==1)
			a= "È¦¼ö";

		return a;
	}
	public static void main(String ar[]){
		odd3 odd = new odd3();
		System.out.println(odd.daniel());
	}
} //class