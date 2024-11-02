package interviewPrograms;

public class FindOccurrenceOfACharInString {

	public void usingIteration() {
		String input ="AgniPrasath";
		char toFind ='a';
		int occurrence=0;

		input = input.toLowerCase();


		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)== toFind) {
				occurrence= occurrence+1;
			}
		}
		System.out.println(occurrence);
	}
	//Without iteration
	// convert inputs into uniform format
	//find the lenght of actual input
	//replace the to find Char with empty string
	//find the lenght after replacing
	// occurence= actual - replacelength
	public void withoutIteration(){
		String input ="AgniPrasath";
		char toFind ='a';
		input= input.toLowerCase();
		
		String chartToFind =Character.toString(toFind).toLowerCase();

		int actualLength=	input.length();
		System.out.println(actualLength);
		input=  input.replace(chartToFind,"");
		int lengthAfterReplacing =input.length();
		System.out.println(lengthAfterReplacing);
		System.out.println(actualLength-lengthAfterReplacing);


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using Iteration	

		FindOccurrenceOfACharInString sc1 = new FindOccurrenceOfACharInString();
		//sc1.usingIteration();
		sc1.withoutIteration();
	}

}
