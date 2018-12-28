package prob5;

public class Account {

	private String accountNo;
	private static int balance = 0;

	
	
	
	public Account(String accountNo) {
		super();
		this.accountNo = accountNo;
	}

	public static synchronized void save(int money) {

		balance += money;

	}

	public static synchronized void deposit(int money) {

		balance -= money;

	}

	

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public static int getBalance() {
		return balance;
	}

	public static void setBalance(int balance) {
		Account.balance = balance;
	}

}