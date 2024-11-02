package com.lao.StringsExamples;

public class StringBufferExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Arya";
		System.out.println(name.concat("prasath"));
		System.out.println(name);
		
		StringBuffer name2 = new StringBuffer("Agni");
		System.out.println(name2.append("prasath"));
		System.out.println(name2);
		
		//String Buffer methods
		//Reverse
		//can we reverse a string - String cannot be reversed only String buffer can be reversed
		System.out.println(name2.reverse());
		//replace
		StringBuffer replaceThis = new StringBuffer("Arul");
		System.out.println(replaceThis.replace(0, 3, "Riya"));
		//delete
		StringBuffer deleteThis = new StringBuffer("xyzRiya");
		System.out.println(deleteThis.delete(0, 3));
		//Insert
		StringBuffer insertThis = new StringBuffer("Moni");
		System.out.println(insertThis.insert(0, "sha"));
		//capacity
		System.out.println(insertThis.capacity());
		//Like this we have charAt, substring, length methods are same
	
	

	}

}
