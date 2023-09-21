package bookexam;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BookExam199_9 {

	public static void main(String[] args) {
		//#1. 입력 받아 저장할 객체 생성
		Scanner scan = new Scanner(System.in);
		
		//#2. 변수 선언
		int students =0;
		int sum=0, max=0;
		double avg=0.0;
		int[] jumsu = null; //정수값을 담을수 있는 배열 선언, 아직 할당된 배열객체가 없음
			//int[] jumsu = {}
		
		while(true) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------------------");
			System.out.println("선택 > ");
			int num = scan.nextInt();
			
			if(num==1) {//학생수
				System.out.println("학생수> ");
			students = scan.nextInt();	// 학생을 입력 받아 students변수에 담기
			//students = Integer.parseInt(scan.nextLine());
			jumsu = new int[students];	//학생 수만큼의 배열 공간 만들기
			
			
		}else if(num==2) {//점수 입력	
			for(int i=0; i<students; i++) { //for(int i=0; i=jumsu.length; i++){
				System.out.println("score[" + i + "] > " );
				jumsu[i] = scan.nextInt(); //입력한 점수를 배열 담기
			}
			
				
		}else if(num==3) {//점수리스트
			for(int i=0; i<students; i++) { //배열 공간만큼 반복
				System.out.println("jumsu[" + i + "] : " + jumsu[i]  );//배열의 i 번째 요소의 값 출력
			}
			
			
		}else if(num==4) {	//최고점수, 평균점수
			max = jumsu[0];// max에 배열 요소의 첫번째 요소 값 담기
			for(int i=0; i<jumsu.length; i++){	//배열 공간만큼 반복
				if(max<jumsu[i]) {	// max에 담긴 값이 jumsu[i]에 담긴 값보다 작으면
					max = jumsu[i];// jumsu[i]번째 값을 max 에 담기
				}
				sum += jumsu[i]; //sum = sum + jumsu[i];
			}
			avg = (double)sum / students;//평균
			DecimalFormat f = new DecimalFormat("#,##0.0"); // 소수이하 자릿수 패턴 만들기
			System.out.println("최고 점수 : " +f.format(max));
			System.out.println("평균점수 : " + avg);
			
			
		}else if (num==5) {
			System.out.println("프로그램 종료");
			break;
		}//end of if
		
		}
		
		
		
		
		
	
		
		scan.close();
	}//end of main

}//end of class
