package day51;

public class SavingAccount extends BankAccount {
	
	double returnRate;
	
	public SavingAccount(String accountName, long accountNumber, double balance,double returnRate) {
		super(accountName, accountNumber, balance);
		this.returnRate=returnRate;
	}
	
	
	//below code won't work , cuz super cons must be called!!!
//	public SavingAccount(String accountName, long accountNumber, double balance,double returnRate) {
//		
////		this.accountName = accountName;
////		this.accountNumber = accountNumber;
////		this.balance = balance;
//		     this.returnRate=returnRate;
//	}
	
	
	@Override
	public String toString() {
		return "SavingAccount [returnRate=" + returnRate + ", accountName=" + accountName + ", accountNumber="
				+ accountNumber + ", balance=" + balance + "]";
	}


	@Override
	public void deposit(int amount) {

		this. balance += amount+100;
	}
	@Override
	public void withdraw(int amount) {

		 this.balance -= amount-10;
	}
	

	
	

}
