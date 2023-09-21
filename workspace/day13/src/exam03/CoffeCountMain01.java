package exam03;

public class CoffeCountMain01 {

	public static void main(String[] args) {
		CoffeeCount coffee1 = new CoffeeCount("커피");
		CoffeeCount coke1 = new CoffeeCount("콜라");
		CoffeeCount tea1 = new CoffeeCount("홍차");
		CoffeeCount coffee2 = new CoffeeCount("coffee");
		CoffeeCount tea2 = new CoffeeCount("녹차");
		CoffeeCount coffee3 = new CoffeeCount("COFFEE");
		
		System.out.println("오늘 음료 전체 주문 건수 :" + CoffeeCount.allCount);
		System.out.println("오늘 커피 주문 건수 :" + CoffeeCount.coffeeCount);
		
//		System.out.println("오늘 음료 전체 주문 건수 :" + CoffeeCount.getallCount);
//		System.out.println("오늘 커피 주문 건수 :" + CoffeeCount.getcoffeeCount);
		
		
		
		
	}

}
 