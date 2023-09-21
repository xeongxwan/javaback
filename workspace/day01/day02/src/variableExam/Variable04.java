package variableExam;

public class Variable04 {

	public static void main(String[] args) {
		int kor = 80, eng = 75, mat = 90, sum = 0;
		double avg = 0.0, avg01 = 0.0 ; //초기화
		
		sum = kor + eng + mat;
		avg = sum / 3;    // 정수 / 정수 = 정수
						  // 245  / 3  = 81
		// 자바에서 왼쪽의 자료형과 오른쪽의 자료형은 언제나 같아야 함
         //     실수 = 정수  =>  실수 = 정수.0 => 실수 = 실수
		 //      avg = 81    =>  avg  = 81.0  
		 // 결과가 81.66..... 이 되어야 하는데 현재 81.0이 되어 있음
		
		// 정상적인 결과를 얻기 위해 정수를 강제적으로 실수로 바꾸어 처리
		//  강제 형변환 
		//  큰 자료형과 작은 자료형이 연산(+ , - , *, /)을 하면 큰 자료형으로 변환
		avg01 = (double)sum / 3;   // avg01 = 실수 / 정수 => 실수
		//avg01 = sum / 3.0; // avg01 = 정수 / 실수 => 실수
		
		//  "가나다" + 10  => "가나다10"
		//  "가나다" + kor => "가나다80"
		//   "34" + 2 + 3  => 3423
		//   2 + 3 + "34"  => 534
		//   "34" + (2 + 3) => 345  , ()가 연산자 우선순위
		
		System.out.println("국어 = " + kor);
		System.out.println("영어 = " + eng);
		System.out.println("수학 = " + mat);
		System.out.println("합계 = " + sum);
		System.out.println("평균01 = " + avg);
		System.out.println("평균02 = " + avg01);
		System.out.println();
		
		System.out.println("=================================================");
		System.out.println("국어\t 영어\t 수학\t 합계\t 평균01\t 평균02");
		System.out.println("=================================================");
		//System.out.println(kor+"\t" + eng + "\t" + mat + "\t" + sum + "\t" + avg + "\t" +avg01);
		System.out.printf("%d\t %d\t %d\t %d\t %.1f\t %.1f\n",kor,eng,mat,sum, avg, avg01);
		// %d-정수 , %s-문자열, %f-실수, %5d,  %10.2f, %.2f
		System.out.println("=================================================");
		
		
	}

}



