package carexam;

public class Car {
	//#1.필드(=멤버변수,속성) : 힙영역의 객체 안에 생성, 인스턴스변수, 인스턴스필드
	//							객체가 만들어져야만 사용할 수 있음. 객체 만들어지지 않으면
	//							사용할 수 없음
	private String model;	//캡슐화. private ; 같은 클래스에서는 맘대로 사용가능
							//다른 클래스 에서는 사용할 수 없음
	private String color;
	private int speed;
//	 String model;
//	 String color;
//	 int speed;
	
	//#2. 생성자 - 객체를 초기화, 객체를 만들때 미리 준비시킬 사항들을 설정
	
	public Car() {	//기본 생성자
		//객체를 생성하면서 실행할 문장
	}
	
	//매개값을 가진 생성자
	public Car(String model,String color, int speed) {
		this.model = model;
		this.color = color;
		this. speed = speed;
		// 객체 생성시 초기화 시킬 내용을 여기 입력
	}
	//#. getter/setter설정 - private으로 설정된 필드
	//						 유효성 검사가 가능
	//	메소드
	//	getter : 필드 값을 외부로 전달, 그렇기 때문에 전달할 때
	//			전달하는 데이터의 타입을 설정
	//	setter : 설정, 수정, 삽입
	//	메소드명 get필드명() : 필드명의 첫글자를 대문자로
	//			 set필드명() : 필드명의 첫글자를 대문자로
	//			블(boolean) : is필드명
	// 단축기 : Alt + Shift + s
	// 마우스 오른쪽 : source + g
	public String getColor() {
		return color;	//return은 바로 뒷쪽의 값을 가지고 자신을
						//호출한 곳으로 되돌아감 즉 메소드를 종료
						//return 실행문 아래쪽에 있는 실행문은
						// 실행하지 않음
		//System.out.println("zzzz");	//return값; 뒤에 있는 문장이라
									//실행하지 않음
	}
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	//#3. 메소드 - 동작방식, 생략가능
	public void info() {
		System.out.println("model : " + model);
		System.out.println("color : " + color);
		System.out.println("speed : " + speed);
	}
	
	public void show(int num) {	//매개변수
		System.out.println(model +"는 나의" + num + "번째 자동차");
	}
	
	
	
	
}//end of public
