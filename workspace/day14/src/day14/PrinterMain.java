package day14;

import java.util.Scanner;

public class PrinterMain {

	static Scanner scan = new Scanner(System.in);
	
	public static Printer[] arrayPrinter = new Printer[2];
	public static void main(String[] args) {

		while(true) {
		int selector = 0;
		
		System.out.println("---------------------------------------------------");
		System.out.println("1.인쇄 | 2 . 종료");
		System.out.println("---------------------------------------------------");
		System.out.println("선택> ");
		selector = Integer.parseInt(scan.next());
		if(selector==1) {
				
			
		}else {
			System.out.println("프로그램을 종료 합니다.");
			break;
		}
		
		
		}//end of while
		
	}//end of main

}//end of class
