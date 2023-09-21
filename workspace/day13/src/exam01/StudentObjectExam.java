package exam01;

public class StudentObjectExam {

	public static void main(String[] args) {

		
		// 클래스(설계도, 틀) -> 클래스인스턴스(=객체, 붕어빵) 만들기 -> 사용
		//#1. 객체 생성(학생 객체)
		
		Student hong = new Student("123", "홍길동", 50);
		Student kim = new Student("124", "김기자", 90);
		Student lee = new Student("125","이자바", 83);
		
		
		//#2.객체 사용
		hong.studentInfo();
		System.out.println("---------------------");
		
		kim.studentInfo();
		System.out.println("---------------------");
		
		lee.studentInfo();
		System.out.println("---------------------");
		
	}

}
