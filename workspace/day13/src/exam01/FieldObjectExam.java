package exam01;

public class FieldObjectExam {
	int StudentNum;	//인스턴스 필드 - 객체가 생성되어야만 사용할 수 있음
	String name;	//인스턴스 필드 - 객체가 생성되어야 만 사용할 수 있음
	
	public static void main(String[] args) { //static메소드 - 클래스와 동시에 메모리에 적제
		
		
		
//		StudentNum = 12345;
//		name = "홍길동";
		
		
		//인스턴스멤버(필드,메소드)는 static 멤버에서 사용 할 수 없음
		//스태틱은 이미 메모리에 올리와 있고, 
		//인스턴스멤버는 언제 메모리에 올라올지 모르기 때문(객체가 생성되어야지만 메모리에 적제)
		
		//인스턴스멤버를 static 멤버에서 사용하려면 반드시 객체를 생성한 후 사용해야 함
		FieldObjectExam fo = new FieldObjectExam();
		fo.StudentNum = 12345;
		fo.name = "홍길동";
		
	

		
	}

}
