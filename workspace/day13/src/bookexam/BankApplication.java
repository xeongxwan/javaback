package bookexam;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BankApplication {
	// 키보드로부터 입력 받기, 메소드 들에서 공통으로 사용하고
	// 이 클래스에서만 사용해야 됨
	private static Scanner scan = new Scanner(System.in); 
	
	//계좌 객체를 담을 배열 - 모든 메소드들에서 공통으로 사용하고
	// 이 클래스에서만 사용하기 위해
	private static Account[] arrayAccount = new Account[100];	
	
	//메인 메소드 - jvm이 클래스를 실행한 후 제일 먼저 호출하는 시작점, 진입점
	public static void main(String[] args) {
	
		//반복해서 실행하는 부분 설정
		while(true) {
			int listSelectNo = 0; // 선택한 작업 번호 저장할 변수
			
			System.out.println("---------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5. 종료");
			System.out.println("---------------------------------------------------");
			System.out.println("선택> ");
			listSelectNo = Integer.parseInt(scan.next());  // Integer.parseInt(정수형문자열) => 정수변환
			
			if(listSelectNo==5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} //end of if

			switch(listSelectNo) {
			case 1 : createAccount(); //계좌생성
				break;
			
			case 2 : accountList();//계좌목록
				break;
			
			case 3 : deposit(); //예금
				break;
			
			case 4 : withdraw();//출금
				break;
			} //end of switch
			
		}//end of while
		
		
	}//end of main
	
	//#1.계좌생성
	private static void createAccount() {
		String accNo=null; // 입력받을 계좌번호 담을 변수
		String ownerName=null; // 입력받은 계좌주 담을 변수
		int initBalance=0; // 입력받은 초기 입금액 담을 변수
		
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("----------");
		System.out.println("계좌번호 : ");
		accNo = scan.next();
		
		System.out.println("계좌주 : ");
		ownerName = scan.next();
		
		System.out.println("초기 입금액");
		initBalance = scan.nextInt();
		
		//입력된 내용을 이용해서 Account 배열에 저장하기 위한 객체 생성
//		Account newAccout = new Account(accNo, ownerName, initBalance);//한사람의 계좌생성
		
		//비어 있는 배열을 찾아서 생성된 객체(한 사람의 계좌)를 Account배열에 저장
		for(int i=0; i<arrayAccount.length; i++) {
			//빈 배열 요소를 찾기- 새로 만든 계좌를 저장하기 위한 공간
			if(arrayAccount[i]==null) {
//				arrayAccount[i] = newAccout;
				arrayAccount[i] = new Account(accNo, ownerName, initBalance);
				System.out.println("결과 : " + ownerName + "님의 계좌가 생성되었습니다.");
				System.out.println();
				
				break; //이미 계좌가 생성되었기에 더이상 빈 요소 찾을 필요 없음
						// 빈 공간을 찾았으면 그곳에 새로 생성된 계좌 객체 담고 계좌 찾기 작업 끝내기
			}//end of if
		}//end of for		
		
	}//end of createAccount

	//#2.계좌 리스트
	private static void accountList() {
	
		System.out.println("----------");
		System.out.println("계좌목록");
		System.out.println("----------");
		
		DecimalFormat f = new DecimalFormat("#,##0"); // 금액의 천단위구분 기호 , 문자열
		//Account 배열에 담겨있는 모든 객체의 정보를 출력
		for(int i=0; i<arrayAccount.length; i++) {
		
			Account acc = arrayAccount[i];
			
//			if(arrayAccount[i] != null) {
			if(acc != null) { //저장된 계좌가 있으면
//			System.out.printf("%s\t%s\t%d\n",arrayAccount[i].getAccountNo(), arrayAccount[i].getOwner(), arrayAccount[i].getBalance());
//			System.out.printf("%s\t%s\t%d\n",acc.getAccountNo(), acc.getOwner(), acc.getBalance());
			System.out.printf("%s\t%s\t%s\n",acc.getAccountNo(), acc.getOwner(), f.format(acc.getBalance()));
			}//end of if
			
		}//end of for
		
		System.out.println();
		//java.lang.NullPointerException : 배열에 저장된 것이 없는데 참고하라고 하니까 생기는 것
		
	}//end of accountList()
	
	//#3. 예금
	private static void deposit() {
		// 계좌번호 찾기 - 계좌번호를 매개값(=인자)으로 넘겨주기
		//    찾은 계좌에 대한 정보(계좌 객체)를 리턴 받기
		String accNo = ""; // String accNo=null; 초기화,입력되는 계좌번호를 다음 지역변수, 
		                   // 이 메소드에서만 사용되고
		                   // 메소드를 종료하면 메모리에서 제거
		int inputBalance = 0; //입력되는 금액을 담을 변수, 지역변수 ,이 메소드에서만 사용되고
								// 메소드를 종료하면 메모리에서 제거
		
		System.out.println("----------");
		System.out.println("예금");
		System.out.println("----------");
		
		
		// 예금을 하려면 먼저 계좌번호를 알아야 함 ->계좌번호 입력 받기
		System.out.println("계좌번호 : ");
		accNo = scan.next(;

		// 입금액은 얼마인지 받아야 함
		System.out.println("예금액 : ");
		inputBalance = scan.nextInt();
		// 계좌번호가 있는지 찾기 -> 있으면 예금액 누적, 없으면 없다고 메시지 
		// 계좌번호를 찾아 온다는 것 : 그 계좌에 해당하는 모든 정보(객체)를 가져온다
		
		Account account = findAccount(accNo);  // 계좌 번호 있는지 찾을 수 있는 메소드 호출하고
											// 결과를 받아다 account에 담기
		
		//findAccount()메소드의 결과값(account에 담김)을 가지고 계좌번호에 따른 예금을 처리
		if(account != null) { // 받아온 결과값이 있으면
			// 기존의 예금액에 현재 입력된 예금액을 더하기
			account.setBalance(account.getBalance() + inputBalance);
			
			System.out.println(account.getOwner() + "님 예금 성공했습니다.");
			
			System.out.println();
			
		}else {// 결과로 받아 온 값이 없으면
			
			System.out.println("입력하신 계좌번호가 없습니다.");
			System.out.println();
			return;	// 메소드를 종료, 생략 가능, 생략하면 컴파일러 컴파일시 넣어줌
		}
		
	}//end of deposit

	//#4. 출금
	private static void withdraw() {
		String accNo = null; //사용자가 입력하는 계좌번호 담을 변수
		int drawBalance = 0; //사용자가 입력하는 출금액 담을 변수
				
		System.out.println("----------");
		System.out.println("예금");
		System.out.println("----------");
		
		System.out.println("계좌번호 : ");
		accNo = scan.next();
		
		System.out.println("출금액 : ");
		drawBalance = scan.nextInt();
		
		//계좌번호 찾기 
		Account account = findAccount(accNo);  // 계좌 번호 있는지 찾을 수 있는 메소드 호출하고
											   // 결과를 받아다 account에 담기

		//findAccount()메소드의 결과값(account에 담김)을 가지고 계좌번호에 따른 예금을 처리
		if(account != null) { // 받아온 결과값이 있으면
			// 기존의 예금액에 현재 입력된 출금액을 빼기
			account.setBalance(account.getBalance() - drawBalance);
			
			System.out.println(account.getOwner() + "님 출금 성공했습니다.");
			System.out.println("잔액은 " + account.getBalance() + "원 입니다.");
			
			System.out.println();
			
		}else {// 결과로 받아 온 값이 없으면
			System.out.println("입력하신 계좌번호가 없습니다.");
			System.out.println();
			return;	// 메소드를 종료, 생략 가능, 생략하면 컴파일러 컴파일시 넣어줌
		}
				
	}//end of withdraw
	
	//#5. 계좌 찾기
	private static Account findAccount(String accountNo) {//사용자 입력한 계좌번호를 매개값(=인자)로 가져와서 매개변수에 담음
		Account account=null; // 지역변수, 찾은 계좌 객체를 담을 변수
		
		//계좌번호 찾기 - Account[] 배열 즉 arrayAccount를 모두 살펴보면서 찾기
		for(int i=0; i<arrayAccount.length; i++) {
			if(arrayAccount[i] != null) { //계좌 객체가 담긴 곳만 검색, null 아니라는 것은 객체가 저장되어 있다는 뜻
//			   if(arrayAccount[i].getAccountNo().equals(accountNo)) {
				   String arrayAccountNo = arrayAccount[i].getAccountNo(); //i번째 요소가 담고 있는 계좌번호
				   
				   // i번째 요소 객체의 계좌번호.equals(매개값으로 넘어온 계좌번호 즉 사용자가 입력한 계좌번호)
				   if(arrayAccountNo.equals(accountNo)) { // 사용자가 입력한 계좌번호가 있다면
					   account = arrayAccount[i]; //사용자가 입력한 계좌번호에 대한
					                             //계좌번호, 예금주, 예금되어있는 예금액이 담긴 객체
					   break;
				   }// 안쪽 if 끝
			}// 밖 if끝
		}//for 끝
		return account;  //계좌정보 리턴하기

	} // end of findAccount
	
}//end of class





















