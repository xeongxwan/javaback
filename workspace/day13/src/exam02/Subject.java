package exam02;
//학생별로 수강 과목이 다르고, 학생들의 성적을 출력하기
//과목(Subject) 클래스 - 수강 과목을 담을 수 있게
//학생(Student) 클래스 - 학생 정보와 성적 처리를 할 수 있게
//실행(SubjectStudentExam) 클래스 


//	수강 과목을 처리할 클래스 
public class Subject {
	//인스턴스필드
	String subjectName;	//수강 과목
	int subScore; //과목점수
	
	//생성자
	public Subject() {
		//초기화 시킬 내용
		
		
	}
	
	
	public Subject(String subjectName, int subScore) {
		this.subjectName = subjectName;
		this.subScore = subScore;
	}

}
