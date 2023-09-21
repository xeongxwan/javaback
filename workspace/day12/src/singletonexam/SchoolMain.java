package singletonexam;

public class SchoolMain {

	public static void main(String[] args) {
		//School sc = new School();	// 컴파일 에러 
									// 싱글톤으로 외부에서 객체 생성 불가
									// 생성자 호출 불가
		
		School scSingle01 = School.getInstance();
		School scSingle02 = School.getInstance();
		
		System.out.println(scSingle01);
		System.out.println(scSingle02);
		
		
	}

}
