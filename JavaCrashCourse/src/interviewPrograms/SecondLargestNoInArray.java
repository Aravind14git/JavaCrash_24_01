package interviewPrograms;

import java.util.Arrays;

public class SecondLargestNoInArray {
	
	public void secondLargeScenario1() {
		int temp, size;
		int array[]= {10, 20, 25, 64, 54};
		size=array.length;
		
		for(int i=0; i<size;i++) {
			for(int j=i+1; j<size;j++) {
				if (array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]= temp;
				}
			}
		}
		System.out.println(array[size-2]);


	}
	public void secondLargeScenario2() {
		
		int size;
		int array[]= {10, 20, 25, 64, 54};
		size=array.length;
Arrays.sort(array);
System.out.println("sorted Array ::"+Arrays.toString(array));
System.out.println(array[size-2]);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SecondLargestNoInArray second = new SecondLargestNoInArray();
	second.secondLargeScenario1();
		//second.secondLargeScenario2();
	}

}
