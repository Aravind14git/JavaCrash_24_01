package com.lao.javaInterviewQuestions;

public class SwapTwoNumbers {
	
	public void withUsingThirdVariable() {
		
		int  mySalary = 20;
		int superiorSalary =50;
		 System.out.println("Before Swapping"+ "Mine:" +mySalary+ "Superior" +superiorSalary);

		int temp = mySalary;
		  mySalary = superiorSalary;
		 superiorSalary = temp;
		
		 System.out.println("After Swapping"+ "Mine:" +mySalary+ "Superior" +superiorSalary);
		
	}

public void withoutUsingThirdVariable() {
		
		int  first = 20;
		int second =50;
		 System.out.println("Before"+ "first:" +first+ "second" +second);

		 first = first- second;
		 second = first+second;
		 first =  second - first;
		 System.out.println("After Swapping"+ "first:" +first+ "second" +second);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SwapTwoNumbers numbers = new SwapTwoNumbers();
  numbers.withoutUsingThirdVariable();
 		

	}

}
