class GoodsStock {
String goodsCode;
int stockNum;
public GoodsStock(String goodsCode, int stockNum) {
this.goodsCode = goodsCode;
this.stockNum = stockNum;
}
public GoodsStock() {}
public void addStock(int amount) {
stockNum += amount;
}
public int subtractStock(int amount) {
if(stockNum < amount)
return 0;
stockNum -= amount;
return stockNum;
}
//public void addStock( ㉠ ) { }
}

public class ClassExam1 {
public static void main(String[] args) {
GoodsStock obj1 = new GoodsStock("52135", 200);
System.out.println("상품코드 : " + obj1.goodsCode);
System.out.println("재고수량 : " + obj1.stockNum);
obj1.addStock(1000);
obj1.subtractStock(800);
GoodsStock obj2 = new GoodsStock();
obj2.goodsCode = "G-12";
obj2.stockNum = 20;
} //main
}
