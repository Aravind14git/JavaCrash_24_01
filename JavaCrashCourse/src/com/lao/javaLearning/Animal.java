package com.lao.javaLearning;
//This is about Parametrized constructor
public class Animal {
	
	String Animal_name;
	String Animal_type;
	
	 Animal(String name, String type) {
		Animal_name = name;
		Animal_type = type;
		
	}
	 
	 public void getAnimalName() {
		 System.out.println("Animal name is" + Animal_name);
		 System.out.println("Animal name is" + Animal_type);

	 }
	

	public static void main(String[] args) {
		Animal animal = new Animal("Dog", "Omni");
		
		 animal.getAnimalName(); 
		 Animal animal2 = new Animal("Cow", "Omni");
		  animal2.getAnimalName();
		

	}

}
