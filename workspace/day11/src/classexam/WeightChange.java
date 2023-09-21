package classexam;
//1. 설계도 
public class WeightChange {
//	몸무게 변화를 체크 (클래스)
//	클래스(설계도, 틀, 붕어빵틀) -> 객체를 생성(붕어빵, 아파트, 인스턴스) -> 객체를 사용하기 위해
//	이름, 키, 몸무게를 받아 저장 필드
//	몸무게의 증감을 처리할 메소드 (몸무게 증가 메소드, 몸무게 감소 메소드)
//				홍길동, 170.8, 70.3
//			변화된 몸무게를 입력하세요.
//			증가는 양수로, 감소는 음수로 입력>>
	
//	실행클래스 하나 필요(main())
//	객체를 생성 -> 재료를 넣어 주기, 재료를 가지고 객체(인스턴스) 만들기
//	객체를 사용 
	
	
	//#1.필드(=멤버변수) - 객체 안에 만들어짐, 힙영역에 존재, 인스턴스 필드
	//						객체가 만들어져야만 사용할 수 있게 처리
//	String name;	//이름
//	double height;	//키
//	double weight;	//몸무게
	private	String name;	//이름
	private	double height;	//키
	private	double weight;	//몸무게
	//private : 접근제한자, 같은 클래스에서는 맘대로 사용할수 있지만
	//			클래스가 달라져 이것을 사용할 수 없음
	//			외부접근하려면 getter/setter, boolen -> is

	
	
	
	
	//#2. 생성자 - 객체를 초기화, 클래스에는 반드시 생성자 있어야 함
	public WeightChange() {
		//this(); //자신의 생성자 호출, 반드시 가장 위에 있어야함
		this("김자바",75.3,90.7);
		
		
		
		
		
	}//기본 생성자	
	
	
	
	public WeightChange(String name, double weight) {
//		super();	// 부모 생성자를 호출
//		this.name = name;	//필드 - 지역변수, this : 자기 객체
//		this.weight = weight;
		this(name, 180.3, weight);
	}
	
	public WeightChange(String name, double height, double weight) {
		super();	// 부모 생성자를 호출
		this.name = name;	//필드 - 지역변수, this : 자기 객체
		this.height = height;
		this.weight = weight;
	}
	//생성자 오버로딩 ; 생성자 이름은 같고, 매개변수의 개수나 타입만 다른 것
	
	
	//#3. 메소드
	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	//#4. 몸무게 증가 메소드
	// w-몸무게의 변화된 값
	public void gainWeight(double w) {	// 증가한 몸무게 값을 매개값(인자)로 받아 처리
		System.out.println("살이 찌기 전 몸무게 : " + this.weight + "kg 입니다.");
		weight += w;	//몸무게 증가, this.weight = this.weight + w;
		System.out.println(w + "만큼 증가해서 현재 " + weight + "kg입니다.");
	}
	
	//#5. 몸무게 감소 처리하는 메소드
	public void reduceWeight(double w) {
		System.out.println("살이 빠지기 전 몸무게 : " + this.weight + "kg 입니다.");
		weight -= Math.abs(w);	//몸무게 증가, this.weight = this.weight + w;
		System.out.println(w + "만큼 감소해서 현재 " + weight + "kg입니다.");
	}
	
	
	
	//#6. 전체 정보를 보여주는 메소드
	public void showinfo() {
		System.out.println("*** " + name + "님의 건강 정보 ***");
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
