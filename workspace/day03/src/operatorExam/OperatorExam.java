package operatorExam;

import java.util.Scanner;

public class OperatorExam {
/*
 * 대문자를 소문자로 변환하기
 * 문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경
 * 대문자 'A'는 코드가 65이고 'b' 의 코드는 66이고 'a' 의 코드는 97이다
 * 'b'의 코드는 98로 대문자와 소문자는 차이가 32가 남
 * 	(삼향 연산자와 코드를 이용하여 구하시오)
 * 
 * 힌트) 대문자를 소문자로 : 문자값이 대문자인지 확인한 후 => 문자 값에 + 32
 * 		 소문자를 대문자로 : 문자값이 소문자인지 확인한 후 => 문자 값에  -32
 */
	


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = " ";
		String output = " ";
        	//출력할 output을 정의
		
		System.out.println("단어를 입력해주세요");
		inputString = sc.next();

		char[] change = inputString.toCharArray();

		for (int i = 0; i < change.length; i++) {
			if (change[i] >= 'A' && change[i] <= 'Z') {
				output = inputString.toLowerCase();
				// change[i] = (char) (change[i] + 32); 를 빼고 내장함수 사용

			} else if (change[i] >= 'a' && change[i] <= 'z') {
				output = inputString.toUpperCase();
				// change[i] = (char) (change[i] - 32); 를 빼고 내장함수 사용

			} 
		}
		System.out.println(output);
        //값이 변경된 output 출력
	}
		
	}


