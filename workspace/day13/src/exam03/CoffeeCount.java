package exam03;

public class CoffeeCount {
	private String beverage;	//음료 이름
	public static int allCount = 0;	//전체 음료 판매 건수
	public static int coffeeCount = 0; //커피 주문 건수
	
	public CoffeeCount(String beverage) {
		this.beverage = beverage;
		
		allCount++;	//allCount = allCount + 1;
		
		//1.방법1 커피와 같은지 비교
		//eqauls() = > 결과는 true/alse
		
		//boolean eq = beverage.equals("커피") || beverage.contentEquals("coffee");
		
		//2방법.2 compareTo() => 결과가 정수 1, 0 ,-1 세가지 중 하나
		//beverage.compareTo("coffee"); beverage변수와 coffee가 같으면 0
		// x.comepareTo(y) ; x>y : 1, x==y : 0, x<y : -1
		
		int eq = beverage.compareToIgnoreCase("coffe");
		if(eq==0) {
			coffeeCount++;
		}
		

		
//			if(eq) {
//				coffeeCount++; // 커피 주문 건수 누적
//			}
	}//생성자의 끝
	
	public  String getBeverage() {
		return beverage;
	}
	
	public void seteverage(String beverage) {
		this.beverage = beverage;
	}
	
	//전체 음료 건수
	public int getAllCount() {
		return allCount;
	}
	
	//커피 주문 건수
	public int getCoffeeCount() {
		return coffeeCount;
	}
	
}
