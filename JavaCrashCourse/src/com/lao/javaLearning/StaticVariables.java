package com.lao.javaLearning;

public class StaticVariables {

	
	static int account =0;
	String depositedBy;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVariables variables = new StaticVariables();
		variables.account=100;
		variables.depositedBy="agmi";
		
		StaticVariables variables2 = new StaticVariables();
		variables2.account=200;
		variables2.depositedBy="riya";
		
		System.out.println(variables.account);
		System.out.println(variables2.account);
		System.out.println(variables.depositedBy);
		System.out.println(variables2.depositedBy);


	}

}
