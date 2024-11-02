package interviewPrograms;

public class PrintOneToHundred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		printNum(1);
		
		int one = 'A'/'A';
		String s1 ="..........";

		for(int i=one;i<(s1.length()*s1.length());i++)
		{
			System.out.println(i);
		}
		//a=97 b =98 c=99 d=100
		for(int i=one;i<='d';i++)
		{
			System.out.println(i);
		}


	}
	public static void printNum(int num) {
		if(num<=10) {
			System.out.println(num);
			num++;
			printNum(num);
		}
	}
}
