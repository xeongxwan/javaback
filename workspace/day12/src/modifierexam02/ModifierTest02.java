package modifierexam02;

import modifierexam01.ModifierExam01;	//
//import modifierexam01.ModifierDefaultTest;//default 클래스는 다른 패키지에서 import 불가

public class ModifierTest02 {
	ModifierExam01 mptest =  new ModifierExam01();
	
	public void mpShow() {
		mptest.name ="이기자";
		System.out.println(mptest.score);
		System.out.println(mptest.name);
		mptest.showPublic();
	}
	//에러 - default 는 다른 패키지에서 사용할수 없음  
//	ModifierExam01 mptestDf =  new ModifierExam01();
//	public void mpDfShow() {
//		mptestDf.num = 90;
//		mptestDf.model = "default - 10";
//		mptestDf.showDefault();
//	}
	
	
	//default 클래스 연습
	//default 클래스는 다른 패키지의 클래스에서 사용할 수 없음
	// 같은 패키지의 클래스에서는 사용할 수 있지만, 다른 패키지는 사용 불가
//	ModifierDefaulTest mTest = new ModifierDefaulTest; 
	
}
