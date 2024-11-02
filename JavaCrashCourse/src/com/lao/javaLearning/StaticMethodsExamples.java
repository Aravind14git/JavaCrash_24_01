package com.lao.javaLearning;

public class StaticMethodsExamples {
	
	
	public static void method1() {

		System.out.println("Static method calling");
	}
	
	public void nonStatic() {
		
		System.out.println("Non Static method calling");
		method1();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	StaticMethodsExamples st = new StaticMethodsExamples();
	st.nonStatic();

	}

}
