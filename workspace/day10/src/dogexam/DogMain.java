package dogexam;

public class DogMain {
	
	public static void main(String[] args) {
		//#1.객체 생성
		
		// Dog dog1 = new Dog();	//The construtor Dog() is 
						//기본 생성자를 호출,
						//Dog클래스에는 기본생성자 만들어져 있지 않아서 에러
	
		Dog dog02 = new Dog("멍멍이",4);
		System.out.println("dog2.name : " + dog02.name);
		System.out.println();
		dog02.showinfo();
		
		
	}

}
