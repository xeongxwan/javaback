package singletonexam;

public class School {
	//#1. 필드(정적 필드)
//	private static 클래스명 참조변수명 = new 생성자();
	private static School instance = new School();	
	//자신의 타입으로 정적 필드 선언하고 미리 객체를 생성해서 초기화
	//private을 붙여서 외부에서 함부로 변경하지 못하게 하기 위해
	
	//#2. 생성자 - private을 붙여 외부에서 생성자를 호출할 수 없도록 설정
	//				같은 클래스에서는 호출 가능 ( private static School instance = new School(); )
	private School() { }
	
	//#3. 메소드 - 정적(static)메소드
	// 접근제한자 static  리턴타입(School) 메소드명(){}
	public static School getInstance() {
		return instance; //instance School 객체의 주소를 참조하고 있으므로
						//return 타입이 School이 됨
		
	}
}

