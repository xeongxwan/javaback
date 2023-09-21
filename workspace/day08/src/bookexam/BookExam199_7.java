package bookexam;

import java.lang.reflect.Array;

public class BookExam199_7 {

	public static void main(String[] args) {
		//최댓값이나 최솟값을 구하기 위해서는 비교해서
		// 가장 큰값이나 가장 작은 값을 담을 변수가 필요
		// 최댓값을 담을 변수를 선언시 초기값 : 배열의 첫 요소(0번째 요소) 값을 담든지
		//	말도 안되는 작은 값을 초기값을 담아 놓는다.
		// 최솟값을 담을 변수를 선언할 때 초기값 : 배열의 첫 요소(0번째 요소) 값을 담든지
		// 말도 안되는 큰 값(비교하려는 값들에 없는 큰 값)을 초기값으로 담아 놓는다.
		
		int[] array = { 1, 5, 3, 8, 2 };
		int max = 0; //int max = array[0];
		int min = 99; //int min = array[0];
		
		for(int i=0; i<array.length; i++) {
			
			if( max < array[i] ) {
				max = array[i];
			}
			if( min > array[i] ) {
				min = array[i];
			}
		}
		System.out.println("최댓값 = " + max);
		System.out.println("최솟값 = " + min);
		
		
	}

}
