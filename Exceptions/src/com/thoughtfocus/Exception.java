package com.thoughtfocus;

public class Exception {
	String[] names=new String[] {"shreyas","avi","vaibhav"};
	
	public void throwException() {
	try {
		System.out.println(names[0]);
		System.out.println(names[3]);
	}
	catch(IndexOutOfBoundsException e) {
		System.out.println("exception occured: out of range exception");
	}
	finally{
		for(int i=0; i<names.length; i++)
		System.out.println(names[i]);
	}
	}
}
