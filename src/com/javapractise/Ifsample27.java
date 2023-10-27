package com.javapractise;

public class Ifsample27 {
	public static void main (String args[]) {
		 int a, b;
		 a=10; b=20;
		 if (a<b) System.out.println("A is less than B");
		 a= a*2;
		 if (a==b) System.out.println("A is equal to B");
		 a = a*2;
		 if (a>b) System.out.println("A is greater than B ");
		 a=a*2;
		 System.out.println(a);   //to check the values of variable a, b and a+b
		 System.out.println(b);
		 System.out.println(a+" "+b);
		 if (a==b) System.out.println("You won't see anything");
		 
	}

}
