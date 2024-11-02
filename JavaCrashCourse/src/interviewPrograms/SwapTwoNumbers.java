package interviewPrograms;

public class SwapTwoNumbers {

	public void withThirdVariable() {
		int x =20;
		int y =50;

		System.out.println("Before swapping:"+x+"Before swapping :"+y);
		System.out.println("Before swapping"+ x +"Before" + y);

		int temp = x;
		x=y;
		y= temp;
		System.out.println("After swapping:"+x+"After swapping :"+y);

	}

	public void withoutThirdVariable() {
		int first =20;
		int second =50;
		System.out.println("Before swapping:"+first+"Before swapping :"+second);
		
		first= first-second;
		second= first+second;
		first= second - first;
		System.out.println("AFter swapping:"+first+"After swapping :"+second);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapTwoNumbers numbers = new SwapTwoNumbers();
		//numbers.withThirdVariable();
		numbers.withoutThirdVariable();
	}

}
