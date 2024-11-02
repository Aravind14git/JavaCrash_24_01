package com.lao.StringsExamples;

public class StringExample {

	public static void main(String[] args) {
		// Here we will see the list of string methods and String Concepts
		
		String name="Agniprasath";// String literal
		String  har="arul";
		int number =3;
		//returns character value for the particular index
		System.out.println(name.charAt(1));
//retures string length
		System.out.println(name.length());
		//Checks the equality of string with the given object
		System.out.println(name.equals("Agni"));
	//Checks the equality of string with the given object without case sensitivity
		System.out.println(name.equalsIgnoreCase("AGNIPRASath"));
		//checks if the string is empty or not
		System.out.println(name.isEmpty());
		//returns true or false based on the given input is true or false
		System.out.println(name.contains("A"));
		//take a particular portion of the string
		System.out.println(name.substring(1));
		//take a particular portion of the string begin and end index
		System.out.println(name.substring(1,3));
		//appends the string to given string
		System.out.println("=========");
		System.out.println(name.concat(har));
		//replace the existing char with given char
		System.out.println(name.replace("g","G"));
		System.out.println(name.replace("Agni","harry"));
		//find the position of character in the string
		System.out.println(name.indexOf("A"));
		//find the character specified from the index position
		System.out.println(name.indexOf("a", 5));
		//Trim will remove the white spaces before and after 
		System.out.println(name.trim());
		//convert the given datatype into string
		System.out.println(String.valueOf(number));
		String upperCase = "RIYA";
		System.out.println(upperCase.toLowerCase());
		String lowerCase = "arul";
		System.out.println(lowerCase.toUpperCase());
		//Returns a joined string with Given disclaimer
		System.out.println(String.join("-","Learn", "Automation"));
		//split
		String splitUp = "Am,    I,teaching,good";
		String[] splitted = splitUp.split(",");
		for (String string : splitted) {
			System.out.println(string);
			
		}	
	
	}

}
