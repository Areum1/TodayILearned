interface Buyable {
	public int getPrice();
}
class Televesion implements Buyable {
	String model;
	String maker;
	int price;
	Televesion(String m, String ma, int p){
		this.model = m;
		this.maker = ma;
		this.price = p;
	}
	public int getPrice(){
		return price;
	}
}
class imp_Test1{
	public static void main(String ar[]) {
		Televesion t = new Televesion("KV-102","LG",300);
		System.out.println(t.model+" "+t.maker+" "+t.getPrice());
	}
}