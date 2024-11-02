package interviewPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestNoInArray {

	 Integer givenArray[] = {2, 1, 3, 4, 5};
	 
	 
	 public void findSmallest() {
		 int smallest = Integer.MAX_VALUE;
		 for(int i=0; i<givenArray.length;i++) {
			 if(givenArray[i]<smallest) {
				 smallest=givenArray[i];
			 }
		 }
		 System.out.println(smallest);
	 }
	 public void findSmallest2() {
		 int large = givenArray[0];
		 for(int i=1; i<givenArray.length;i++) {
			if(givenArray[i]>large) {
				large= givenArray[i];
			}
			 System.out.println(large);

		 }
			
	 }
	 
	 public void anotherArrayMethod() {
		 int smallest= givenArray[0];
		 for(int i=1; i<givenArray.length;i++) {
			 if(givenArray[i]<smallest) {
				 smallest=givenArray[i];
			 }}
			 System.out.println(smallest);
	 
	 }
	 public void usingArrays() {
		 
		 Arrays.sort(givenArray);
		 System.out.println(givenArray[0]);
		
	 }
	 
	 public void usingCollections() {
		List<Integer> list = Arrays.asList(givenArray);
		 Collections.sort(list);
		int  smallest = list.get(0);
		 System.out.println(smallest);
	 }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmallestNoInArray inArray = new SmallestNoInArray();
		inArray.usingArrays();
		//inArray.usingCollections();
		//inArray.findSmallest();
		//inArray.anotherArrayMethod();
	}

}
