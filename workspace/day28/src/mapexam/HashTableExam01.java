package mapexam;

import java.util.*;

public class HashTableExam01 {

	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<String, Integer>();
		
		
		Thread aThred = new Thread() {
			@Override
			public void run() {
				for(int i=1;i<=1000;i++) {
					Map.put(String, valuef(i), i);
				}
				
			}
		
		}

}
