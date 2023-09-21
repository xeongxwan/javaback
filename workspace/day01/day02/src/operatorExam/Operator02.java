package operatorExam;

public class Operator02 {

	public static void main(String[] args) {
		//문제2) 5를 2로 나눠 나머지가 1이면 "제주", 나머지가 0이면 "울릉도" 로 처리하시오. 
		// 구하려는 것 : 제주, 울릉도 
		// 조건 : 5를 2로 나눠 남은 나머지가 1이냐
		
		String result ; //문자열
		
		result = (5 % 2 == 1) ? "제주" : "울릉도";
		
		System.out.println(result);
	}

}
