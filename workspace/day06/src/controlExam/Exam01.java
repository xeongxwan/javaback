package controlExam;

public class Exam01 {

	public static void main(String[] args) {
		// 1 ~ 5까지의 정수의 합
		// #1.	for문
		int sumFor = 0;
				for(int i=0; i<=5; i++) {
					sumFor += i;
					System.out.println("i = " + i);
					System.out.println("1 ~ 5까지 정수의합 : "+ sumFor);
				}
		
		
		// #2.	while문
		int i=1;
		int sumWhile = 0;
		
		
		while(i<=5) {
			sumWhile += i;	//sumWhile = sumWhile + i;
			System.out.println("i =" + i);
			System.out.println("1 ~ 5까지 정수의합 : "+ sumWhile);
			i++;	// ++i; i=i+1; i +=1;
		
		}

		
		
		
		
		
		
		
		
		
	}

}
