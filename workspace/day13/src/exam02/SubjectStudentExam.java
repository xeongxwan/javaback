package exam02;

public class SubjectStudentExam {

	public static void main(String[] args) {
		
		//#1. 홍길동 학생 객체 - 3과목 수강
		Student hong = new Student("홍길동","202030301" );
		//#1. 홍길동 과목과 정수에 대한 객체를 생성해서 배열에 담기
		hong.subject = new Subject[] {
				new Subject("국어",85),
				new Subject("영어",90),
				new Subject("수학",73)	
		};
		
		
		
		hong.showInfo();
		System.out.println();
		
		
		hong.individualScore();
		System.out.println();
		
		
		
		//#2. 김기자 학생 객체 - 2과목 수강
		Student kim = new Student("김기자", "20230302");
		kim.subject = new Subject[] {
				new Subject("과학" , 90 ),
				new Subject("역사" , 80 )
					
		};
		kim.individualScore();
		System.out.println();
		
		kim.showInfo();
		System.out.println();
		
		
		
		
		//#3. 이자바 학생 객체
	
		
		
	}

}
