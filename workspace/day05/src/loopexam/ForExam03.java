package loopexam;

public class ForExam03 {

	public static void main(String[] args) {

	
	int diceSum = 0;	
	
	for(int i=1; i<=3; i++) {
		int dice = (int)(Math.random() * 6) + 1;
		System.out.println( i +"번째 주사위 눈 : " + dice);
	diceSum = diceSum + dice;
	}
	System.out.println("주사위 눈의 합 =" + diceSum
			);
	
		}
	}

