package bookExam;

public class SwitchValueExample {

	public static void main(String[] args) {
		String grade = "B";
		
		//Java 11 이전 문법
		int score1 = 0;
		switch(grade) {
		case "A" :
			score1 = 100;
			break;
		case "B" :
			int result = 100 - 20;
			score1 = 100;
			break;
			default:
				score1 = 60;
		}
		System.out.println("score1: " + score1);
		
		
	}

}
