package variableExam;

public class Variable03 {

	public static void main(String[] args) {
//		변수는 블록의 가장 위에 선언
		int num01 = 5, num02 = 7, temp = 0; //변수선언하고 동시에 초기화
		temp = num01;
		num01 = num02;
		num02 = temp;

	
		
		System.out.println("num01 = " + num01);
		System.out.println("num02 = " + num02);

	}

}
