package exam01;

public class StudentArrayExam {
	
	 public static void main(String[] args) {
		 //학생		-학번, 이름, 성적, 판정
//		 String[] ssn = new String[100];
		 String[] ssn = {"123", "456", "789"};
		 String[] names = {"홍길동", "김자바", "이기자"};
		 int[] score = {98,79,50};
		 
		 
		 for(int i=0; i<ssn.length; i++) {
			 String judg = null;
			 
			 if(score[i] >= 60) {
				 judg="합격";
			 }else {
				 judg="불합격";
			 }
			 System.out.println(" *** " + names[i] + "님의 성적 확인 ***");
			 System.out.println("학번 : " + ssn[i]);
			 System.out.println("이름 : " + names[i]);
			 System.out.println("성적 : " + score[i]);
			 System.out.println("판정 : " + judg);
			 System.out.println();
		 }
		 
	
		 
		 
		 
		 // 출력
		 // 학번 :
		 // 이름 :
		 // 성적 :
		 // 판정 :
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
	
	
	
	
}
