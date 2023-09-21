package loopexam;

import java.util.Scanner;

public class ForExam08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] students = new int[0];
		int[] score;
		int scoreList = 0;
		int	analyze = 0;
		int chose = 0;
		
		while(true) {
			
			System.out.println("-----------------------------------------------------------");
			System.out.println();
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println();
			System.out.println("-----------------------------------------------------------");
			chose = scan.nextInt();
			if(chose == 1) {
				System.out.println("선택 > " + chose);
				System.out.print("학생수 > ");
				
			}else if(chose == 2){
				System.out.println("선택 > " + chose);
				
			
			}
			
		}//while끝
		
		
		}//메인 끝
	
	}// 클래스 끝


