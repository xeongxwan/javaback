package bookexam;

import java.util.Scanner;

public class Exam_13 {
static	int speed =0;	//static 필드

	public static void main(String[] args) {
		//변수선언
		//if ~ else if ~ else, switch, while
		
		Scanner scan = new Scanner(System.in);	//참조변수-객체의 주소 담고 있음
		
		
		
		while(true) {
			int selectNum = 0;	//지역 변수
			System.out.println("--------------------------");
			System.out.println(" 1.증속 | 2.감속 | 3.중지");
			System.out.println("--------------------------");
			System.out.print("선택 > ");
			selectNum = scan.nextInt();
			
			if(selectNum==3){
			System.out.println("프로그램 중지");
			break;	//while문을 빠져 나가면서 반복을 하지 않겠다
			}
			speedProcessor(selectNum);
			
		}//end of while
	}//end of main
			
	public static void speedProcessor(int selectNum) {
	
		
	if(selectNum==1){
		speed++;
		System.err.println("현재 속도 : " + speed);
		
	}else if(selectNum==2) {
		speed--;
		System.err.println("현재 속도 : " + speed);
	}else {
		System.out.println("번호를 잘못 입력 했습니다. 다시 입력하세요...");
	}// end of if
		
	}//end of static
	
	
}//end of class
			
			
			
			
			
			
			
			//#1. 방법 1
			
//			if(selectNum.equals("3")){
//				System.out.println("프로그램 중지");
//				break;	//while문을 빠져 나가면서 반복을 하지 않겠다
//			}else if(selectNum.equals("1")) {
//				speed++;
//				System.err.println("현재 속도 : " + speed);
//			}else if(selectNum.equals("2")) {
//				speed--;
//				System.err.println("현재 속도 : " + speed);
//			}else {
//				System.out.println("번호를 잘못 입력 했습니다. 다시 입력하세요...");
//			}// edn of if

			
			
//			//#2.방법 2 switch
//			if(selectNum.equals("3")){
//				System.out.println("프로그램 중지");
//				break;	//while문을 빠져 나가면서 반복을 하지 않겠다
//			}
//			
//			switch (selectNum) {
//			case "1":
//				speed++;
//				System.err.println("현재 속도 : " + speed);
//				break;	//switch문을 종료한다.
//			case "2":
//				speed --;
//				System.err.println("현재 속도 : " + speed);
//				break;	//switch문을 종료한다.
//				default :
//					System.out.println("번호를 잘못 입력 했습니다. 다시 입력하세요...");
//					break;////switch문을 종료한다.
//					
//			}//end of switch
//			
//			
//			
//			
			
			

	

