package mapexam;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExam {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String,Integer>();
		
		//이름과 점수로 이루어진 entry ,key-이름, value - 점수
		map.put("홍길동", 85);
		map.put("김자바", 90);
		map.put("이사랑", 75);
		map.put("홍길동", 95);
		map.put("한바다", 70);
		
		System.out.println("총 entry 수 : " + map.size());
		System.out.println();
		
		//key 값을 얻어오기
		String key = "홍길동";
		int value = map.get(key);
//		int value = map.get("홍길동");
		System.out.println(key + ": " + value);
		System.out.println();
		
		//set컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<String> keySet = map.keySet();	// key 값 들을 얻어오기
		Iterator<String> keyIterator = keySet.iterator();	//key값을 반복자를 통해 모두 얻음
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k + ":" + v);
					
		}
		System.out.println();
		
		
		
		//엔트리(key:value) Set 컬렉션을 얻고, 반복해서 키와 갑을 얻기
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIter = entrySet.iterator();
		
		
	
		
		
		
		
		
	}


}
