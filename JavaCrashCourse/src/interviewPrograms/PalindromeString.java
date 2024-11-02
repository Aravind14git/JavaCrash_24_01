package interviewPrograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		String	str =s.next();

		String orgStr= str;
		String rev= "";
		int length=	str.length();
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev= rev+str.charAt(i);
		}
		System.out.println(rev);
		if(orgStr.equals(rev)) {
			System.out.println("Is Palindrome");
		} else
		{
			System.out.println("Is Not Palindrome");

		}
	}

}
