package mapexam;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class HashMapExam02 {
	
	public static void main(String[] args) {
		        HashMap<String, String> fruits = new HashMap<>();
		        

		        fruits.put("apple", "사과");
		        fruits.put("strawberry", "딸기");
		        fruits.put("grape", "포도");
		        fruits.put("peach", "복숭아");
		        
		        Scanner scanner = new Scanner(System.in);
		        
		        while (true) {
		            System.out.print("영어 단어나 키값을 입력하세요 (종료하려면 'exit' 입력): ");
		            String input = scanner.nextLine();
		            
		            if (input.equalsIgnoreCase("exit")) {
		                System.out.println("프로그램을 종료합니다.");
		                break;
		            }else if (fruits.containsKey(input)) {
		                String kr = fruits.get(input);
		                System.out.println("한글 뜻: " + kr);
		            }else
		            	System.out.println("사과,딸기,포도의,복숭아의 영어를 입력해주세요");
		            Iterator<E>
		        }
		        
		        scanner.close();
		    }
		

	}

