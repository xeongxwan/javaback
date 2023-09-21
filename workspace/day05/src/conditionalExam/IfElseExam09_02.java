package conditionalExam;

import java.util.Scanner;

public class IfElseExam09_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String beverage = "";
		int jumunNumber = 0;	//주문수량 
		
		System.out.println("음료를 주문하세요...\n"
				+"1:아메리카노(2500),2:라떼(4500),3:콜라(1500),4.홍차(5500),0:주문취소");
		beverage = scan.next();
		
			if(!beverage.equals("0")) {	// 0=> !true => false => false는 if문 실행 안함
										// 0이외의 것 => !false => true => true는 if문을 실행
				//조건의 결과가 true일 때 실행할 문장
			System.out.println("주문 수량을 입력 >>");
			jumunNumber = scan.nextInt();
			}
			
			if(beverage.equals("1")) {
				System.out.println("아메리카노를" + jumunNumber + "잔 주문하셨습니다.");
				System.out.println("금액은 " + (jumunNumber * 2500) + "입니다.");
			}else if(beverage.equals("2")) {
				System.out.println("라떼를 " + jumunNumber + "잔 주문하셨습니다.");
				System.out.println("금액은 " + (jumunNumber * 4500) + "입니다.");
			}else if(beverage.equals("3")) {
				System.out.println("콜라를 " + jumunNumber + "잔 주문하셨습니다.");
				System.out.println("금액은 " + (jumunNumber * 1500) + "입니다.");
			}else if(beverage.equals("4")) {
				System.out.println("홍차를 " + jumunNumber + "잔 주문하셨습니다.");
				System.out.println("금액은 " + (jumunNumber * 5500) + "입니다.");
			}else {
				System.out.println("주문을 취소하셨습니다.");
			}
		
		
		
		
		
		
	}//end of main

}
