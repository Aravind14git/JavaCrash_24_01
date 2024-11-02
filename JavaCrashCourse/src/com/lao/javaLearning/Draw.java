package com.lao.javaLearning;
//This is about constructor overloading

public class Draw {
	
	String draw;
	
	Draw(){
		System.out.println("Draw the circle 1");
	}
	
	Draw(String toDraw){
		draw = toDraw;
		System.out.println("Draw the" + draw );
	}
	
	

	public static void main(String[] args) {
Draw draw1 = new Draw();
Draw draw2 = new Draw("circle 2");

	}

}

