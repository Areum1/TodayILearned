class car {
private String brand;
private String owner;
private String company;
private int price;

public car(String brand,String owner, String company,int price) {
	this.brand = brand;
	this.owner = owner;
	this.company = company;
	this.price = price;
}

public car (String owner,String brand, int price) {
	this.owner = owner;
	this.brand = brand;
	this.price = price;
}

public car (String brand,int price) {
	this.brand = brand;
	this.price = price;
}

public String start(){
	return ("출발합니다");
}

public String stop(){
	return ("정지합니다");
}

/*public void setowner(String owner){
	this.owner = owner;
}

public void setbrand(String brand){
	this.brand = brand;
}

public void setprice(int price){
	this.price = price;
}

public String getowner(){
	return owner;
}

public String getbrand(){
	return brand;
}

public int getprice(){
	return price;
}
*/
public static void main(String ar[]) {
	car c1 = new car ("sonata","MIKE","hyundai",100);
	car c2 = new car ("Alice","kia",200);
	car c3 = new car("Avante",300);

	System.out.println(c2.brand);
	System.out.println(c2.owner);
	System.out.println(c2.company);
	System.out.println(c2.price);
	
	System.out.println(c3.start());
	System.out.println(c3.stop());
}
}