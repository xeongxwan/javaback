package modifierexam01;



public class ModifierTest01 {

		//포함 관계
	//public 설정 호출 연습
	ModifierExam01 a = new ModifierExam01();


	public void showA() {
		a.score = 90;
		System.out.println(a.score);
		System.out.println(a.name);
		a.showPublic();
	}
	
	
// default 설정 호출 연습
	ModifierExam01 b = new ModifierExam01();
	public void showB() {
		b.num = 7;
		b.model="default - 2";
		System.out.println("*** 같은 패키지 다른 클래스 에서 호출 ***");
		System.out.println("b.num :" + b.num);
		System.out.println("b.model :" + b.model);
		b.showDefault();
		System.out.println();
	}
	
	
	
//	private 설정 호출 연습
//	private은 자신의 클래스 에서만 자유롭게 사용가능
// 다른 클래스에서는 호출 불가
	ModifierExam01 c = new ModifierExam01();
	public void showC() {
//		c.jumsu = 90;
//		c.color = "파랑";
//		c.showPrivate();
		c.showPrivateCall();
	}
	
	

	//default class 테스트
	ModifierDefaultTest mdt  = new ModifierDefaultTest();
		
	public void showDefaultCalss() {
		mdt.grade = 5;
		mdt.school = "하남";
		System.out.println("*** 디폴트 클래스 ***");
		System.out.println("학년 : " +  mdt.grade);
		mdt.showDefaulutCalss();
		System.out.println();
	}
	
			
	
	

}
