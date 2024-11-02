package interviewPrograms;

public class ReversedWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reverse the words in a sentence

		String given ="I Love Agni";
		String reversed = " ";
		String[] temp = given.split(" ");
		//System.out.println(temp.length);
		// to  avoid space split(" ") is used
		for(int i=temp.length-1;i>=0;i--) {
			 reversed = reversed+temp[i]+ " ";
		}
		System.out.println(reversed);
		
	
		
	}

}


