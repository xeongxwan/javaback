package scannerexam;
/*키보드로 부터 이름을 입력받아 그 이름을 화면에 출력하기*/
import java.util.Scanner;

public class ScannerExam01 {

	public static void main(String[] args) {
		//#1. 붕어빵 틀을 가져다 붕어빵(객체) 만들기(사용자로 부터 입력된 자료를 담을 객체를 만들기
		//클래스타입 참조변수 = new 생성자(시스스템의. 입력장치로);
		Scanner scan = new Scanner(System.in);
		
		//#2. 변수 선언
		String name="";//초기화
		
		//#3. 사용자가 알아 볼 수 있는 안내문구 작업
		System.out.println("이름을 입력하세요 >>");
		
		//#4. 키보드로 입력한 자료를 가져오기
				name = scan.next( );
		//String name = scan.next();
		//#5. 가져온 자료를 사용하기
		System.out.println("이름 :" + name);
		scan.close();
	}

}
