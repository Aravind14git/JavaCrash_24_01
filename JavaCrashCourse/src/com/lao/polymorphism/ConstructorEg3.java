package com.lao.polymorphism;

public class ConstructorEg3 {
	
	String draw;
	
	ConstructorEg3(){
		System.out.println("Drawing");
	}
	
	ConstructorEg3(String toDraw){
		 draw = toDraw;
		System.out.println("Circle"+toDraw);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorEg3 eg3 = new ConstructorEg3();
		ConstructorEg3 egParameter = new ConstructorEg3("circle");
		


	}

}
