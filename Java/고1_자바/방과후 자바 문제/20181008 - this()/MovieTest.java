class Movie{
	String title;
	String diretor;
	String maker;
	Movie (String t, String d,String m) {
		this.title = t;
		this.diretor = d;
		this.maker = m;
	}
	Movie (String m){
		this.maker = m;
	}
	Movie (){
		
	}
	public void setTitle(String t){
		this.title = t;
	}
	public void setDiretor(String d){
		this.diretor = d;
	}
	public void setMaker(String m){
		this.maker = m;
	}
	public String getTitle(String t){
		return title;
	}
	public String getDiretor(String d){
		return diretor;
	}
	public String getMaker(String m){
		return maker;
	}
	public String toString(){
		System.out.println("���� "+title);
		System.out.println("���� "+diretor);
		System.out.println("���ۻ� "+maker);
		//�����ض�

	}
}
class MovieTest {
	public static void main(String ar[]) {
		Movie m1 = new Movie("�ƹ�Ÿ","��Ƹ�","��ȸ");
		Movie m2 = new Movie("�Ƹ�ȸ��");
		Movie m3 = new Movie();
		m1.toString();
	}
}