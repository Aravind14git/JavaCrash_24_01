package com.lao.javaLearning;
//Basic return pgm
public class CollectAmount {
	  Integer collectedAmount =100;
	
	public Integer getBalance() {
		System.out.println("Get Balance amount:" + collectedAmount);
		return collectedAmount;
	}

	
	public static void main(String[] args) {
		
		CollectAmount collectAmount  = new CollectAmount();
		  Integer amount= collectAmount.getBalance();
		System.out.println("Given Bal amount:" + amount);
		

	}


}

