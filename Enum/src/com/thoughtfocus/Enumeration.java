package com.thoughtfocus;

public class Enumeration {
	public enum Planets {
		pluto,neptune,jupyter;
		}

public void example() {
	for(Planets p:Planets.values())// iteration
	System.out.println(p);
	for(Gender g:Gender.values())
		System.out.println(g);
}
}
