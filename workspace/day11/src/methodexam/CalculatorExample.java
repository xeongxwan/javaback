package methodexam;

public class CalculatorExample {
	
	public static void main(String[] args) {
	//객체를 생성
	Calculator cal = new Calculator();
	
	//객체를 사용
	cal.powerOn();
	
	System.out.println(cal.plus(7.7, 3.5));
	
	int result = cal.plus(3, 5);
	System.out.println(result);
	
	
	
	
	
}
	
}
