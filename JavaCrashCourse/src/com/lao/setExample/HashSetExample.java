package com.lao.setExample;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	
	public void basicExamplesHashSet(){
		HashSet<String>hashSet= new HashSet<String>();
		hashSet.add("A");
		hashSet.add("D");
		hashSet.add("E");
		hashSet.add("F");
		hashSet.add("A"); // the return type of add() is boolean. Since A is already there it will return false and wont add
		hashSet.add(null);
		//We have no control on insertion order
		System.out.println("Contents of the HashSet :"+ hashSet);
	System.out.println(hashSet.contains("A"));
	
	HashSet<String>hs2= new HashSet<String>();
	
	hs2.addAll(hashSet);
	System.out.println(hs2);
	System.out.println(hs2.toArray());
	
	System.out.println(hashSet.size());
	hashSet.isEmpty();
	hashSet.clear();//total elements clear
	hashSet.containsAll(hs2);//checking the 2 collections
	}

	/*
	 * Iterate using Iterator 
	 */
	
	public void iterateUsingIterator(){
		HashSet<String>hashSet= new HashSet<String>();
		hashSet.add("A");
		hashSet.add("D");
		hashSet.add("E");
		hashSet.add("F");
		hashSet.add("A");
		
		Iterator< String> iterator= hashSet.iterator();
		while(iterator.hasNext()){
			System.out.println("Elements of HashSet :"+ iterator.next());
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSetExample hashSetExample= new HashSetExample();
		hashSetExample.basicExamplesHashSet();
		hashSetExample.iterateUsingIterator();
	}

}
