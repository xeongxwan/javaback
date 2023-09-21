package operationExam;

import java.util.Scanner;

/*
 * 영문자 한글자를 입력받아서
 * 숫자이면 '입력한 문자는 숫자입니다.' ('0 ~ 9')
 * 문자이면 '입력한 문자는 영문자입니다'(A' ~ 'Z', 'a' ~'z')
 * 
 */
public class OperationExam03 {
	public static void main(String[] args) {
		//#1. 입력 준비, 입력한 내용을 담을 객체를 생성
		Scanner scan = new Scanner(System.in);
		
		//#2. 변수 선언 - 변수는 되도록이면 블록의 위에 선언하고, 선언과 동시에 초기화 시킨다.
		char charInput = ' ';
		
		//#3. 안내 문구
		System.out.println("영문자 한글자를 입력하세요 >>");
		
		//#4. 입력된 글자를 가져와 charIinput 변수에 담기
		charInput = scan.next().charAt(0);
		
		
		//#5. 영문자인지 숫자인지 처리 화면에 출력
		if(charInput >= '0' && charInput<='9') {
			System.out.println(charInput + "는 숫자입니다.");
		}
		
		if((charInput >= 'A' && charInput<='Z') || (charInput >= 'a' && charInput<='z')) {
			System.out.println(charInput + "는 영문자입니다.");
		}
		
		scan.close();
		
	}

}
