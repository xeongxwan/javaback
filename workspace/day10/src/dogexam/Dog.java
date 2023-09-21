package dogexam;

public class Dog {
	//#1.필드 
	
	
	
	String name;
	int age;
	
	
	
		//#2. 생성자 - 객체를 초기화 시킴
		// 기본 생성자 이외의 생성자가 만들어져 있으면 기본생성자는
		// 컴파일러가 자동으로 삽입하지 않음, 그래서 반드시 기본생성자를
		// 만들어 주어야 함
		//public Dog() {}; //기본생성자
		public Dog() {};
		
		public Dog(String name, int age) {
			this.name = name;
			this.age = age;
			
			//this : 자신의 객체 주소가 가리키는, 자기 자신 객체
		}
		
		public void showinfo() {	
			System.out.println("name : " + name); //this를 안붙여도 필드
			System.out.println("age : " + age);	//필드임을 알 수 있을 떄는 this 생략가능
	
			
		
	}
}
