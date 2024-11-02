package interviewPrograms2;

import java.util.HashMap;

public class CountOfMultipleCharInSentences {
	public static void main(String[] args) {
        String str = "This is a white horse";
        countCharacters(str);
    }

    public static void countCharacters(String str) {
        // Creating a HashMap to store characters and their counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Converting the string to char array
        char[] charArray = str.toCharArray();
        str =   str.toLowerCase();

        // Counting occurrences of each character
        for (char c : charArray) {
            if (c != ' ') {
                if (charCountMap.containsKey(c)) {
                    // If character is already present in charCountMap, increment its count
                    charCountMap.put(c, charCountMap.get(c) + 1);
                } else {
                    // If character is encountered for the first time, add it to charCountMap with count 1
                    charCountMap.put(c, 1);
                }
            }
        }

        // Printing the character count in the specified format
        for (char c : charCountMap.keySet()) {
            System.out.println(c + " - " + charCountMap.get(c));
        }
    }

}
