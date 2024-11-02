package com.lao.polymorphism;

public class CollectAmount {
	
	public Integer accountNo=100;

	public Integer collectedAmount() {
		System.out.println(accountNo);
		return accountNo;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectAmount amount = new CollectAmount();
	Integer returnAmount=	amount.collectedAmount();
System.out.println(returnAmount+"father buyed account");
	}

}
