package classexam;

import java.util.Scanner;
//import java.lang.*;

public class WeightChangeMain {

	public static void main(String[] args) {
		//객체 생성(인스턴스 만들기)
		WeightChange wc = new WeightChange("홍길동",175.3,85.7);
//		System.out.println(wc.name); //private으로 선언 되어 있어서
									 //외부에서 직접 호출할수 없음
		
		System.out.println(wc.getName());
		System.out.println();
		
		wc.showinfo();
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		double w=0.0; //변화된 몸무게 받을 변수
		
		System.out.println("변화된 몸무게 입력해주세요..");
		System.out.println("증가는 양수로 감소는 음수로 입력>>");
		w = scan.nextDouble();
		
		//w - 양수 gainWeight(double w) 호출
		//w - 음수 reduceWeight(double w) 호출
		if(w > 0.0) {
			wc.gainWeight(w);
		}else if(w<0.0){
			wc.reduceWeight(w);
		}else {
			System.out.println("몸무게 변화 없습니다.");
		}
		System.out.println();
		wc.showinfo();
		//===========================================
		System.out.println("===========================================");
		WeightChange kimWC = new WeightChange("김자바", 180.2, 79.3);
		
		System.out.println();
		kimWC.showinfo();
		scan.close();	
	}//end of main
	String  aa;
	
}

