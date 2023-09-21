package bookexam;

import java.util.Scanner;

public class WordExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		   String[][] fruits = {  
					  {"apple", "사과"},
					 { "watermelon", "수박"},
					 {"peach", "복숭아"},
					{"strawberry", "딸기"},
					{"tangerine", "귤"}
					};
		   //fruits[i][0] => 영어과일 이름
		 //fruits[i][1] => 한글과일 이름
		   
//		   String answear = "";
//		
//		   while(true) {
//			   System.out.println(fruits[0][0] + "한글 이름은?");
//			   answear = scan.next();
//			if(answear.equals(fruits[0][1])){
//				System.out.println("정답입니다");
//			}else {
//					System.out.println("오답입니다\n 정답은" + fruits[0][1] + "입니다.");
//			}
//			   System.out.println(fruits[1][0] + "한글 이름은?");
//			   answear = scan.next();
//				if(answear.equals(fruits[1][1])){
//					System.out.println("정답입니다");
//				}else {
//					
//					System.out.println("오답입니다\n 정답은" + fruits[1][1] + "입니다.");
//				}
//
//				   System.out.println(fruits[2][0] + "한글 이름은?");
//				   answear = scan.next();
//					if(answear.equals(fruits[2][1])){
//						System.out.println("정답입니다");
//					}else {
//						
//						System.out.println("오답입니다\n 정답은" + fruits[2][1] + "입니다.");
//					}
//
//					   System.out.println(fruits[3][0] + "한글 이름은?");
//					   answear = scan.next();
//						if(answear.equals(fruits[3][1])){
//							System.out.println("정답입니다");
//							
//						}else {
//							
//							System.out.println("오답입니다\n 정답은" + fruits[3][1] + "입니다.");
//							
//						}
//						System.out.println(fruits[4][0] + "한글 이름은?");
//						   answear = scan.next();
//						if(answear.equals(fruits[4][1])){
//							System.out.println("정답입니다");
//						}else {
//								System.out.println("오답입니다\n 정답은" + fruits[4][1] + "입니다.");
//						}
//						System.out.println(fruits[5][0] + "한글 이름은?");
//						   answear = scan.next();
//						if(answear.equals(fruits[5][1])){
//							System.out.println("정답입니다");
//							
//						}else {
//								System.out.println("오답입니다\n 정답은" + fruits[5][1] + "입니다.");
//								
//						}
//						break;
//
//
//			   
//			 
//		   }
		   
		   
		   
		   
		   for(int i=0; i<fruits.length; i++) {
		
				
		
			   //#1. 사용자가 입력한 단어를 담을 변수
			   String word = null;
			   
			   //#2. 질문형태 => 질문1) 'apple'의 뜻은?(한국어 이름은)?
			   // 질문 안내
			
			   System.out.printf("질문%d) '%s' 의 한국어 이름은?\n",i+1,fruits[i][0]);
			   //#3. 사용자가 입력한 값을 저장
			   word = scan.nextLine();	//scan.next(); 문자열을 읽어오기
			   
			   
			   //#4. 사용자가 입력한 값을 비교 => word.equals("사과")
			   if(word.equals(fruits[i][1])) {
				   System.out.println("정답입니다");
			   }else {
				   System.out.println("오답입니다.");
				   System.out.println("정답은 " + fruits[i][1] + "입니다.");
			   }
			   
			   
			   
			   
			   
			   
			   
			   
		   }
		   
		   
		   
		   
		   
		   
	}

}
