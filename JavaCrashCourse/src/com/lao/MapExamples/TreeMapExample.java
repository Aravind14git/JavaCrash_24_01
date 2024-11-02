package com.lao.MapExamples;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap <String, String> heros = new TreeMap <String, String>();
		heros.put("Iron", "tony");
		heros.put("Bat", "Bruce");
		heros.put("Spyder", "Peter");
		heros.put("Iron", "robert");
		//heros.put(null, "alert");

		//Duplicate keys if there - override the values
		//null insertion is not allowed in TreeMap
		System.out.println(heros);

	}

}
