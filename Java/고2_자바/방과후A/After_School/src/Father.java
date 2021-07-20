
public class Father extends GrandFa {
	
	private int nai;
	private int house = 1;
	public String gabo = "황금돼지";

	public Father() {
		super();
		System.out.println("아버지 생성자");
	}
	
	public Father(int nai) {
		System.out.println("아버지 생성자");
		this.nai = nai;
	}
	
	public int getNai() {
		return nai;
	}

	public int getHouse() {
		return house;
	}
	
	public String say() {
		return "아버지 말씀 : 인생을 즐겨라";
	}
	
	public void show() {
		System.out.println(this.gabo);
		System.out.println(super.gabo);
		System.out.println("아버지 나이 : "+this.getNai());
		System.out.println("할아버지 나이 :"+super.getNai());
	}
}
