package com.lao.MapExamples;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();
		//To insert element put method to use it

		employeeMap.put(1, "Agni");
		employeeMap.put(2, "Rock");
		employeeMap.put(1, "Code");
		System.out.println("Employee Map:" + employeeMap);

		//To make a copy of the existing map
		HashMap<Integer, String> duplicateMap = new HashMap<Integer, String>();
		duplicateMap.putAll(employeeMap);
		System.out.println("Duplicate Map:" + employeeMap);

		//clear to delete the map contents
		duplicateMap.clear();
		System.out.println("AFter clearing :" +duplicateMap);
		//To check if a key is present or not
		System.out.println("Does this map contains key 1"+ employeeMap.containsKey(1));

		//To check if a value is present or not
		System.out.println("Does this map contains value agni"+ employeeMap.containsValue("Agni"));

		//to clone the map - without using putAll
		System.out.println("Cloned map" +employeeMap.clone());

		//Check if map is empty or not
	System.out.println(duplicateMap.isEmpty());
		
		//to fetch the set of keys
		System.out.println(employeeMap.keySet());
		
		//fetch a value
		System.out.println(employeeMap.get(1));
		
		//Fetch all the values
		System.out.println(employeeMap.values());
		
		System.out.println(employeeMap.entrySet());


		/*
		 * //To insert element put method to use it LinkedHashMap<String, String>
		 * employeeMap1 = new LinkedHashMap<String, String>();
		 * 
		 * employeeMap1.put("roc", "Agni"); employeeMap1.put("roc2", "Rock");
		 * employeeMap1.put("roc3", "Code"); employeeMap1.put(null, "Codered");
		 * 
		 * System.out.println("Employee Map:" + employeeMap1);
		 */


}

	}


