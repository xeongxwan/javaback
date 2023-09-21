package modifierexam01;

class ModifierDefaultTest{
	int grade = 3;
	String school = "이젠";
	
	
	void showDefaulutCalss() {
		System.out.println("*** 여기는 디폴트 클래스 연습 ***");
		System.out.println("학년 : " + grade);
		System.out.println("학교 : " + school);
	}
}


public class ModifierExam01 {
	//#1. public 연습
	public int score=2;
	public String name="김자바";
	
	public void showPublic() {
		System.out.println("이것은 public 메소드");
		System.out.println("성적 :" + score);
		System.out.println("이름 :" + name);
	}
	//#2. default 연습 (default : 클래스 메소드,필드, 생성자 다 사용)
	//	같은 패키지의 클래스에서는 자유롭게 사용 가능
	//	다른 패키지의 클래스에서는 사용할 수 없음
	int num = 4;
	String model = "default-1";
	
	void showDefault() {
		System.out.println("여기는 default 메소드");
		System.out.println("num : " + num);
		System.out.println("model : " + model);	
	}	
	
	//#3.private 연습
	//		private 접근 제한자 : 필드와 메소드, 생성자에만 선언 가능
	//			같은 클래스에서는 자유롭게 사용 가능
	//			다른 클래스에서는 사용할 수 없음
	//			외부에서 호출 하려면 getter/setter 메소드 이용
	
	private int jumsu = 30;
	private String color = "노랑";
	
	private void showPrivate() {
		jumsu = 80;
		System.out.println("*** 여기는 private로 선언된 필드 사용 ***");
		System.out.println("점수 : " + jumsu);
		System.out.println("색상 : " + color);
	}
	
	public void showPrivateCall() {
		showPrivate();
	}
	
	
	
}
