class cat extends Animal {

	public void setName(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void scratch(){
		System.out.println("스크래치");
	}
	public void eat() {
		System.out.println("참치먹는다");
	}

	public static void main(String ar[]) {
		cat c1 = new cat();
		c1.setName("Mike");
		System.out.println(c1.getName());
		c1.eat();
	}
}