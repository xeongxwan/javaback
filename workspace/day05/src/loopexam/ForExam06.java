package loopexam;

public class ForExam06 {

	public static void main(String[] args) {
		 int sum = 0;
		 
		 for(int i=1; i<=20; i++){
			 
			 if( !(i%2==0 || i%3==0)) {
				 sum += i;
			 }//if 끝
		 }//for 끝
		 System.out.println("합계 =" + sum);
	}
}

