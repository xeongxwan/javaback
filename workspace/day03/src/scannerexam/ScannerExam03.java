package scannerexam;

import java.util.Scanner;

public class ScannerExam03 {

	public static void main(String[] args) {
		//#1. 입력받을 준비
		Scanner scan = new Scanner(System.in);
		
		//#2.변수선언
		int number =0;
		String result = ""; //문자의 초기화는 ' ' char ch = ' '; 
		
		//#3. 안내문구 / 입력받기
		System.out.println("0을 제외한 정수 입력 >>");
		number = scan.nextInt();
		
		//#4. 처리
		result = number % 2 == 0 ? "짝수" : "홀수"; //상향연산자 => 조건 ? 참 : 거짓;
		//홀수 : 숫자 % 2 == 1, 짝수 : 숫자 % 2 == 0, n의 배수 : 숫자 % n == 0 		
	
		//#5. 출력
		System.out.println("입력 받은 숫자는 " + number + " 로 '" + result +  "' 입니다. " );
	}

}
