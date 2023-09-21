package exam;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] price = {2500,4500,1500,5500};
		int sum = 0;
		int cup = 0;
		String yn = "";
		

		
		while(true) {
			System.out.println( "음료를 선택하세요....\n(1 : 아메리카노(2500), 2 : 라떼(4500), 3 : 콜라(1500), 4 : 홍차(5500), 0: 주문 취소)");
			int drink =scan.nextInt(); 
	
		if(drink==0) { System.out.println("주문을종료 합니다."); break;}	
		
		if(drink==1){
			sum = price[0];
			System.out.println("주문 수량을 입력하세요");
			cup = scan.nextInt();	
			System.out.println("주문을 계속하시겠습니까? ( 주문 : Y, 아니요 : N )");
			yn = scan.next();
			if(yn.equals("y")) {
			
				
			}else if(yn.equals("n")) {
				int all = sum * cup;
				System.out.println("아메리카노 " + cup + "잔 " +  "금액 : " + all +"원");
				break;
			}
			
		}else if(drink==2) {
			sum = price[1];
			System.out.println("주문 수량을 입력하세요");
			cup = scan.nextInt();	
			System.out.println("주문을 계속하시겠습니까? ( 주문 : Y, 아니요 : N )");
			yn = scan.next();
			if(yn.equals("y")) {
			
				System.out.println("주문을 종료 합니다."); break;
			}else if(yn.equals("n")) {
				int all = sum * cup;
				System.out.println("라떼 " + cup + "잔 " +  "금액 : " + all +"원");
				break;
			}
		
		}else if(drink==3) {
			sum = price[2];
			System.out.println("주문 수량을 입력하세요");
			cup = scan.nextInt();	
			System.out.println("주문을 계속하시겠습니까? ( 주문 : Y, 아니요 : N )");
			yn = scan.next();
			if(yn.equals("y")) {
			int all = sum * cup;
				System.out.println("콜라 " + cup + "잔 " +  "금액 : " + all +"원");
				break;
			}else if(yn.equals("n")) {
				System.out.println("주문을 종료 합니다."); break;
			}
		
		}else if(drink==3) {
			sum = price[2];
			System.out.println("주문 수량을 입력하세요");
			cup = scan.nextInt();	
			System.out.println("주문을 계속하시겠습니까? ( 주문 : Y, 아니요 : N )");
			yn = scan.next();
			if(yn.equals("y")) {
			int all = sum * cup;
				System.out.println("홍차" + cup + "잔 " +  "금액 : " + all +"원");
				break;
			}else if(yn.equals("n")) {
			System.out.println("주문을 종료 합니다."); break;
			}
		
		}//end of if
		}//end of while
		scan.close();
	}//end of main

}//end of class
