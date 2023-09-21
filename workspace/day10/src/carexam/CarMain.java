package carexam;

public class CarMain {

	public static void main(String[] args) {
		Car myCar = new Car("소나타","노랑",200);
		//private으로 선언된 필드를 호출하기에 에러
		//private으로 선언된 필드는 캡슐화(정보은닉)되어 있어
		//외부에서 호출 불가능 => 호출하려면 버튼 필요(getter/setter)
//		System.out.println("myCar.color : " + myCar.color);
//		System.out.println("myCar.speed : " + myCar.speed);
//		System.out.println("myCar.model : " + myCar.model);
		
		System.out.println("myCar.color : " + myCar.getColor());	//메소드 호출
		System.out.println("myCar.speed : " + myCar.getSpeed());
		System.out.println("myCar.model : " + myCar.getModel());
		System.out.println();
		myCar.info();
		System.out.println();
		
		myCar.show(3);//인자(=매개값), 메소드 호출
	}
}
