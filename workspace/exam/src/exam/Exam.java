package exam;
import java.util.*;
public class Exam {
	

	   public static void main(String[] args) {

	      Scanner scan = new Scanner(System.in);

	      ArrayList<String> school = new ArrayList<String>();
	      ArrayList<Integer> grade = new ArrayList<Integer>();

	      school.add("Jejuelementary");
	      grade.add(6);

	      System.out.println("학교 명을 입력하세요 > ");
	      school.add(scan.next());
	      System.out.println("학년을 입혁하세요 > ");
	      grade.add(scan.nextInt());

	      for (int i = 0; i < school.size(); i++) {
	         System.out.println(grade.get(i) + " grade in " + school.get(i) + " school");

	      }

	   }
	
	    }
	

	    



