package conditionalExam;

import java.util.Scanner;

/*
 * 성적을 입력 받아 성적이 80점 이상이면 "우수"로 처리
 * 
 * 숫자를 입력받아 숫자가 홀수 이면 숫자의 2배의 값을 출력
 * 
 * 
 */
public class IfExam01 {

	public static void main(String[] args) {
		//if(조건) { 실행할 문장 } => 조건의 결과가 true일때만 실행
		
		Scanner scan = new Scanner(System.in);
		
		int score = 0;	//입력 받은 성적을 담을 변수
		int num = 0; //입력 받은 숫자를 담을 변수
		
		System.out.println("성적을 입력 >>");
		score = scan.nextInt(); //score = Integer.parseInt(scan.next());
		
		if(score >= 80) {
			System.out.println("우수");
			
		}
		
		
		//======================================================
		//방법1
		if(num % 2 == 1) {
			System.out.println(num*2);
		}
		
		
		//방법2
	if(num % 2 == 1)
		System.out.println(num*2); // if문의 실행문장, 한문장일경우에는 {} 블록 생략가능
								   // 단, 딱 한줄만 if문의 실행문장으로 인식
		System.out.println("테스트");//if문이 아닌 다른 실행 문장
		
		
		//방법3
	if(num % 2 ==1) System.out.println(num*2); // if문의 실행문장, 한문장일경우에는 {} 블록 생략가능
		
	
		//방법4
	if(num % 2 ==1) { System.out.println(num*2); }
		
	//방법5
	if(num % 2 ==1) 
	{ 
		System.out.println(num*2); 
	}
	
	
	
	
	
	
	}

}
