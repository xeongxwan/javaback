package operator;

public class Operator01 {

	public static void main(String[] args) {
		// + : 덧셈, - : 뺄셈, * : 곱셈, / : 나눗셈
		// 정수 / 정수 => 결과는 정수
		// 실수 / 정수 => 결과는 실수
		// 실수 / 실수 => 결과는 실수
		// % : 나머지 (정수 % 정수 만 가능)
		
		// = : 대입연산자
		// ==같다, != 같지않다
		
		// 삼항 연산자
		// (조건) ? 조건의 결과가 tue일때 실행할 값 : 조건의 결과가 거짓일 때 실행할 값
		
//문제1) num01 = 7, num02 = 5
//출력결과
/* num01 + num02 = 12
 * num01 - num02 = 2
 * num01 * num02 = 35
 * num01 / num02 = ? =>결과를 실수로 표현하기
 * num01 % num02 = ?
 *
 */
		
		

		
		
		int num01 = 7, num02 = 5, result01=0, result02=0, result03=0, result05=0;
		double result04 = 0.0;
//		double avg = 0.0f, per = 0.0f;
//		
//		avg = num01 / num02;
//		per = num01 % num02;
//		
//		System.out.println("num01 + num02 = "+(num01 + num02));
//		System.out.println("num01 - num02 = "+(num01 - num02));
//		System.out.println("num01 * num02 = "+(num01 * num02));
//		System.out.println("num01 / num02 = "+avg);
//		System.out.println("num01 % num02 = "+per);

		result01 = num01 + num02;
		result02 = num01 - num02;
		result03 = num01 * num02;
		result04 = (double)num01 / num02; // 정수 / 정수 => 정수 //result04는 실수를 담는 변수
		//result04 = num01 / (double)num02;	result04는 실수를 담는 변수
		result05 = num01 % num02;
		
		System.out.println("num01 + num02 = "+ result01);
		System.out.println("num01 - num02 = "+ result02);
		System.out.println("num01 * num02 = "+ result03);
		System.out.println("num01 / num02 = "+ result04);
		System.out.println("num01 % num02 = "+ result05);
		
	}
}
