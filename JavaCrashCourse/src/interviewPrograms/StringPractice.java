package interviewPrograms;

public class StringPractice {
	
	
	public static void countVowelsInWords() {
		String input =" I like Sweet";
		int vowelsCount=0;
		input= input.toLowerCase();
		for(int i=0; i<input.length();i++) {
			if(input.charAt(i)=='i'||input.charAt(i)=='e')
				if(input.charAt(i)=='i'|| input.charAt(i)=='e')
			{
				vowelsCount++;
				
			}
		}
		
		System.out.println(vowelsCount);
	}
	
	public static void replaceVowels()
	{
		String givenText =" I like Sweet";
		String replaceText= givenText.replaceAll("[AEIOUaeiou]", "*");
	
		System.out.println(replaceText);
	}
	public static void splitAplhaNumerals()
	{
		String givenText =" Ireer133";
		StringBuilder alpha= new StringBuilder();
		StringBuilder num= new StringBuilder();
		for(char ch : givenText.toCharArray()) {
			if(Character.isLetter(ch)) {
				alpha.append(ch);
			}
			else if(Character.isDigit(ch))
			{
				num.append(ch);
			}}
	}
	public static void main(String args[]) {
		replaceVowels();
		//countVowelsInWords();
	}

}
