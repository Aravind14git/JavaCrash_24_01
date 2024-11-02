package interviewPrograms2;

import javax.print.DocFlavor.BYTE_ARRAY;

public class BytesToString {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte[] byte1 = {'T', 'E', 'S', 'T'};
		byte[] byte2= {87, 117, 100};
		
		String str = new String(byte1);
		String str2 = new String(byte2);
		System.out.println(str);
		System.out.println(str2);
		
	}

}
