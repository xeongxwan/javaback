package bookexam;

public class VariableScope67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 =15;
		//if(조건) {조건이 참일 때 실행할 문장}
		
		if(v1>10) { //변수 v1에 담긴 값이 10보다 크면
			//아래 문장 실행
			int v2 = v1 - 10 ; 
			
			//v2는 if블록 안에서만 사용 가능
			//if블록을 벗어나면 메모리에서 제거
			
		}// end of if
		
		int v3 = v1 + v2 + 5; //v2 에러
							//if 블록을 벗어나면서 v2가 메모리에서 제거되어 v2라는 변수가
							//존재하지 않아서 에러
		

	}

}
