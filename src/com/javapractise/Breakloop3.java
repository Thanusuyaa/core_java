package com.javapractise;
   // using break with nested loops
public class Breakloop3 {

	public static void main(String[] args) {
	  for (int i=0; i<3; i++) {
	  System.out.print("pass "+ i +": ");
	  for (int j=0; j<100; j++) {
		  System.out.print(j+ " ");
		  if (j==10)break;
	  }
	  System.out.println();
	  }
	  System.out.println("loop completed");
	}

}
