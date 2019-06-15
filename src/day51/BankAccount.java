package day51;

public class BankAccount {

	String accountName;
	long accountNumber;
	double balance;

	public BankAccount(String accountName, long accountNumber, double balance) {
		super();
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountName=" + accountName + ", accountNumber=" + accountNumber + ", balance=" + balance
				+ "]";
	}

	public void deposit(int amount) {

		this. balance += amount;
	}

	public void withdraw(int amount) {

		this. balance -= amount;
	}
}
