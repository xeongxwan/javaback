package bookexam;

import java.util.Scanner;

public class Exam_14 {

			private static Scanner scan= new Scanner(System.in);
			private static int balance;//잔고, 잔고는 모든 메소드에서 공통으로 사용
			
			
			
			
			
			public static void main(String[] args) {
				
				while(true) {
				int selectNum = 0;	//	선택 번호
//				int inDeposit = 0;	//	입금액
//				int outWithdrawal = 0;	// 출금액
				
				System.out.println("-----------------------------------------");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("-----------------------------------------");
				System.out.print("선택 >> ");
				selectNum = scan.nextInt();
				
				if(selectNum==4) {
					System.out.println("프로그램 종료");
					break;	//while문 종료
				}
				
				
				switch(selectNum) {
				case 1 : 
					deposit();
					break;
					
				case 2 : 
					withdrawal();
					break;
					
				case 3 :	
					balMoney();
					break;
					
				}
				
				
				
				
				
				}//end of while
				
				
				
	}//end of main
			
			//예금액 처리
			private static void deposit() { //입금액을 전달
				 int inDeposit = 0;
				
				System.out.println("예금액 : ");
				inDeposit = scan.nextInt();
				balance += inDeposit;
			}
			
			//출금액 처리
			private static void withdrawal() { //출금액 넘겨받기
				int outWithdrawal = 0;
				System.out.println("출금액 : ");
				outWithdrawal = scan.nextInt();
				
				if(balance < outWithdrawal) {
					System.out.println("잔액부족");
				}else {
					balance -= outWithdrawal;
				}
				
			}
			
			
			//잔고 출력
			private static void balMoney() {
					System.out.println("현재 잔고는 :" + balance);
			}
		

}//end of class
