package com.thoughtfocus;

import java.util.Scanner;

public class SwitchState {
	public void example() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		
		switch(n) {
		
		case 5:
			if(n==5) {
			System.out.println("hai");
			break;
		}
		case 10: if(n==10) {
			System.out.println("hello");
			break;
		}
		default:System.out.println("bye");
					
		}
		}

}
