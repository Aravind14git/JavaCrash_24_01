package com.lao.arrayExample1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample1 {
	public void linkedListOperationsExample(){
		LinkedList<Integer> linkedList= new LinkedList<Integer>();
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);

		System.out.println("Linked List :"+ linkedList);
		//Add an element to the first position
		linkedList.addFirst(1);
		System.out.println("Linked List after adding first:"+ linkedList);

		//Add an element at last
		linkedList.addLast(5);
		System.out.println("Linked List after adding last:"+ linkedList);
		//Get the first value
		System.out.println("First Value :" +linkedList.getFirst());

		//Get the first value using index position
		System.out.println("First Value using index :"+linkedList.get(0));

		System.out.println("Third value of the list : "+ linkedList.get(3));

		//Remove first occurence
		//System.out.println("Remove first:"+linkedList.removeFirst(0));
		//System.out.println("Remove first:"+linkedList.removeLast(3));
		//poll deletes the first method
		linkedList.poll();
		linkedList.pollFirst();
		linkedList.pollLast();
		linkedList.removeFirstOccurrence(2);

	}

	public void iterateLinkedListWithSimpleFor(){

		LinkedList< String> linkedList= new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		System.out.println("Simple For loop");
		for (int index=0;index<linkedList.size();index++){
			System.out.println("Elements in the LL are "+ linkedList.get(index));
		}
		System.out.println("-----------------------------------------------------");
	}

	public void iterateUsingWhile(){
		LinkedList< String> linkedList= new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		int number=0;
		System.out.println("While");
		while(linkedList.size()>number){
			System.out.println("Elements in the LL are "+ linkedList.get(number));
			number++;
		}
		System.out.println("-----------------------------------------------------");
	}

	public void iterateUsingIterator(){
		LinkedList< String> linkedList= new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		Iterator<String> iterator=linkedList.iterator();
		System.out.println("Iterator");
		while(iterator.hasNext()){
			System.out.println("Elements in the LL are "+ iterator.next());
		}
		System.out.println("-----------------------------------------------------");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListExample1 linkedListExample = new LinkedListExample1();
		linkedListExample.linkedListOperationsExample();
		//linkedListExample.iterateLinkedListWithSimpleFor();
		linkedListExample.iterateUsingWhile();
		linkedListExample.iterateUsingIterator();
	}

}
