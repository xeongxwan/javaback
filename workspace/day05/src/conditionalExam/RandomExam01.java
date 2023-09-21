package conditionalExam;

public class RandomExam01 {

	public static void main(String[] args) {
		//0.0 <= ran01 < 1.0
		double ran01 = Math.random();
		System.out.println("ran01 : " + ran01);//실수
		
		//0.0 < ran02 < 7.0
		double ran02 =Math.random() * 7;
		System.out.println("ran02 : " + ran02);
		
		//3.0 <= ran03 < 10.0
		double ran03 =Math.random() * 7 +3;
		System.out.println("ran03 : " + ran03);
		
		// 0 <= ran04 < 5
		//int intRan01 = (int) Math.random() * 5; 
		// 무조건 결과가 0
		// (int) Math.random()의 결과는 항상 0 이 되어 어떤 숫자를 곱해도 0
		int intRan01 = (int)(Math.random() * 5); //0, 1, 2, 3, 4 중 하나의 값
		System.out.println("intRan01 : " +
		intRan01);
		
		// 1, 2, 3, 4, 5 가 출력되도록
//		

		
	}

}
