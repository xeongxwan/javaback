package exam01;

public class StudentArrayObjectExam {

	public static void main(String[] args) {

		
		//Student 클래스 타입을 사용하는 객체를 담을 변수 선언
//		Student[] std = new Student[3];
		
		
		//#2.배열에 객체 담기(객체의 주소가 담긴다)
//		std[0] = new Student("123", "홍길동", 50);
//		std[1] = new Student("124", "김기자", 90);
//		std[2] = new Student("125", "이자바", 83);
		
		Student[] std = { new Student("123", "홍길동", 50),
					new Student("124", "김기자", 90),
					new Student("125", "이자바", 83) };

		
		
		
		
		//	for 반복문 이용 출력
		for(int i=0; i<std.length; i++) {
			std[i].studentInfo();
			System.out.println("---------------------");
			System.out.println();
		}
		
		//향상된 for문을 이용한 출력
		System.out.println("향상된 for문 이용 출력");
		for(Student st : std) {
			st.studentInfo();
			System.out.println("---------------------");
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}//end of main

}
