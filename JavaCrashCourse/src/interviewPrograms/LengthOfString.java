package interviewPrograms;

public class LengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String givenString="AgniPratts";
		//System.out.println(givenString.length());
		
		         char[] characterAr=  givenString.toCharArray();
		         int length =0;
		         for (char c : characterAr) {
		        	 length++;			
				}
		           System.out.println(length);
	}

}
