package methodexam;

public class InstanceMethodExam01 {
	int num;
	
	public int add(int x, int y) {
		int result = num = x +y;
		
		return result;
		
			
	}
	//메소드 오버로딩 : 메소드 이름은 같고, 매개변수 개수가 다르거나, 매개변수의 타입이 다른 것
	public int divide(int x, int y) {
		if(y==0) {
			System.out.println("0으로 나눌 수 없습니다");
			return 0;
		}
		return x / y;
		
	}
	
	public double divide(double x, int y) {
		if(y==0) {
			System.out.println("0으로 나눌수 없습니다.");
			return 0; 
		}
		return x / y;
	}
	
	
	
	
	
}
