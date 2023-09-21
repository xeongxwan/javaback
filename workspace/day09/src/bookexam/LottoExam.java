package bookexam;

import java.util.Arrays;

public class LottoExam {

	public static void main(String[] args) {
		//#1/ lotto 번호를 담을 공간 확보
		// 1 - 45까지 번호, 중복안됨
	int[] lotto =  new int[45];	//정수를 담을 수 있는 공간 45개 힙영역에 만들기
		
	//	LOTTO 배열에 값 담기
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = i+1;	//1 ~45담기
		}
		//#3. lotto 배열에 담긴 값 확인
			System.out.println("섞기 전 : " + Arrays.toString(lotto));
			// Arrays.toString(배열) = > 배열의 내용을 문자열로 출력
			// Arrays.toString(배열) => 2차원 배열의 내용을 문자열로 출력
			
		//#4. lotto배열으, 내용을 섞기
			for(int i=0; i<100; i++) { //반복횟수가 많을 수록 잘 섞임
				//교환할 자리 랜덤으로 뽑기
				int k= (int)(Math.random()*45);	// 0 ~ 44 사이의 숫자 하나를 랜덤으로 발생
				
				//자리교환(섞기)
				int temp = 0;	//임시로 사용할 변수
				
				temp = lotto[0];
				lotto[0] = lotto[k];
				
				lotto[k] = temp;
				
				
			}
			//#5. lotto 배열의 내용 확인
			System.out.println("섞은 후 : " + Arrays.toString(lotto));
		//#6. lotto번호 출력
			System.out.print("이주의 로또 번호 : ");
			for(int i=0; i<6; i++) { //i값은 임의로 하면됨, 6개의 숫자만 뽑기하면 됨
				System.out.print(lotto[i] + " ");
			}
			System.out.println();
		
		
		
	

	
		
	}

}
