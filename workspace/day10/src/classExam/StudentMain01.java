package classExam;

public class StudentMain01 {
	
	public static void main(String[] args) {
	//#1. 틀을 가져다 제품만들기(객체 만들기)	
		Student hong = new Student();
		
		hong.ssn = "202301";
		hong.name = "홍길동";
		hong.score = 70;
		
		System.out.println("hong.ssn : " + hong.ssn); //202301
		hong.showinfo();
		System.out.println();
		
		//#3.김자바 학생의 객체 만들기
		Student kim = new Student();
		
		//#4.객체를 사용
			kim.ssn= "202302";
			kim.name= "김자바";
			kim.score= 90;
			
			System.out.println("kim.ssn : " + kim.ssn );
			System.out.println();
			
			kim.showinfo(); //메소드  호출
		
	}

}
