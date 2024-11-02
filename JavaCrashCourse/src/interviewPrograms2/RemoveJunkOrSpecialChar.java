package interviewPrograms2;

public class RemoveJunkOrSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "1234#$#A$#agin";
				//Regex :[^a-zA-Z0-9]
				s= s.replaceAll("[^a-zA-Z0-9]", "");
				System.out.println(s);

	}

}
