package bookexam;

public class CoinExam {

	public static void main(String[] args) {

//		int money = 7380;
//		int c500 = 0;
//		int c100 = 0;
//		int c50 = 0;
//		int c10 = 0;
//		
//		c500 = money / 500;	//정수 / 정수 = 정수;
//		money = money % 500;
//		
//		c100 = money / 100;
//		money = money % 100;
//		
//		c50 = money / 50;
//		money = money % 50;
//		
//		c10 = money / 10;
//		money = money % 10;
//		
//		System.out.println("500원 " + c500);
//		System.out.println("100원 " + c100);
//		System.out.println("50원 " + c50);
//		System.out.println("10원 " + c10);
//		System.out.println("나머지 :" + money);
		
		int money = 7380;
		int[] coinMoney = {500,100,50,10};
		int[] coinCount = new int[4];
		
		for(int i=0; i<coinMoney.length; i++) {
			coinCount[i] = money / coinMoney[i];
			money = money % coinMoney[i];
			
			System.out.printf("%3d 원 : %3d개 \n",coinMoney[i], coinCount[i]);
		}
			
				System.out.println("나머지 :   " + money + "개");
				
		
		
		
		
		
		
		
		
		
		
		
		
	}	

}
