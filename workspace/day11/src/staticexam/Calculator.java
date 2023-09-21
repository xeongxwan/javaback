package staticexam;

public class Calculator {
	//static 멤버
	int num;	//인스턴스 필드  - 객체가 생성될 때 객체 안에 만들어짐
	
	public static double pi = 3.141592; //static 필드, 클래스 로드 될때

	public static int plus(int x, int y) { //static 메소드 클래스가 로드 될때
		//num = 50;	//인스턴스필드 - 객체가 생성되어야지만 생성
		return x +y;
	}
	
	public static int minus( int x, int y) { //static 메소드
		int rs = plus(x,y);
//		int rs = add(x,y) - y; //인스턴스 메소드 - 객체생성되어야지만 사용 할 수 있음
//		show();	//
		return rs;
	}
	
	public int add(int x, int y) {	//인스턴스 메소드, 객체가 생성될 때 생성
//		int result = plus(x,y);
		
		return x + y;
	}
	
	public void show() {
		int rld = 7;	//지역변수,show()메소드 안에서 선언되어서
		
		System.out.println("원의 넓이 2= " + (rld*rld*pi));
	}
}

