import java.util.Vector;

public class Product {
	int price;
	int bonusPoint;
	
	public Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}	
} //Product

class TV extends Product {
	public TV() {
		super(100);
	}
	
	@Override
	public String toString() {
		return "TV";
	}
}

class Computer extends Product {
	public Computer() {
		super(200);
	}
	
	@Override
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	public Audio() {
		super(50);
	}
	
	@Override
	public String toString() {
		return "Audio";
	}
}

class AIFreeze extends  Product {
	public AIFreeze() {
		super(350);
	}
	@Override
	public String toString() {
		return "AI 냉장고";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	//Product item[] = new Product[10];
	Vector item = new Vector();
	int i = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p.toString() + "을(를) 구입하셨습니다.");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		for(int i = 0; i<item.size(); i++) {
				Product p = (Product)item.get(i);
				sum += p.price;
				itemList += (i == 0) ? "" + p : ", "+ p ;
		}
		
		System.out.println("구입하신 물품의 총 금액은 "+sum+"만원입니다");
		System.out.println("보너스 포인터는 "+bonusPoint+"만점입니다.");
		System.out.println("구입하신 제품은 "+itemList+" 입니다.");
	}//summary
	
	public void refund(Product p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+"을(를) 반품하셨습니다.");
		}
		else {
			System.out.println("해당 제품이 없습니다");
		}
			
	}
}