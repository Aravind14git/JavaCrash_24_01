package interviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class CharCountOccurrence {
	
	public static void getCharacterCount(String name) {
		
		Map<Character,Integer> charMap = new HashMap<Character, Integer>();
		
     char strArray[]=  name.toCharArray();
     for (char c : strArray) {
    //	 if(String.valueOf(c).isBlank()) { - this will provide blank values
//    	 if(!String.valueOf(c).isBlank()) {- this will not provide blank values
    	 if(charMap.containsKey(c)) {
    		 charMap.put(c, charMap.get(c)+1);
    	 }
    		 else {
    			 charMap.put(c, 1);
    		 }
    	 }
   //  }
     System.out.println(name + ":" +charMap);
	}
	public void getCharCountWords(String name2) {
		HashMap<Character, Integer> charMap1 = new HashMap();
	char[] char1=	name2.toCharArray();
	for(char c :char1)
	{
		if(charMap1.containsKey(c)) {
			charMap1.put(c, charMap1.get(c)+1);
		}
		else {
			charMap1.put(c, 1);
		}
	}
		
		System.out.println();		
	}
	
	public void getCharactersCount2(String value) {
		Map<Character, Integer> charCount2= new HashMap<Character, Integer>();
		
	char[] char1=	value.toCharArray();
	for (char c : char1) {
		if(charCount2.containsKey(c)){
			charCount2.put(c, charCount2.get(c)+1);
		}
		else
		{
			charCount2.put(c, 1);
		}
			}
    System.out.println(value + ":" +charCount2);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getCharacterCount("  tests");
		getCharacterCount("   ");
		//getCharCountWords(" sre");
	}

}
