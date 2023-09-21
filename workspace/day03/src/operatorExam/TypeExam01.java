package operatorExam;

public class TypeExam01 {

	public static void main(String[] args) {
		// 기본 타입(자료형, 형)
		//		정수 : byte, short, int, long
		//		실수 : float, double
		//		불(boolean) : boolean
		//		문자(문자,정수) : char
		
		int a = 10;
		long b = 10L; // 컴파일러에게 long형이라고 알려줌
		
		double d = 3.15;
		float f = 3.15f; //컴파일러에게 float형이라고 알려줌
		
		// "A", "a". "홍길동" - 문자열
		// "A", "A" -문자
		// String str = ""; //빈값으로 초기화 가 가능
		// char ch = ''; //빈값으로 ''를 사용할 수 없음
		//			' ' 사이에 space(코드:32)를 하나 넣어줌
		// char ch =' '; // 빈값으로 초기화
		
		char c= 'A';	//문자
		char e = 66;	//'B' 아스키코드값, 유니코드 값
		
		System.out.println(c);
		System.out.println(e);
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(d);
		System.out.println(f);
		
	}

}
