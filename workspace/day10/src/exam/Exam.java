package exam;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		
		//객체를 이용하면 더 간단하게 작성할수 있음, 아직은 배열만 이용
		Scanner scan = new Scanner(System.in);
		String[] beverage = { "아메리카노", "라떼", "콜라", "홍차"};
		int[] unitPrice = {2500, 4500, 1500, 5500};
	
		//전체 주문에 대한 누적을 만들기 위한 배열
		int[] totalNum = new int[4];
		int[] totalMoney = new int [4]; //수량 + unitPrice
		
		
		while(true) {
			int orderNo = 0;
			int orderNumber = 0;
			String orderYesOrNo = " "; //주문 계속 여부
			System.out.println("음료 번호를 선택하세요....");
			System.out.println("1.아메리카노(2500) | 2.라떼(4500) | 3.콜라(1500) | 4.홍차(5500) | 0.주문 취소");
			orderNo = scan.nextInt();
			
			if(orderNo == 0) {
				System.out.println("주문을 취소하셨습니다.");
				break;
			}
			System.out.println("주문 수량을 입력 >>");
			orderNumber = scan.nextInt();
			switch(orderNo) {
			case 1 : 
					totalNum[0] = totalNum[0] + orderNumber;	//주문 수량
					totalMoney[0] =  totalNum[0] * unitPrice[0];	//주문 금액
				break;
			case 2 :
				totalNum[1] = totalNum[1] + orderNumber;	//주문 수량
				totalMoney[1] =  totalNum[1] * unitPrice[1];	//주문 금액
				break;
			case 3 :
				totalNum[2] = totalNum[2] + orderNumber;	//주문 수량
				totalMoney[2] =  totalNum[2] * unitPrice[2];	//주문 금액
				break;
			case 4 :
				totalNum[3] = totalNum[3] + orderNumber;	//주문 수량
				totalMoney[3] =  totalNum[3] * unitPrice[3];	//주문 금액
				break;
			}
			System.out.println("주문을 계속 하시겠습니까?\n Y:주문계속 | N:주문취소");
			orderYesOrNo = scan.next();
			
			if(orderYesOrNo.equals("y")){
			continue;
			}else {
				System.out.println("주문을 종료 합니다");
				break;
			}
		}//end of while
		
		int allMoney = 0;
		//출력
		for(int i = 0; i<beverage.length; i++) {
			if(totalNum[i]==0) continue;	//continue는 for 문의 증감식부분 즉 i++로 올라감
			
			
			
			System.out.printf("%s %d잔 주문, 주문금액 : %d원\n ",beverage[i],totalNum[i],totalMoney[i]);
			allMoney = allMoney + totalMoney[i];
			
			
		}
		System.out.println("총 주문 금액 :" + allMoney);
		
		
		
		
		
		
		
		
		
		
	}

}
