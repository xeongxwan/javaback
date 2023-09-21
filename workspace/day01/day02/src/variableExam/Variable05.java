package variableExam;

public class Variable05 {
	public static void main(String[] args) {
		int ban=2, bunho=7, kor=90, eng=90, mat=95, sum=0;
		String name = "홍길동";
		double avg = 0.0;   // float avg = 0.0f; 
							// int a  = 4;  long a = 4L;
		
		sum = kor + eng + mat;
		avg = (double)sum / 3;
		// avg = sum / 3.0;
		
		//화면 출력
		System.out.println("===================================================================");
		System.out.println("반\t 번호\t 이름\t 국어\t 영어\t 수학\t 합계\t 평균");
		System.out.println("==================================================================");
		System.out.printf("%d\t %d\t %s\t %d\t %d\t %d\t %d\t %.2f\n",ban,
				+ bunho, name, kor, eng, mat, sum, avg );
		System.out.println("==================================================================");
		
	}
}
