package interviewPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=	s.nextInt();
		int revNo =0;

		int orgNumber= num;
		while(num!=0) {
			revNo = revNo*10;
			revNo= revNo+num%10;//reminder
			num= num/10;//quotient
		}
		System.out.println(revNo);
		
		if(revNo == orgNumber) {
			System.out.println("Is Palindrome");
		} else
		 {
			System.out.println("Is Not Palindrome");
		} 
			
	}

}
