package arrayexam;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Bookexam178 {

	public static void main(String[] args) {
		//2차원 배열 생성
		int[][] scores={{80,90,96},{76,88}};
		int firstSum=0, secondSum=0, allSum=0;
		double firstAvg=0.0, secondAvg=0.0, allAvg=0.0;
		
		//첫 번째 반의 합계 점수 , scores[0]
		for(int i=0; i<scores[0].length; i++) {
			firstSum += scores[0][i];
		}
		
		//#3. 첫 번째 반의 평균 점수
		firstAvg = (double)firstSum	/ scores[0].length;
		System.out.println("첫번째 반의 합계 : " + firstSum);
		System.out.println("첫번째 반의 평균 : " + firstAvg);
		System.out.println();
		
		//#4. 두번째 반의 합계, scores[1]
		for(int i=0; i<scores[1].length; i++) {
			secondSum += scores[1][i];
		}
		
		//#5. 두번째 반의 평균
		secondAvg = (double)secondSum	/ scores[1].length;
		System.out.println("두번째 반의 합계 : " + secondSum);
		System.out.println("두번째 반의 평균 : " + secondAvg);
		System.out.println();
		
		DecimalFormat f= new DecimalFormat("#,##0.00");	//소수이하 둘째 자리까지
							//# - 숫자,
							//0 - 숫자
		//DecimalFormat f= new DecimalFormat("패턴"); 패턴은 화면에 표시하고 싶은 포ㅐㅅ
		//			f.format(패턴을 적용할 숫자 또는 변수)
		System.out.println("첫번째 반의 평균 : " + f.format(firstAvg));
		System.out.println();
		
		//#6.전체 합계와 평균
		//int[][] scores={{80,90,96},{76,88}};
		int students=0;
		for(int i=0; i<scores.length; i++) {	//행 -1차원
			students += scores[i].length;	//열의 개수
			for(int j=0; j<scores[i].length; j++) {//열 -2차원
				allSum += scores[i][j];
			}//안 for 끝
			
		}//밖 for 끝
		allAvg = (double)allSum / students;
		System.out.println("전체 합계 : " + allSum);
		System.out.println("전체 평균 : " + allAvg);
		System.out.println();
		
		//#7.전체 점수를 출력(2차원 배열 출력 형식)
		for(int i=0; i<scores.length; i++) {	//행 -1차원
			for(int j=0; j<scores[i].length; j++) {//열 -2차원
			System.out.println(scores[i][j]);
			}//안 for 끝
			
		}//밖 for 끝
		
		//System.out.println(Arrays.toString(scores));//[[I@36aa7bc2, [I@76ccd017], 힙 메모리의 주소
		System.out.println(Arrays.deepToString(scores));	//2차원 배열 출력
									//Arrays.toString(배열명); //1차원 배열 출력
		
		
		System.out.println(scores);//[[I@36aa7bc2. 해시코드, scores라는 참조변수가 가리키는 곳의 메모리
		
		
		
		
		
		
		
			}//end of main

}//end of class
