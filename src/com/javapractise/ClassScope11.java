package com.javapractise;
//demonstrate block scope

public class ClassScope11 {
	public static void main(String[] args) {
	int x; // known to all code within main
	x= 10;
	if (x == 10) { // start new scope 
	int y = 20; // known only to this block
	// x and y both known here.
	System.out.println("x and y:" + " " + y);
	x = y * 2;
	}
	// y = 100; error! y not known here.
	System.out.println(" x is " + x);
	}
}
