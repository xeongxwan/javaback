package bookexam;

public class Account {
// 계좌번호 : accountNo
// 계좌주 : owner
// 예금액 : balance
	
	private String accountNo;
	private String owner;
	private int balance; // 약 -20억 ~ +20억
//	private long balance;	// 20억 이상
	
	public Account(String accountNo, String owner, int balance) {
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
