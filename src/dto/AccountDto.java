package dto;

public class AccountDto implements Comparable<AccountDto>
{
	private int accountSeq;
	private String accountNumber;
	private int balance;
	private int userSeq;
	
	public AccountDto() {}

	public AccountDto(int accountSeq, String accountNumber, int balance, int userSeq) {
		super();
		this.accountSeq = accountSeq;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.userSeq = userSeq;
	}

	public int getAccountSeq() {
		return accountSeq;
	}

	public void setAccountSeq(int accountSeq) {
		this.accountSeq = accountSeq;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getUserSeq() {
		return userSeq;
	}

	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("계좌코드: ");
		builder.append(accountSeq);
		builder.append(", 계좌번호: ");
		builder.append(accountNumber);
		builder.append(", 잔고: ");
		builder.append(balance);
		builder.append(", 고객코드: ");
		builder.append(userSeq);
		builder.append("\n");
		return builder.toString();
	}
	
	public int compareTo(AccountDto o)
	{
		return balance - o.getBalance();
	}
	
	
	
	
	
	
	
	
	
}
