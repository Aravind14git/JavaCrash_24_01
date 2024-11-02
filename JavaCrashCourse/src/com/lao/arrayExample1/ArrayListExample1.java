package com.lao.arrayExample1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample1 {

	public void arrayListExample() {
		//<String> - called as generics allows only string type
		List<String> arrayList= new ArrayList<String>();
		arrayList.add("Benz");
		arrayList.add("Audi");
		arrayList.add("Audi");	
		arrayList.add("Ford");		

		System.out.println(arrayList);
					
			
		//To get the element 
		System.out.println(arrayList.get(0));
		//To check which index the audi present
		System.out.println(arrayList.indexOf("Audi"));
		//To check which last index the audi present
		System.out.println(arrayList.lastIndexOf("Audi"));
		//To check unavailable  option bugatti present - O/P = -1
		System.out.println(arrayList.lastIndexOf("Bugati"));

		//To copy the list into another array list
		List<String> anotherList = new ArrayList<String>();
		anotherList.addAll(arrayList);
		System.out.println(anotherList);

		//To clear the list 
		anotherList.clear(); 
		System.out.println(anotherList);

		//To remove the respective element in the list using index
		//anotherList.remove(1);
		System.out.println(anotherList);
		//To remove the respective element in the list using element
		anotherList.remove("Audi");
		System.out.println(anotherList);
		//can add null 
		anotherList.add(null);
		System.out.println(anotherList);
		arrayList.set(0, "Tata");
		System.out.println(arrayList);

		//System.out.println(arrayList.isEmpty());

		for (String string : arrayList) {
			System.out.println(string);

		}
		System.out.println("---------------------------------------");
		for(int i=0; i<arrayList.size();i++)
		{
			System.out.println("Using for loop:" +arrayList.get(i));
		}
		//-------------------
		System.out.println("---------------------------------------");
		for(int size=0; size<anotherList.size();size++){
			System.out.println("element at "+size+"th position " +anotherList.get(size));
		}
//---------------------
	ListIterator<String> list_Iterator= arrayList.listIterator();
	while(list_Iterator.hasNext()) {
		System.out.println(list_Iterator.next());
	}
	while(list_Iterator.hasPrevious()) {
		System.out.println(list_Iterator.previous());
	}
	System.out.println("---------------------------------------");

		Iterator<String> iterator2 = arrayList.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}

		List<String> countries = Arrays.asList("Germ", "Aus", "Ned");
		for(int i=0;i<countries.size();i++) {
			System.out.println(countries.get(i));
		}
		//Array to ArrayList
		int item[] = {3,4,6};
		List<int[]> list = Arrays.asList(item);
		System.out.println(item);
		
		//ArrayList to array
		List<String> li = new ArrayList<String>();
		li.add("Apple");
		li.add("Mango");
	String arr[] =	li.toArray(new String[li.size()]);
	System.out.println(arr);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListExample1 example= new ArrayListExample1();
		example.arrayListExample();


	}

}
