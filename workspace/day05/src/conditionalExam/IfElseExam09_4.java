package conditionalExam;

import java.util.Scanner;

public class IfElseExam09_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int beverage = ' ';
		int jumunNumber = 0;	//주문수량 
		
		System.out.println("음료를 주문하세요...\n"
				+"1:아메리카노(2500),2:라떼(4500),3:콜라(1500),4.홍차(5500),0:주문취소");
		beverage = scan.nextInt();
		
			if(beverage != '0') {
			System.out.println("주문 수량을 입력 >>");
			jumunNumber = scan.nextInt();
			}
			
			if(beverage==1) {
				System.out.println("아메리카노를 " + jumunNumber + "잔 주문하셨습니다.");
				System.out.println("금액은 " + (jumunNumber * 2500) + "입니다.");
			}else if(beverage==2) {
				System.out.println("라떼를 " + jumunNumber + "잔 주문하셨습니다.");
				System.out.println("금액은 " + (jumunNumber * 4500) + "입니다.");
			}else if(beverage==3) {
				System.out.println("콜라를 " + jumunNumber + "잔 주문하셨습니다.");
				System.out.println("금액은 " + (jumunNumber * 1500) + "입니다.");
			}else if(beverage==4) {
				System.out.println("홍차를 " + jumunNumber + "잔 주문하셨습니다.");
				System.out.println("금액은 " + (jumunNumber * 5500) + "입니다.");
			}else {
				System.out.println("주문을 취소하셨습니다.");
			}
		
		
		
		
		
		
	}//end of main

}
