package exam01;  //패키지명 - 주석을 제외하고 첫줄에 작성, 하나만 작성
// 한줄 주석  , Ctrl + /
/*  여러 줄 주석  */
public class Hello{ //클래스의 시작

	// public : 접근 제한자(제어자), 모든 클래스에서 접근 가능
    // class : class 파일을 작성하고 있음
	// Hello : 클래스명{ }
	
	public static void main(String[] args) { // main 메소드의 시작
		// public : 접근 제어자, 어떤 클래스에서나 접근 가능
		// static : 클래스를 호출(메모리로 로드)할 때 메모리에 함께 읽혀진다.
		// void : 반환값(return 값)이 없음,  여기서 실행하고 끝냄, 자신을 호출한 곳으로
		//         가져갈 값이 없음
		// main( ) :  메소드,  컴파일러가 컴파일시 시작하는 시발점(프로그램 실행 진입점, Entry Point)
		//            jvm이 제일 먼저 읽어서 프로그램을 시작하는 진입점
		
		// 자바에서 실행문은 반드시 세미콜론(;)로 끝낸다.
		System.out.println("안녕!! 자바!!");    // sysout  -> Ctrl + spacebar,   실행문
								// 콘솔 창에 출력
		//System.out : 시스템의 출력 장치(모니터)
		//println() : 괄호안의 내용을 콘솔창에 출력하고 결과 뒤에서 줄바꿈하기
		System.out.println("즐거운 시간...");   // 실행 - Ctrl + F11   

	} // main 메소드의 끝

} // 클래스의 끝
