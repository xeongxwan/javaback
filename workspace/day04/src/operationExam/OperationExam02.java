package operationExam;

public class OperationExam02 {
	/*
	 * 대문자를 소문자로 변환하기
	 * 문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경
	 * 대문자 'A'는 코드가 65이고 'b' 의 코드는 66이고 'a' 의 코드는 97이다
	 * 'b'의 코드는 98로 대문자와 소문자는 차이가 32가 남
	 * 	(삼향 연산자와 코드를 이용하여 구하시오)
	 * 
	 * 힌트) 대문자를 소문자로 : 문자값이 대문자인지 확인한 후 => 문자 값에 + 32
	 * 		 소문자를 대문자로 : 문자값이 소문자인지 확인한 후 => 문자 값에 - 32
	 */
	
	public static void main(String[] args) {
		char ch = 'f';		//지역변수({} 안에서만 사용, {}을 벗어나면 메모리에서 제거)
		char result= ' '; // 지역변수, 문자열 String str = ""; String str = null;
		
		//		조건 ? 조건의 결과가 참일 때 실행할 것 : 거짓일 때 실행할 것;
		result = (ch>='a' && ch <='z')	?	(char)(ch-32)	: ch;
		//		대문자이면		?		소문자로 변경	: 	소문자인 경우는 그래도 소문자 출력;
		//								char + int형으로 자동 형변환
		//								(char)(char + int) => char형으로 강제 타입변환
		System.out.println(result);
		
		
		
		
		
		
	}//end of main

}//end of class
