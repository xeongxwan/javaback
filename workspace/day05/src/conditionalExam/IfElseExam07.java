package conditionalExam;

import java.util.Scanner;

public class IfElseExam07 {

	public static void main(String[] args) {
		
		
		//#1.입력 받을 객체 생성
			Scanner scan = new Scanner(System.in);
		
		//#2.변수선언 - 되도록 블록 위에 선언, 선언 후 반드시 초기화 시킨다.
		//										쓰레기값이 담길 수 있으므로
		String jumin = ""; // String jumin=null;
							//	char ch = ''; => 에러, char ch = ' '; '와' 사이를 한칸 띄움
		char gender = ' '; //주민번호 8번째(인덱스 - 7번째) 값을 담을 변수
		
		//#3. 입력을 위한 안내 문구 (생략가능- 사용자를 위한 배려)
		System.out.println("주민등록번호를 입력\n예)990305-1234567");
		jumin = scan.next();
		gender = jumin.charAt(7);
		//gender = scan.next().charAt(0);
		
		//방법1
//		if(gender=='1' || gender=='3' || gender=='5') {
//			System.out.println("성별: 남");
//		}else if(gender=='2' || gender=='4' || gender=='6') {
//			System.out.println("성별 : 여");
//		}else {
//			System.out.println("주민번호가 잘못 입력되었습니다");
//		}
		
		
		
		
		//방법3
//		switch (gender) {
//		case '1' : System.out.println("성별 : 남"); 
//			break; //자신을 감싸고 있는 {}을 빠져나간다. 끝낸다.
//		case '3' : System.out.println("성별 : 남"); 
//			break;
//		case '5' : System.out.println("성별 : 남"); 
//			break;
//		case '2' : System.out.println("성별 : 여"); 
//		break;
//		case '4' : System.out.println("성별 : 여"); 
//		break;
//		case '6' : System.out.println("성별 : 여"); 
//		break;
//		
//		default:
//			System.out.println("주민번호가 잘못 입력되었습니다.");
//			break;
//		}
		
		switch (gender) {
		case '1' : 
		case '3' : 
		case '5' : System.out.println("성별 : 남"); 
			break;
		case '2' : 
		case '4' :
		case '6' : System.out.println("성별 : 여"); 
			break;
		default:
			System.out.println("주민번호가 잘못 입력되었습니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
