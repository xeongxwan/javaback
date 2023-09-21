package serializationexam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialzationExam {
		public static void main(String[] args) throws IOException {
			//ObjectInputStream ois = new ObjectInputStream (바이트 입력 스트림);
			//ObjectOutputStream oos = new ObjectOutputStream(바이트 출력 스트림);
			//ObjectOutputStream 으로 객체를 직렬화하기 위해서는 writeObject() 메소드 사용
			//ObjectInputStream 으로 읽은 바이트를 역질렬화해서 객체를 생성하기 위해서는
			//		readObject() 메소드를 이용
			

			// ObjectOutputStream에 objectOutputStream 보조 스트림 연결
			FileOutputStream fos = new FileOutputStream("c:/Temp/object.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			ObjectOutputStream oos = new ObjectOutputStream(new "c:/Temp/object.dat");
			
			//객체를 생성
			Member m1 = new Member("fall", "단풍이");
			Product p1 = new Product("노트북", 1_500_000);
			int[] arr1 = {1,2,3};
			
			//객체를 직렬화해서 파일에 저장
			//-> 객체를 직렬화 위해 -> writeObject(객체) new ObjectOutputStream(new "c:/Temp/object.dat").writeObject(객체)
			// oos.writeObject(객체)
			oos.writeObject(m1);
			oos.writeObject(p1);
			oos.writeObject(arr1);
			
			//츨력 : 파일열기 -> 처리 -> flush() -> close()
			oos.flush();// 버퍼 내용 출력하고 버퍼 비우기
			oos.close(); // 보조스트림 닫기
			fos.close(); // 기반 스트림 닫기
			
			
			
			//// ObjectOutputStream에 objectOutputStream 보조 스트림 연결
	
			
			 
			
			
			//파일을 읽고 역직렬화 해서 객체로 복원(읽어 가져오기)
			// readObject()
			// 객체타입 참조변수 = (객체타입) ois.readObject();
			Member m2 = (Member) ois.readObject();
			Product p2 = (Product) ois.readObject();
			int arr2 = (int[]) ois.readObject();
			
			
			
			
			
			
			//복원된 객체 내용 확인 - toString이용
			
			
			
			
			
			
		}



}
