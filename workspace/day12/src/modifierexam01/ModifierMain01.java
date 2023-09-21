package modifierexam01;

import modifierexam02.ModifierTest02;

//실행 클래스
public class ModifierMain01 {
	public static void main(String[] args) {
	ModifierExam01 mpu = new ModifierExam01();
	
		mpu.score = 70;
		mpu.name = "홍길동";
		mpu.showPublic();
		
		System.out.println();
		System.out.println("ModifierTest01=================");
	ModifierTest01 mpt = new ModifierTest01();
		mpt.showA();
		
		System.out.println();
		System.out.println("ModifierTest02=================");
		ModifierTest02 mpt02 = new ModifierTest02();
		mpt02.mpShow();
		
		
	
			
			
		
		


		
		
	}
}
