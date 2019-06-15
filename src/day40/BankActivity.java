package day40;

public class BankActivity{

	public static void main(String[] args) {

		Bank bank = new Bank();
		bank.accountHolder="Emma";

		bank.setBalance(22.22);
		
		bank.showMeAccountHolder();
		//bank.showBalance();//beside changing the he visibility, what else can we do?
		bank.add$(5);
		//bank.showBalance();
	}

}
