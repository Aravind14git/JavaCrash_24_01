package com.lao.polymorphism;

public class BankAccountEg1 {

	Long accountNumber = 13232323l;
	Integer accountBalance= 340;
	String holder ="agni";

	public void getAccountNo() {
		System.out.println(accountNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountEg1 eg1 = new BankAccountEg1();
		eg1.getAccountNo();
	}

}
