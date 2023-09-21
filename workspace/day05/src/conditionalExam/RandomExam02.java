package conditionalExam;

public class RandomExam02 {

	public static void main(String[] args) {
		//1. 주사위를 던져 나온 눈의 숫자를 콘솔 창에 출력하기
		int dice = (int)(Math.random() * 6) + 1;
		
		if(dice==1) {
			System.out.println("1번눈");
		}else if(dice==2){
			System.out.println("2번눈");
		}else if(dice==3){
			System.out.println("3번눈");
		}else if(dice==4){
			System.out.println("4번눈");
		}else if(dice==5){
			System.out.println("5번눈");
		}else if(dice==6){
			System.out.println("6번눈");
		}
			
		
		
		System.out.println();
		switch (dice) {
		case 1:
			System.out.println("1번눈");
			break;
		case 2:
			System.out.println("2번눈");
			break;
		case 3:
			System.out.println("3번눈");
			break;
		case 4:
			System.out.println("4번눈");
			break;
		case 5:
			System.out.println("5번눈");
			break;
		case 6:
			System.out.println("6번눈");
			break;

		}
	} 
}
