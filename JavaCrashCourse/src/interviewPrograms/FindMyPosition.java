package interviewPrograms;

import java.util.Scanner;

public class FindMyPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tof ind the position of the given english alphabet
		//ASCII a -97 ,A-65

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the character");
		char givenChar= s.next().charAt(0);
		givenChar=	Character.toUpperCase(givenChar);
		
		int asciiValue = (int)givenChar;
		System.out.println(asciiValue);
		
		int positon =asciiValue-64;
		System.out.println(positon);

	}

}
