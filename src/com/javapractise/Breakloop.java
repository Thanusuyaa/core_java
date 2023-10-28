package com.javapractise;
     // using break to exist a loop
public class Breakloop {
	public static void main(String[] args) {
		for(int i=0; i<100; i++) {
			System.out.println("i: "+i);
			if (i == 25)
			break; // terminates loop if i is 25
		
		}
   System.out.println("loop completed");
	}

}
