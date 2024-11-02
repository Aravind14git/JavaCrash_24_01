package interviewPrograms2;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input =" Java is learn in Java and is fun";
	String normal=	 input.toLowerCase();
	String[]  words =normal.split("\\W+");
	
	Map<String, Integer> wordCountMap = new HashMap<>();
	
	//count the occurence of each word
	for(String word: words) {
		if(wordCountMap.containsKey(word))
		{
			wordCountMap.put(word, wordCountMap.get(word)+1);
		
	}
	else {
		wordCountMap.put(word, 1);
	}
	
	}
    System.out.println("Duplicate words in the string:");
for(Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
	if(entry.getValue()>1) {
		System.out.println(entry.getKey()+":"+entry.getValue());
	}
}

}}
