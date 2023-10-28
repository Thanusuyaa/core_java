package com.javapractise;
    // using break to exist a while loop
public class Breakloop2 {

	public static void main(String[] args) {
		int i =0;
		while(i<100) {
			System.out.println("i: "+ i );
			if (i == 25)break; // terminate the loops
			i++;
		}
  System.out.println("loop completed");
	}

}
