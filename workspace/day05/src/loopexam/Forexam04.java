package loopexam;

import java.util.Iterator;

public class Forexam04 {

	public static void main(String[] args) {

		int evenSum = 0; //짝수의 합
		int oddSum = 0; //홀수의 합
		
//		for(int i=1; i<100; i++) {
//			
//			if(i % 2 == 0) {
//			sum += i; //sum = sum + i;
//			}
//		}
		for(int i=1; i<=100; i++) {
			
			if(i % 2 == 0) {
				evenSum += i;			
		}else {
			oddSum += i;
			
		}
	}
		System.out.println("1~100까지 짝수 합 =" + evenSum);
		System.out.println("1~100까지 홀수 합 =" + oddSum);
	}
}
