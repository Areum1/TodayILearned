class goods_test {
public static void main(String ar[]) {
	goods g = new goods();
	g.price = 10000;
	g.maker = "³ªÀÌÅ°";
	g.num = 2;
	System.out.println(g.price);
	System.out.println(g.maker);
	System.out.println(g.num);

	g.buy();
	g.sell();
}
}