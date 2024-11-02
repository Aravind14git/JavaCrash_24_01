package interviewPrograms;

import org.checkerframework.common.value.qual.StaticallyExecutable;

public class CharacterOccurence {

		public static void getCharCount(String str, char val) {	
		//char Array - using for loops
		int count =0;
		for (char ch : str.toCharArray()) {
			if(ch==val) {
				count++;
			}	
		}
		System.out.println(count);
		
	}
		public static void getCharOccurence(String str, char val) {	
			//str.length - charAt(i)

			int count =0;
			for (int i=0;i<str.length();i++) {
				if(str.charAt(i)==val) {
					count++;
				}
			}
			System.out.println(val+ ":" +count);
			
		}
		
		public static void getCharCount2(String str2, char ch) {
			int count =0;
			for(int i=0;i<str2.length();i++)
			{
				if(str2.charAt(i)==ch){
					count++;
				}}
			System.out.println(ch+ " " + count);
			
				
			
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			//String str=" I own coding tick";
			String str2 =" I own code ";
			getCharCount2(str2, 'o');
			//getCharCount(str, 'o');
			//getCharOccurence(str, 'i');

	}
}
