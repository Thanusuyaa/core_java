package com.javapractise;

public class Booleantest8 {
    // demonstrate boolean value
	public static void main(String[] args) {
		boolean b;
		b = false;
		System.out.println("b is " + b);
		b= true;
		System.out.println("b is "+ b);
	//  a boolean value can control the if statement
		b= false; // i gave it a try
		if(b) {
			System.out.println("This is not executed");
		}
		b= true; 
		// when you true it only execute true statement because we directly says it as true 
		if (b) {
			System.out.println("This is executed"); 
		// in order to execute both the statement we need to put in other conditional statement called if else
		}
	// outcome of a relational operator is a boolean value
		System.out.println("20 > 10 is " + (20>10));

	}

}
