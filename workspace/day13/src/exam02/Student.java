package exam02;

import java.text.DecimalFormat;

//학생 정보와 성적 처리
public class Student {
	String sn; //학번
	String name; //이름
	Subject[] subject; //수강 과목별 점수
	
//	subject[] subject = new Subject[subjectNum]
	public Student(String name, String sn) {
		this.name = name;
		this.sn = sn;
		
		
	}
	
	// 과목별로 점수 확인
	public void individualScore() {
		System.out.println("*** " + name + "님 수강과목 현황 ***");
		
		
		for(Subject arrSubject : subject) {
			System.out.println(arrSubject.subjectName + "," + arrSubject.subScore);
		}
		System.out.println();
		
	}
	
	
	
	//과목 총점과 평균을 확인
	
	DecimalFormat f =new DecimalFormat("#,##0.0");	//평균점수 소수이하 첫째자리까지 표시할 패턴
	
	public void showInfo() {
		
		
		int scoreSum = 0;
		double avg = 0.0;
		for( int i=0; i<subject.length; i++) {
			scoreSum += subject[i].subScore;
		}
		avg = (double)scoreSum / subject.length;	//점수, 과목수
		
		System.out.println("*** " + name + "님의 성적 현황 ***");
		System.out.println("학번 : " + sn);
		System.out.println("총점 : " + scoreSum);
		System.out.println("평균 : " + f.format(avg));
		System.out.println();
		
		
			
	}
	
	
	
	
	

}
