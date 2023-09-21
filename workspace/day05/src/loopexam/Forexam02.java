package loopexam;

public class Forexam02 {
	
	public static void main(String[] args) {
	
	int sum = 0;// 합을 담을 변수
	int  sum01 = 0;
		
		for(int i = 1; i<=100 ; i++) { /// i=i+1
			sum = sum + i;	// sum += 1;
			//System.out.println("합 : " + sum); //조건을 만족하지 않을 때까지 반복
		}
		System.out.println("합 : " + sum);
		
		
		//방법2
		for(int i=100; i >=1 ; i--) {
			sum01 = sum01 + i;	// sum += 1;
		}
		System.out.println("합2 : " + sum01);
	}		
}

