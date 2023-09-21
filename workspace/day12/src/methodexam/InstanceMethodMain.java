package methodexam;

public class InstanceMethodMain {

	public static void main(String[] args) {
		//인스턴스필드나 메소드는 반드시 객체를 생성한 후 사용
//		InstanceMethodExam01.num;
//		InstanceMethodExam01.add(10,20);
		
		//객체 생성
		InstanceMethodExam01 im = new InstanceMethodExam01();
		im.num = 8;	//객체 안에 생성, 객체가 만들어져야만 사용 가능
					//인스턴스 필드
		int addResult = im.add(7, 10);
		System.out.println(" 7 + 10 = " + addResult);
		System.out.println(" 10 + 20 = " + im.add(10,20));
		System.out.println((" 7 / 0 = " + im.divide(7, 0)));
		System.out.println((" 7 / 3 = " + im.divide(7, 3)));
		System.out.println(" 35.3 / 3 = " + im.divide(35.3, 3));
	}

}
