package com.thoughtfocus;
import java.util.*;  

public class DictionaryExample {
	 public void example(){  
		 
		 Dictionary dict = new Hashtable();
		 dict.put(4,"shreyas");
		 dict.put(5,"vaibhav");
		 dict.put(9,"avi");
		 dict.put(3,"prajwal");
		 dict.put(7,"akshata");	 
		 
		 //Printing the dictionary object   
		 System.out.println("Dictionary is:" + dict);
		 
			//deletion
			System.out.println("The deleted element is:" + dict.remove(5));
			System.out.println(dict);

			//Searching:
			
			System.out.println( dict.get("Grapes"));
			System.out.println( dict.get(4));
			
			System.out.println( dict.isEmpty());
			System.out.println( dict.size());
			
		
			
		 
	 }
	
}
