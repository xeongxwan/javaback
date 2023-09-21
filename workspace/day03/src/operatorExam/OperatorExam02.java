package operatorExam;

public class OperatorExam02 {
	
	public static void main(String[] args) {
		int value = 789;
		int divideValue = 0;
		int restValue = 0;
		
		divideValue = value / 100; //7
		restValue = value % 100; //89
		
		divideValue = divideValue + (restValue / 10);
		// divideValue +=  (restValue / 10);
		divideValue = divideValue + (restValue % 10);
		// divideValue +=  (restValue % 10);
		
		
		System.out.println(divideValue);	//24
		
}
}
