class Plane {
	public static int planes = 3;
	private String prod;
	private String model;
	private int max;
	public void setProd() {
		this.prod = prod; }
	public void setModel() {
		this.model = model; }
	public void setMax() {
		this.max = max; }
	public String getProd() {
		return prod; }
	public String getModel(){
		return model; }
	public int getMax(){
		return max; }
	public int getPlanes() {
		return planes; }
	Plane (String prod){
		this.prod = prod;
		planes++;
	}
	Plane (String prod, int max) {
		this.prod = prod;
		this.max = max;
		planes++;
	}
}
class PlaneTest {
	public static void main(String ar[]){
		Plane p1 = new Plane("Korean Air");
		Plane p2 = new Plane("Asiana", 500);
		System.out.println(p1.getProd());
		System.out.println(p2.getProd());
		System.out.println(p2.getMax());
		System.out.println(p1.planes);
	}
}