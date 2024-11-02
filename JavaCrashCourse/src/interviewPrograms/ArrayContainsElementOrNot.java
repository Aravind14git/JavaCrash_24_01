package interviewPrograms;

import graphql.org.antlr.v4.runtime.IntStream;

public class ArrayContainsElementOrNot {
	int[] array = { 1, 2, 3, 4, 5};
	int numberToFind = 3;
	boolean found;
	
	
	public void presentOrNot() {
		for (int number : array) {
			if(number == numberToFind) {
				found=true;
				break;
			}
		}
		//Avoid else condition since we have multiple not present observes
		if(found) {
			System.out.println("present");
		}
		else {
			System.out.println("NOT present");
		}
	}

	public void usingIntStream() {

		boolean found = java.util.stream.IntStream.of(array).anyMatch(element-> element==numberToFind);
		if(found) {
			System.out.println("present"); 
		}
		else {
			System.out.println("NOT present");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayContainsElementOrNot arrayContainsElementOrNot = new ArrayContainsElementOrNot();
		//arrayContainsElementOrNot.presentOrNot();

		arrayContainsElementOrNot.usingIntStream();




	}

}
