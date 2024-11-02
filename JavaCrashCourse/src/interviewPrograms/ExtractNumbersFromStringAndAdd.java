package interviewPrograms;

public class ExtractNumbersFromStringAndAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input ="Agniprasat32";
		int totalCount =0;
		input = input.toLowerCase();
		int length = input.length();

		for(int i=0; i<length;i++) {
			char character = input.charAt(i);
			if(Character.isDigit(character)) {
				totalCount = totalCount+Character.getNumericValue(character);
			}
		}
		
		System.out.println(totalCount);
	}

}
