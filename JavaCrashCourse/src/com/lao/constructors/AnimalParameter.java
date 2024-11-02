package com.lao.constructors;

public class AnimalParameter {

	String animal_name;
	String animal_type;

	AnimalParameter(String name, String type) {
		animal_name = name;
		animal_type = type;

	}

	public void sayAnimal() {
		System.out.println("Animal name:" + animal_name+ "and type is"+ animal_type);
	}


	public static void main(String[] args) {

		AnimalParameter animalParameter = new AnimalParameter("Duck", "Omni");
		animalParameter.sayAnimal();
	}

}
