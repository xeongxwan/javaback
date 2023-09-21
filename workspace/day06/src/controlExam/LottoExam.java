package controlExam;

public class LottoExam {

	public static void main(String[] args) {
		//45가지의 숫자를 가지고 6개의 숫자를 추출
		// 출력 : 3 15 25 43 5 13
		System.out.print("이주의 로또 번호 : ");
		for(int i=1; i<=6; i++) { //로또 번호를 6번 추첨
			int number = (int)(Math.random() * 45) + 1;	//1,2,.......45 사이의 숫자가 추출
			System.out.print (number + " ");
		}
		
				
		
	}

}
