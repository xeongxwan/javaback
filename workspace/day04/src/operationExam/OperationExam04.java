package operationExam;

public class OperationExam04 {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
//		int c = a/b; //예외 발생 : ArithemeticExceptiom: / by zero
		// 정수 / 0 : 예외발생
		
//		System.out.println(c);
		
		double d = 10.5;
		double e = 0.0;
		double f = d/3;
		double g = d % e;
		
		System.out.println(f);//Infinity
		System.out.println(f + 30);//Infinity
		System.out.println(g);//NaN(Not a Number)
		
		System.out.println();
		
		if(Double.isInfinite(f)) {
			System.out.println("값을 산출할 수 없음");
		}else {
			System.out.println(f);
		}
		
		if(Double.isInfinite(g)) {
			System.out.println("값을 산출할 수 없음");
		}else {
			System.out.println(g);
		}
		
		
	}

}
