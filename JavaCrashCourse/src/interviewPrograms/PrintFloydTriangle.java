package interviewPrograms;

import java.util.Scanner;

public class PrintFloydTriangle {

	
	public void usingAsterik() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int noOfLines= scanner.nextInt();
		//int noOfLines=4;// direct value providing it
		
		int row, column=0;
		
		for(row =0;row<noOfLines;row++) {
			for(column=0;column<=row;column++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void usingNumbers() {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the rows:");
	int limit;
	limit=	scanner.nextInt();
	int startingNo=1;
	int row, column;

	for(row =0;row<limit;row++) {
		for(column=0;column<=row;column++) {
			System.out.print(startingNo+ " ");
			startingNo = startingNo+1;
		}
		System.out.println();
	}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintFloydTriangle triangle = new PrintFloydTriangle();
		triangle.usingAsterik();
		//utriangle.usingNumbers();

	}

}
