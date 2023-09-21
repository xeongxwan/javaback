package methodexam;
//설계도, 틀 , 붕어빵 틀
public class Calculator {
	//	교재 p.231
	//powerOn -> 전원을 켭니다.
	//powerOff -> 전원을 끕니다.
	//plus -> 정수 값 2개를 매개값으로 받아서 더한 후 그 결과를 리턴
	//divide -> 정수 값 2개를 매개값으로 받아서 나눈 후 결과를 리턴
	
	//#1. 필드 - 생략 가능
	//#2. 생성자 - 생략가능 : 생성자가 하나도 없으면 컴파일러가 컴파일시 자동으로 삽입
	
	//#3. 메소드 - 동작 방식, 인스턴스메소드 만들기
	
	//접근제한자 반환타입 메소드명(매개변수,....){ 실행 문장 }
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	public int plus(int num1, int num2) {
//		int result = num1 + num2;
//		return result;
		return num1 + num2;	//return 메소드를 빠져나감, return 아래쪽 실행문장들은 의미가 없어짐
							//자신을 호출한 곳으로 되돌아감
	}
	
	public double plus(int num1, int num2,int num3) {
		return num1 + num2 + num3;
	}
	
	public double plus(double num1, double num2) {
		return num1 + num2;
	}
	
	public double plus(int x, double y) {
		return x + y;
	}
	
	//메소드 오버로딩(overloading) : 메소드의 이름이 같고, 매개변수의 개수가 다르거나, 매개변수의 타입이 다른 것
	//					매개변수의 개수가 같아도 타입이 다르면 됨
	//					리턴타입은 의미 없음
	//			메소드 이름은 같되 매개변수의 타입, 개수, 순서가 다른 메소드
	//			여러개 선언하는 것을 말한다.
	//		사용 목적 : 다양한 매개값을 처리 하기 위해서
	
	public double divide(int x, int y) {
		//정수 / 정수 = 정수
		//실수 / 정수 = 실수
		//정수 / 실수 = 실수
//	return (double) x /y;
	return x / (double)y;
		}
	
	
	public void divide(int x, int y, int z) {
		// (x + y) / z
		
		if(z==0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return; //메소드 종료, 생략가능
		}
		
		System.out.println("(x + y) / z =" + (x + y) / z);
		
	}
	
	
	}
	
	
	

