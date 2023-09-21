package bookexam;

public class Exam_15 {

	public static void main(String[] args) {
		
		int[] array = {35,87,65,57,93,55};
		
		
		int sum = 0; //합계
		int max = array[0]; //최댓값
		int min = array[0]; //최솟값
		double avg = 0.0;	
		//                                    
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}

		//                                    
		avg = (double)sum / array.length;
	
		//                                    
		for(int i=0;i<array.length;i++) {
		    if(max<array[i]) {
			
			max = array[i];
		    }
					
		    if(min>array[i]) {
		
			min = array[i];
		    }
		}
		
		System.out.println("합계 : " + sum);
		System.out.println();
		System.out.printf("평균 : " + "%.2f\n",avg);
		System.out.println();
		System.out.println("최댓값 : " + max);
		System.out.println();
		System.out.println("최솟값 : " + min);
		
	}//end of main

}//end of while
