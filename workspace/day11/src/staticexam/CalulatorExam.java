package staticexam;

public class CalulatorExam {

	public static void main(String[] args) {

		int r =3;
		System.out.println("원의 둘레 : " + (r * r * Calculator.pi));
		
		
		System.out.println("7 + 3 = " + Calculator.plus(7, 3));
		System.out.println("7 - 3 = " + Calculator.minus(7, 3));
		
//		Calculator.num = 7;  인스턴스 필드
//		Calculator.add(7,3); 인스턴스 메소드
		
		Calculator cal = new Calculator();	//객체 생성
		cal.num = 7;
		System.out.println(cal.num);
		
//		System.out.println("cal.add(7, 3) : " + cal.add(7, 3));
		int addResult = cal.add(7, 3);
		System.out.println(addResult);
		
		
		cal.show();
		
		
		
		
		
		
		
		
		
		
	}

}
