package methodexam;

public class StaticMethodMain {

	public static void main(String[] args) {
		//static 멤버는 객체를 생성하지 않고 바로 사용 가능
		// 클래스명 , 필드명
		//	클래스명 , 메소드명
		//	메소드영역(=데이터 영역 , 클래스 영역) 메모리에 만들어짐
		//	클래스가 메모리로 읽혀질때 함께 메모리에 만들어짐
		StaticMethodExam.snum = 8;
		
		int saddResult = StaticMethodExam.sadd(10,20);
		System.out.println(saddResult);
		System.out.println(StaticMethodExam.sadd(30, 40));
		
		
	}

}
