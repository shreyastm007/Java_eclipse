package com.thoughtfocus;

public class MainClass {

	public static void main(String[] args) {
		Exception exceptions= new Exception();
		exceptions.throwException();
		
		Exception1 exception= new Exception1();
		exception.checkAge(25);
		exception.checkAge(17);
	}

}
