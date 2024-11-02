package interviewPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseAString {

	public void  BufferScenario() {
		String given ="Agni htr";
		StringBuffer buffer = new StringBuffer();
		buffer.append(given);
		System.out.println(buffer.reverse());
	}

	public void Scenario2() {
		String given ="Agni";
		char[] characterArray=	given.toCharArray();
		String reversed ="";

		for(int i=characterArray.length-1;i>=0;i--) {
			reversed =reversed+characterArray[i];
		}
		System.out.println(reversed);
	}

	public void usingCollections() {
		String given ="Agni";
		char[] array=	given.toCharArray();
		List<Character> list = new ArrayList<Character>();
		
		for (Character character : list) {
			list.add(character);	
		}
		
		Collections.reverse(list);
		ListIterator iterator= list.listIterator();
		while(iterator.hasNext())
			
		{
		System.out.println(iterator.next());
			
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseAString reverseFunction = new ReverseAString();
		//reverseFunction.usingCollections();
		reverseFunction.BufferScenario();

	}

}
