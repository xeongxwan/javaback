package variableExam;

public class Variable01 { //class의 시작

	public static void main(String[] args) { // main메소드의 시작(body, 본체)
		/* 변수는 블록의 위쪽에 선언
		 * 변수는 담을 그릇의 내용이 무엇인지 알수 있게 이름을 지음
		 * 변수는 반드시 초기화를 시킨다.
		 * 변수를 초기화하지 않으면 쓰레기값이 들어 갈 수도 있어 나중에 문제가 발생할 수 있음
		 * 
		 */
		int num = 4;
//		int su ;
//		int result = num + su;  // 초기화 하지 않아 에러 발생
		int a = 5;
		int resultValue = num + a; 
		// + : 덧셈
		// + : 문자열 + 숫자    => 연결 연산자(문자열을 쓰고 그 뒤에 연달아서 숫자 쓰기)
		//     문자열 + 문자열
		//                     문자열   +  정수
		System.out.println("num + a = " + resultValue);
		               // num + a = 9
		
		
	} //main메소드 끝

} //class의 끝




















