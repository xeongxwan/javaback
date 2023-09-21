package operator;

public class Operator03 {
	
	public static void main(String[] args) {
		//1. 변수선언
		
		int pencils = 357, student =  13, pencilsPerStudent=0, restPencils =0;
		
		//2.계산
		pencilsPerStudent= pencils/student;
		restPencils = pencils % student ;
		
		//3.출력
		System.out.println("학생 1인당 연필 개수 = "+ pencilsPerStudent); //27
		System.out.println("나머지 연필 개수 = "+ restPencils); //6
		
		
	
		
	}

}
