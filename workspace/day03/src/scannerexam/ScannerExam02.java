package scannerexam;

import java.util.Scanner;

/*
 * 학번, 이름, 국어, 영어, 수학 점수를 입력 받아서
 * 합계와 평균을 구하고(평균은 소수 이하 둘째자리까지)
 * 평균이 70점 이상이면 "통과", 그렇지 않으면 "재수강" 처리
 * 
 * 출력 형태)
 * 	*** 홍길동 님의 중간 성적 ***
 * 학번		이름	 국어	 영어	 수학	 합계	 평균	 평가
 * ---------------------------------------------------------------
 * 230301	홍길동	 90 	  87      83      260	 86.67	 통과 
 *
 * 
*/

public class ScannerExam02 {

	public static void main(String[] args) {
	//#1. 입력 받을 수 있는 준비
		Scanner scan = new Scanner(System.in);
		
	//#2. 변수 선언 - 되도록 블록의 위쪽에 선언
	String ssn = ""; //학번
	String name = ""; //이름
	int kor=0, eng=0, mat=0, sum=0;
	double avg = 0.0;
	String result = ""; //평가

//	//#. 안내 문구 -> 입력값 변수에 담기
//	System.out.println("학번을 입력 >>");
//	ssn = scan.next();
//	
//	System.out.println("이름 입력 >>");
//	name = scan.next();
//	
//	System.out.println("국어 점수 >>");
//	kor = scan.nextInt();
//	
//	System.out.println("영어 점수 >>");
//	eng = scan.nextInt();
//	
//	System.out.println("수학 점수 >>");
//	mat = scan.nextInt();
	
	
	System.out.println("학번,이름,국어,영어,수학 점수를 차례로 입력");
	ssn = scan.next();
	name = scan.next();
//	kor = scan.nextInt();
//	eng = scan.nextInt();
//	mat = scan.nextInt();
	
	kor = Integer.parseInt(scan.next()); // 정수값 형태의 문자열을 정수로 변환
	eng = Integer.parseInt(scan.next());
	mat = Integer.parseInt(scan.next());
	
	
	//#4. 계산 작업
	sum = kor + eng + mat;
	avg = (double)sum / 3;	// avg = sum / 3.0;,
							// 정수 / 정수 => 정수	260/3 = 86
							//실수 / 정수 => 실수,	260.0 / 3 = 86.6666...
							//정수 / 실수 =>실수
	
		//조건? 조건이 참일 때 실행할 것 : 조건이 거짓일 때 실행할 것;
	result = avg >= 70 ? "통과" : "재수강";
	//#5. 출력
	System.out.println(" *** " +name+"님의 중간성적 *** ");
	System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균\t평가");
	System.out.println("-------------------------------------------------------------");
	System.out.printf("%s\t %s\t %d\t %d\t %d\t %d\t %.2f\t %s\n", ssn, name, kor, eng, mat, sum, avg,result);
	
	

	}

}
