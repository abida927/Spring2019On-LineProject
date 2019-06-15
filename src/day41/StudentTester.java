package day41;

import day40.Bank;

public class StudentTester {

	public static void main(String[] args) {

		Students bahit = new Students();
		
		bahit.name = "bahtiyar";
		bahit.age=37;
		bahit.ssn =222444L;
		
		bahit.displayName();
		
		//Bank is in different package;
		Bank acc1 = new Bank();
		//System.out.println(acc1.balance);//cuz it is default instance varible/ fields
		acc1.add100$(); //cuz this is public method;
		//acc1.add$(); cuz it is default method
		
		
	}

}
