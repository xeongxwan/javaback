package conditionalExam;

import java.util.Scanner;

public class IfElseExam09_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String beverage = ""; //주문 음료
		String BeverageName = ""; //음료의 이름을 담을 변수
		int jumunNumber = 0;	//주문수량
		int money = 0;	//(주문수량 * 음료 가격) 을 담을 변수
		
		//#3. 음료 선택 안내 문구 및 주문 가져오기
		System.out.println("음료를 주문하세요...\n"
				+"1:아메리카노(2500),2:라떼(4500),3:콜라(1500),4.홍차(5500),0:주문취소");
		beverage = scan.next();
		
		//#04. 주문이 "0"아닌 것으로 주문취소가 아닌 경우 처리
			if(!beverage.equals("0")) {	// 0=> !true => false => false는 if문 실행 안함
										// 0이외의 것 => !false => true => true는 if문을 실행
				//조건의 결과가 true일 때 실행할 문장
			System.out.println("주문 수량을 입력 >>");
			jumunNumber = scan.nextInt();
			
			
			//#5. 주문이 "0" 으로 주문 취소인 경우 처리
			
			//실행문장이 1줄일 경우 {} 생략 가능
			
			//#6. 주문 취소 이외의 주문 처리
//			if(beverage.equals("1")) {
//				BeverageName = "아메리카노";
//				money = jumunNumber * 2500;
//			}else if(beverage.equals("2")) {
//				BeverageName = "라뗴";
//				money = jumunNumber * 4500;
			
//			}else if(beverage.equals("3")) {
//				BeverageName = "콜라";
//				money = jumunNumber * 1500;
//			}else if(beverage.equals("4")) {
//				BeverageName = "홍차";
//				money = jumunNumber * 5500;	
//			}
			
			System.out.println(BeverageName + "를 " + jumunNumber + "잔 주문하셨습니다.");
			System.out.println("금액은 " + money + "입니다.");
			
//			
//			System.out.printf("%s를 %d잔 주문하셨습니다.\n", BeverageName, jumunNumber);
//			System.out.printf("금액은 %d 입니다.\n,", money);
			
			
			}else if (beverage.equals("0")){
				System.out.println("주문취소");
		
			}
	
	
		}
			
			
		
	}


