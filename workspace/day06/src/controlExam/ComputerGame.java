package controlExam;

import java.util.Scanner;

public class ComputerGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int com = 0;
		int user = 0;
		int count = 0;
		
		
		com = (int)(Math.random()*100)+1 ;
		
		System.out.println("컴퓨터가 생각하는 1~100 사이의 값 입력");
		while(true) {
			count ++;
			System.out.println(count+"번 시도했습니다.");
		user = scan.nextInt();
		if(com > user) {
			System.out.println("더 큰 값을 입력 하세요");
		}else if (com < user) {
			System.out.println("더 작은 값을 입력 하세요");
		}else if( com == user){
			System.out.println("정답입니다 " +count+"번만에 맞혔습니다");
			 System.out.println("컴퓨터가 생각한 값은" + com +"입니다.");
			 break;  // 반복문을 종료
		}
		}
scan.close();
	}

}
