package com.lao.javaLearning;

public class BankAccount {
	
	//int accountNumber; - only for small no we use int data types
	//Long = 123232l - here after no l we use for long data types
	//Long is a wrapper class - if long
	Long accountNumber = 1234567890l;
	String holderName = "agni";
	Integer accountBalance = 450;
	
	public void getBalance() {
		
		System.out.println("Account balance is" + accountBalance);
	}
	
// here getBalance is a method
	
	public static void main(String[] args) {
		// Object need to create for performing it
		//ClassName objName = new ClassName();
		BankAccount account = new BankAccount();
		account.getBalance();
		
		
		
		

	}

}
