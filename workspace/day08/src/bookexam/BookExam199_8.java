package bookexam;

import java.text.DecimalFormat;

public class BookExam199_8 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}};
				int sum=0, count=0, max = array[0][0], min = array[0][0];
				double avg = 0.0;		
		
		
		for(int i=0; i<array.length; i++) {	//행 -1차원
			
			for(int j=0; j<array[i].length; j++) {	//열 -2차원(1차원 배열의 배열)
			//#1.합계
				sum += array[i][j]; // sum = sum + array[i][j];
				
			//#2.최댓값
				if( max < array[i][j]) max = array[i][j];
				
			//#3.최솟값	
				if( min > array[i][j]) min = array[i][j];
			//#4. 배열의 전체 개수
				count++; //count = count + 1; count += 1;
			}//안 for 끝
		}//밖 for 끝
		avg = (double)sum / count;
	
		DecimalFormat f = new DecimalFormat("#,##0.0"); 
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + f.format(avg));
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
		
		
		
		
		
		
	
	}

}
