package com.lao.constructors;

import com.lao.javaLearning.CollectAmount;

public class ConstructorEg {
	
	Integer collectedAmount =100;
	
	public void getBalance() {
		System.out.println("Collecting amount:" + collectedAmount) ;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectAmount collect = new CollectAmount();
		collect.getBalance();

	}

}
