package enumExam;

import java.util.Calendar;

public class EunmExam01 {

	public static void main(String[] args) {
		/*
		 * System.out.println("Vip 고객 : " + Grade.VIP);
		 * 
		 * Week today = Week.MONDAY; //열거타입 참조변수 = 열거상수 // ==, !=비교 boolean result =
		 * (today == Week.SATURDAY); //false System.out.println(result);
		 * 
		 * Calendar now = Calendar.getInstance(); // Calendar 객체 생성 int year =
		 * now.get(Calendar.YEAR); //연도 int month = now.get(Calendar.MONTH); 
		 * 						   //컴 : 0,1,2,...11, 우리 : 1,2,3...12
		 * 
		 */
		//=========================================

		//# Week 열거 타입 변수 선언
		Week today = null;
		
		//Calendar 얻기
		Calendar cal = Calendar.getInstance();
		
		//오늘 날짜의 요일 얻기(1~7) : 숫자
		int week = cal.get(Calendar.DAY_OF_WEEK);// 일, -1, 월 -2,....토-7
		
		switch (week) {
		case 1: today = Week.SUNDAY;		
			break;
		case 2: today = Week.MONDAY;		
		break;
		case 3: today = Week.TUESDAY;		
		break;
		case 4: today = Week.WENDESDAY;		
		break;
		case 5: today = Week.THURSDAY;		
		break;
		case 6: today = Week.FRIDAY;		
		break;
		case 7: today = Week.SATURDAY;		
		break;

		default:
			break;
		}
		if (today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		}else {
			System.out.println("일요일을 제외하곤 자바 공부합니다.");
		}
		
	}

}
