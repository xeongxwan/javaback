package mapexam;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExam3 {
	
	    public static void main(String[] args) {
	        HashMap<String, Integer> student = new HashMap<>();
	        student.put("이사랑", 75);
	        student.put("한바다", 98);
	        student.put("최강산", 85);
	        student.put("박하늘", 95);
	        student.put("홍길동", 50);

	        int totalScore = 0;
	        int lowScore = Integer.MAX_VALUE;
	        String lowName = "";
	        int highScore = Integer.MIN_VALUE;
	        String highName = "";

	        Iterator<Map.Entry<String, Integer>> iter = student.entrySet().iterator();

	        while (iter.hasNext()) {
	            Map.Entry<String, Integer> entry = iter.next();
	            String name = entry.getKey();
	            int score = entry.getValue();

	            totalScore += score;
	            
	            if (score < lowScore) {
	            	lowScore = score;
	            	lowName = name;
	            }
	            
	            if(score > highScore) {
	            	highScore = score;
	            	highName = name;
	            }
	           
	     
	        }
	        
	        double avg = (double) totalScore / student.size();

	        System.out.println("전체 합계: " + totalScore);
	        System.out.println("전체 평균: " + avg);
	        System.out.println("최고점수를 받은 이름과 점수: " + highName + " : " + highScore);
	        System.out.println("최저점수를 받은 이름과 점수: " + lowName + " : " + lowScore);
	        
	    
	    }
	
		    }
		

	

