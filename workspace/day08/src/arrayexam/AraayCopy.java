package arrayexam;

public class AraayCopy {

	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};//문자열을 저장하는 배열 공간 3개
		String[] newStrArray = new String[5];	//문자열을 저장할 수 있는 배열공간 5개 만들기
		
		//# 배열 복사 System.arraycopy()
		//				원본배열	,	복사시작인덱스, 새배열, 붙여놓을인덱스, 붙여놓을 배열길이
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		
		//#원본 출력
		for(String str : oldStrArray) {
			System.out.print("[" + str + " ] ");
		}
		System.out.println();
		
		//#복사본 출력
		for(String str1 : newStrArray) {
			System.out.print("[" + str1 + " ] ");
		}
		System.out.println();
	}

}
