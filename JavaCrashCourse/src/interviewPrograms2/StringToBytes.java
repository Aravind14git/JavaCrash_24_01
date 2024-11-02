package interviewPrograms2;

import java.util.Arrays;

public class StringToBytes {
	public void StringToBytesScenario() {
		String str = "Surya";
	byte[] bytesConversion=	str.getBytes();
	System.out.println(Arrays.toString(bytesConversion));
		
	
}
	public void StringToChar() {
		String str = "Testing";
	char[] chars=	str.toCharArray();
	System.out.println(chars.length);
	char c =str.charAt(2);
	System.out.println(c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringToBytes question1 = new StringToBytes();
		//question1.StringToBytesScenario();
		question1.StringToChar();
		
	}
}
