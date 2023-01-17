package com.thoughtfocus;
import java.util.*;  
public class LinkedExample {

	public void example(){  
	  
	  //LinkedList<String> linked=new LinkedList<String>();  
		
		// Creating an empty linked list
		LinkedList linked=new LinkedList();
	  linked.add("Ravi");  
	  linked.add("Vijay");  
	  linked.add("Rajesh");  
	  linked.add("Ajay");  
	  linked.add(10);
	  linked.add(1,"Shreyas");
	  
	//Printing the linkedlist object   
      System.out.println(linked); 
	  
	  
	//deletion
		System.out.println("The deleted element is:" + linked.remove(2));
		System.out.println(linked);

		// Fetching the element at the head of the linked list
				System.out.println("The element at the top of the stack is:" + linked.peek());
				
				
		//Searching:
		System.out.println( linked.contains("Grapes"));
		System.out.println( linked.contains(10));
		System.out.println("Element:" + linked.get(4)); //gets the fourth index element
		System.out.println("Updated Element is :" + linked.set(4,"Arjun"));
		System.out.println("New list is:" +linked);
		
		
		System.out.println( linked.isEmpty());
		System.out.println( linked.size());
		
		
		//Iterate means to fetch the elements of the linked list. 
		//We can fetch elements of the stack using three different methods are as follows:
		//Using iterator() Method
		//Using forEach() Method
		//Using listIterator() Method
		
		System.out.println("Iteration:");
		linked.forEach(n ->  
		{  
		System.out.println(n);  
		});  
		
}  
	  
	
}

