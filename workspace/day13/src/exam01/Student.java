package exam01;
// 설계도,틀,붕어빵 틀
public class Student {
	//인스턴스 필드 - 객체가 생성될 때 메모리(힙)에 만들어짐,
	String ssn;
	String name;
	int score;
	
	//생성자 - 객체를 초기화, 객체를만들 때 생성자는 반드시 있어야함
	//			생성자를 생략하면 컴파일시 컴파일러가 기본 생성자를 추가
	public Student(String ssn, String name, int score) {
		// 객체를 만들때 초기화(미릴 준비시키고 싶은 것)시킬 내용을 작성
//		if(score < 0) {
//			System.out.println("성적 입력 오류");
//		}
		
		//인스턴스필드 - 지역변수
		this.ssn = ssn;
		this.name = name;
		this.score = score;
		
		
		
	}
	//성적 처리
	public String judgment(int score) {	//매개변수 - 외부에서 넘어오는 값을 받아서 임시러 저장(지역변수)
										//메소드 실행이 끝나면 메모리(스택)에서 사라짐
		String result = null;	//판정결과를 담을 변수, 지역변수, 메소드가 실행되는 동안만 메모리에 적재
		//60점 이상이면 합격, 그렇지 않으면 불합격
		if(score >= 60) {
			result = "합격";
		}else {
			result = "불합격";
		}
		return result;
			
	}
	
	//화면 출력용 메소드
	public void studentInfo() {
//	String callResult = judgment(89);
		System.out.println("***" + this.name + "님의 성적 확인 ***");
		System.out.println("학번 : " + this.ssn);	//ssn
		System.out.println("이름 : " + this.name);	//name
		System.out.println("점수 : " + this.score);	//score
		System.out.println("판정 : " + judgment(score));
		System.out.println();
		
		
	}
	
	
	
	
	

	
	
	
	
	
}
