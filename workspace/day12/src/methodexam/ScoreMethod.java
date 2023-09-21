package methodexam;

public class ScoreMethod {
	//인스턴스 필드
	int jumsu;
	int sum;
	//static 필드
	static int score = 9;
	static String name="홍길동";
	
	//메인 메소드 - static 메소드
	// static 메소드와 static필드는 클래스가 메모리 읽혀질 때 함께 실행되어 메모리 먼저 만들어져 있음
	// instance 메소드나 instance 필드는 객체가 생성될 때 ㅔ메모리에 만들어짐
	// 따라서 static 멤버에서는 인스턴스 멤버를 불러쓸 수 없음 . 인스턴스 멤버가 언제만들어 질지 모르기 때문
	
	

	public static void main(String[] args) {
//인스턴스 멤버라 객체를 생성 해야만 사용할 수 있음		
//		jumsu = 70;
//		sum = jumsu + 100;
//		showTest();
	
	//객체 생성
	ScoreMethod sm = new ScoreMethod();
	sm.jumsu = 70;
	sm.sum = sm.jumsu + 100;
	
	System.out.println("sm.jumsu : " + sm.jumsu);
	System.out.println("sm.sum : " + sm.sum);
	sm.showTest();
	System.out.println();
	
	//주의) 메소드 안에서는 메소드를 호출할 수는 있지만
	//		메소드를 만들 수는 없음
	//=== 스태틱 멤버 사용 - 객체생성 없이 바로 사용 가능
	//	클래스명.필드
	//	클래스명.메소드
	System.out.println("이름 : " + ScoreMethod.name );
	ScoreMethod.score = 100;
	System.out.println("성적 : " + ScoreMethod.score);
	
	}
	// showTest 메소드 - 인스턴스 메소드
	public void showTest() {
		jumsu = 90;
		sum = jumsu + 50;
		System.out.println("*** showTest 메소드 실행 ***");
		System.out.println("점수 : " + jumsu);
		System.out.println("합계 : " + sum);
		// 인스턴스 메소드에서는 스태틱 멤버를 자유롭게 사용 가능
		// 인스턴스 메소드가 생성되기 이전에 이미 메모리에 올라와 있어서 가능
		System.out.println("이름 ; " + ScoreMethod.name);
		System.out.println("성적 ; " + ScoreMethod.score);
	}
	//static 메소드
	public static void scoreShow() {
		
		System.out.println("이름 : " + name );
		System.out.println("성적 : " + score );
		
		
		
		
		
		
	
		
	}
}
