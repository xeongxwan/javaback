package conditionalExam;

import java.util.Scanner;

import javax.swing.Spring;

/*
 * 성적을 입력 받아 70점이상이면 "합격"
 * 70점 미만이면 "불합격" 처리
 * 
 * 번호를 입력 받아 홀수이면'A강의실'
 * 짝수이면'B강의실'을 배정
 * 
 * 이수여부를 입력 받아'이수'가 아니면
 * '3일 이내에 이수 바람'으로 처리
 */


public class IfExam02 {

	public static void main(String[] args) {		
		//3번
		Scanner scan = new Scanner(System.in);
		
		int score = 0;
		
		System.out.println("성적을 입력하세요 >>");
		score = scan.nextInt();
		
		if(score >= 70) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
			
		}
		
		
				
		
		
		
		//4번
		int num = 0;
		System.out.println("번호를 입력하세요 >>");
		score = scan.nextInt();
		
		if(num % 2 == 1) {
			System.out.print("A강의실");
		}else {
			System.out.print("B강의실");	
		}
		System.out.println("을 배정 받았습니다.");
		
		
		
		
		
		//5번
		
		String edu = "";
		
		System.out.println("이수 여부를 입력하세요.\n 이수 , 미이수");
		edu = scan.next();
		
		if(edu.equals("이수") ) {
			System.out.println("'차기 과정 안내 합니다.'");
		}else {
			System.out.println("'3일 이내에 이수 바람'");
			
		}
		
		
		//6번
		
		int same = 0;
		
		System.out.println("정수를 입력 >>");
		same = scan.nextInt();
		
		if(same != 3) {
			System.out.println("입력한 숫자는'3'이 아닙니다.");
		}
//		System.out.println("입력한 숫자는 " + same +" 입니다." );
		System.out.printf("입력한숫자는 %d 입니다", same);
		
		
		//7번
		
		String password = "";
	
		
		System.out.println("주민번호를 입력하세요. 예시)123456-7891234");
		password = scan.next();
		
		boolean men = password.charAt(7) == '1' || password.charAt(7) == '3' || password.charAt(7) == '5';
		boolean girl = password.charAt(7) == '2' || password.charAt(7) == '4' || password.charAt(7) == '6';
		
		if(men) {
			System.out.println("성별 : 남");
		}else if(girl){
			System.out.println("성별 : 여");
		}else {
			System.out.println("주민번호를 정확히 입력하여 주세요.");
		}
		
		//8번
		
		int count = 0;
		int price = 0;
		String all = "";
		
		System.out.println("개수를 입력하세요 >>");
		count = scan.nextInt();
		System.out.println("영수증이 필요합니까? \n 1.네 2.아니요");
		price = count * 4500;
		
		
		all = scan.next();
		if(all.equals("네")) {
			System.out.print("금액"+ price + "원입니다. \n영수증 여기 있습니다");
		}else if(all.equals("아니요")){
			System.out.print("금액"+ price + "원입니다.");	
		}else {
			System.out.println("네 또는 아니요 만 입력할수 있습니다.");
		}
	
				

		
			
	
		
		
		
	}//end of main

}
