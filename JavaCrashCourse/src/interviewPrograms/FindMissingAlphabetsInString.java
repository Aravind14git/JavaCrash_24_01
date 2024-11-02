package interviewPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class FindMissingAlphabetsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//This also called as Pangram
		
		String given ="a";
		/*Trim concepts:
		 * String givenAs= " HE JNE "; 
		 * System.out.println(givenAs.trim());
		 */
		given = given.toLowerCase();
		given = given.replaceAll(" ", " ");
		String[] userArray = given.split("");
		//System.out.println(given);
		String[] alphabets = "abcdefghijklmnopqrstuvwxyz".split("");

		HashSet<String> set1 = new HashSet<String>(Arrays.asList(userArray));
		/*
		 * for (String s : userArray) { set1.add(s); }
		 */
		HashSet<String> set2 = new HashSet<String>(Arrays.asList(alphabets));
		set2.removeAll(set1);
		System.out.println(set2);
	}

}
