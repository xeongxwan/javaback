package bookexam;

import java.util.Scanner;

public class ArrayExam02 {

	public static void main(String[] args) {
		//숫자를 입력받아
	    // 숫자만큼 증가하고 행도 숫자 만큼 만들기
		
		
		int n = 1;	//숫자를 누적시켜 저장할 변수, 시작은1부터
		int k = 0;	//행과 열을 결정짓기 위해 사용자로부터 입력받은 값을 저장할 변수
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력 >>");
		k = scan.nextInt();
		
		for(int i=0; i<k; i++) {	//행
			for(int j=0; j<k; j++) {	//열
				System.out.printf("%5d",n);
				n = n + k;	//n =+= k;
				
				
				
				
				
				
				
				
			}//안쪽 for 끝
			System.out.println();
		}//바깥쪽 for 끝
		
		
				
		
		
		
		
		
		
		
	}//end of main

}//end of class
