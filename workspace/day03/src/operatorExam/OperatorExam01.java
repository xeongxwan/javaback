package operatorExam;

public class OperatorExam01 {

	public static void main(String[] args) {

		int a = 5;
		int b = 3;
		int c = 2;
		
		
		System.out.println(++a + --b + c++);
		// ++나 --가 변수 앞에 붙으면 : 나 먼저 증강하고 계산에 참여
		// ++나 --가 변수 뒤에 붙으면 : 계산 먼저하고 증감
	}

}
