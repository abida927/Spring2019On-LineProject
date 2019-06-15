package day40;

public class Bank {
	
	String accountHolder;
    private double balance;
	//double withdraw;
	
	public  void setBalance(double balance) {
		
		this.balance=balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	//create an instance method(non-static method)
	public void showMeAccountHolder() {
		System.out.println(accountHolder);
	}

	private void showBalance() {
		System.out.println(balance);
	}
	// OPTIONAL 
	  // create an instance method called add100Dollar does not accept any paramters 
	  // and return no value 
	  // increase the balance of the account by 100 ; 
	public void add100$() {
		balance = balance +100;
	}
	
	 void add$(int x) {
		balance +=x;
	}
}
