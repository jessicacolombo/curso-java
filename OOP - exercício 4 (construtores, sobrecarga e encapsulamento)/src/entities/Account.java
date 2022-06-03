package entities;

public class Account {
	
	private int accountNumber; 
	private String holder; 
	private double balance;
	
	public Account(int accountNumber, String holder, double firstDeposit) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		deposit(firstDeposit);
	}

	public Account(int accountNumber, String holder) {
		super();
		this.accountNumber = accountNumber;
		this.holder = holder;
	}

	public String getHolder() {
		return holder;
	}
	

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	} 
	
	public void deposit (double amount) {
		balance += amount;
	}
	
	public void withdraw (double amount) {
		balance -= amount + 5;
	}
	
	public String toString() {
		return "Account " + accountNumber + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
	}

}
