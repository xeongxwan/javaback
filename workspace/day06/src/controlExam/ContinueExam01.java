package controlExam;


public class ContinueExam01 {

	public static void main(String[] args) {
		// 1 ~ 100까지의 짝수의 합 
		//#1. 방법1
		int evenSum=0;
		for(int i=1; i<100; i++) {
			if(i % 2 == 1) {
				evenSum += i; //
				
			}
			//if(i % 2 ==0) evenSum += i;
		}
		System.out.println("1~100까지 짝수의 합 = " + evenSum);
	
		//#2. 방법2
		int evenSum02 = 0;
		for(int i=1; i<=100; i++) {
			if(i % 2 == 1) {//홀수 일떄는
				continue;//증감식 부분으로 이동하라
				}
			
			evenSum02 += i;
			
		}
		System.out.println("1~100까지 짝수의 합 = " + evenSum02);
		
		//#3. 방법3
		
		int evenSum03 = 0;
		for(int i=1; i<=100; i++) {	// i는 지경변수,이곳 for문에서만 사용되고
									//for문이 종료되면 메모리에서 사라짐
			if(i % 2 != 0) {//홀수 일떄는
				continue;//증감식 부분으로 이동하라	
				}
			
			evenSum03+= i;
			
		}
		System.out.println("1~100까지 짝수의 합 = " + evenSum03);
		//#4. 방법4
		int i =1;
		int evenSum04=0;
		
		while (i<=100) {
			if(i % 2 == 0) {
				evenSum04 += i;
			}
			i++;
		}
		System.out.println("1~100까지 짝수의 합 = " + evenSum04);
		//#4. 방법5
		int k =1;
		int evenSum05=0;
		
		while (k<=100) {
			k++;
			if(k % 2 == 1) {continue;}
				evenSum05 += k;
			
		}
		System.out.println("1~100까지 짝수의 합 = " + evenSum05);
		
		
		
		
	}

}
