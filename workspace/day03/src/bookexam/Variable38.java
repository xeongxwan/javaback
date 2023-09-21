package bookexam;

public class Variable38 {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		int temp = 0; //임시로 값을 담을 변수 int temp=0;
		System.out.println("변경전 => x : " + x +", y : " + y);
		
		temp = x;
		x = y;
		y = temp;
		System.out.println("변경후 => x : " + x + ", y : " + y);
		
		//정수 : byte, char , short, int, long
		//정수 : byte, short, int, long
		//문자 : char(문자, 정수)
		//실수 : float, double
	}

}
