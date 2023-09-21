package operatorExam;

public class Operator03 {

	public static void main(String[] args) {
//문제3) 연필이 357자루가 있습니다. 학생이 13명이면 학생당 몇 자루 씩을 
//      나누어 주어야 하며  나머지는 몇 자루인가?  
//      즉,  학생1인당 받을 연필 개수와 나눠주고 남은 연필의 개수 구하기

	//#1. 변수 선언
	int pencils=357, students=13, pencilsPerStudent=0, restPencils=0;
    // int pencilsPerStudent = pencils / students;
	// int restPencils = pencils % students;
	
	// #2. 계산
	pencilsPerStudent = pencils / students;  // 정수 / 정수 => 정수,  27
	restPencils = pencils % students;  //나머지 , 6
	
	// #3. 출력
	System.out.println("학생 1인당 연필 개수 = " + pencilsPerStudent); 
    System.out.println("나머지 연필 개수 = " + restPencils);
	
	
	}

}
