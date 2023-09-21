package bookexam;

import java.util.Scanner;

public class ArrayExam01 {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

      
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();

        int totalScore = 0;
        int[] scores = new int[4];
        String[] subjects = {"국어", "영어", "수학", "과학"};
        double avg = 0.0;
        
        while(true) {
        for (int i = 0; i < 4; i++) {
            System.out.print(subjects[i] + "점수를 입력하세요 : ");
            
            int score = sc.nextInt();
            if (score>100) {
                System.out.println("0부터 100까지의 점수를 입력해주세요. 처음 으로 돌아갑니다.");
                break;
            }
            
            scores[i] = score;
            
        }

        
        
        for (int score : scores) {
            totalScore += score;
        }
        
       
        avg = (double) totalScore / 4;
       
        System.out.println("\n학생 이름: " + name);
        for (int i = 0; i < 4; i++) {
            System.out.println(subjects[i] + " 점수: " + scores[i]);
        }
        System.out.println("총점: " + totalScore);
        System.out.println("평균: " + avg);
        break;
        }
      
    }//end of main
		  
}//end of class
