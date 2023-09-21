package conditionalExam;

import java.util.Scanner;

public class IfElseExam08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputNum = 0; //입력받은 수량을 담을 변수
		int money = 0;	//inputNum * 4500을 담을 변수, inputNum * AMOUNT
		final int AMOUNT = 4500; //상수, 가격(한 번 정해지면 아래쪽에서는 변경하면 안되는 경우
							//이것을 상수로 처리해서 아래쪽에선 변경하지 못하도록 설정)
		String receipt = ""; //영수증 출력 여부를 담을 변수
		
		System.out.println("주문수량을 입력>>");
		inputNum = scan.nextInt();
		
		money = inputNum * AMOUNT; // 수량 * 가격
		
		System.out.println("영수증이 필요하십니까?\n영수증 출력:Y, 영수증 불필요:N");
		//사람들이 입력하는 상황 : 영수증, Y, y, 불필요, N,n
		//receipt.equals("필요") || receipt.equals("Y") || receipt.equals("y")
		//equals() : 대소문자 구분
		//equalsIgnoreCase() : 대소문자 구분하지 않고 문자열이 같은지 비교
		//receipt.equalsCase("y") 대소문자 구분하지 않음("y","y")
		
		if(receipt.equals("필요") || receipt.equalsIgnoreCase("y")) {
			System.out.println("금액 " + money + "입니다" );
			System.out.println(" 영수증 여기 있습니다 ");
			
		}else {
			
			
			System.out.println("금액" + money + "입니다");
		}
		
		
		
		
		
	}

}
