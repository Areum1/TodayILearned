class Phone {
	private String name,tel;
	public Phone (String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public void putName() {
		this.name = name; }
	public String getName() {
		return name; }
	public void putTel() {
		this.tel = tel; }
	public String getTel() {
		return tel; }
	public static void main(String ar[]) {
		Phone p1 = new Phone("밥버거","111-1111");
		Phone p2 = new Phone("추억과 김밥","222-2222");
		System.out.println(p1.getName()+"의 전화번호 "+p1.getTel());
		System.out.println(p2.getName()+"의 전화번호 "+p2.getTel());
	}
}