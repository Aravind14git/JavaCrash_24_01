package interviewPrograms2;

public class EvenOrOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String sentence = "My name is Aravind";
	        
	        // Split the sentence into words
	        String[] words = sentence.split(" ");
	        System.out.println(words.length);

	        // Initialize counters for odd and even length words
	        int oddCount = 0;
	        int evenCount = 0;
	        
	        // Loop through each word
	        for (String word : words) {
	            if (word.length() % 2 == 0) {
	            	//System.out.println(word.length());
	                evenCount++;  // Count the word as even length
	            } else {
	                oddCount++;   // Count the word as odd length
	            }
	        }
	        
	        // Print the results
	        System.out.println("Odd-length words count: " + oddCount);
	        System.out.println("Even-length words count: " + evenCount);
	    
	}

}
