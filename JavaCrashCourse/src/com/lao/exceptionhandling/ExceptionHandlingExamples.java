package com.lao.exceptionhandling;

public class ExceptionHandlingExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int number1 =3;
			int number2 =0;
			int result = number1/number2;
			System.out.println(result);
			
		}
		/*
		 * catch(Arithmetic Exception e) { System.out.println("Don't divide by zero"); }
		 * 
		 * catch(Null Exception e) {
		 * System.out.println("Don't divide by zero in null exception"); }
		 */
		catch(Exception e) {
			System.out.println("Don't divide by zero in exception");
			
		}
		finally {
			System.out.println("Finally exception");

		}
	}

}
