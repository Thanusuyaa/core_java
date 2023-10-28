package com.javapractise;
  // using break to exist from nested loops
public class Breakloop4 {

	public static void main(String[] args) {
		
	   outer: for(int i=0; i<3; i++){
	   System.out.print("pass " + i +" : ");
	   for (int j=0; j<100; j++) {
		   if(j==10) break outer; // exist both loop
		   System.out.print(j+ " ");
	   }
	   System.out.println("This will not print");
	}
	}
	  }

