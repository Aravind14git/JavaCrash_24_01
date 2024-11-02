package com.lao.constructors;



public class Employee {

	String studentName;
	int rollNO;
	
	Employee()
	{
		 studentName = "agni";
		 rollNO = 1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		System.out.println(employee.studentName);
		
		System.out.println(employee.rollNO);

	}

}
