package com.javapractise;
    // demonstrate dynamic initialization
    // here is a short program that computes the length of the
    // hypotenuse of a right triangle given the lengths of its two opposing sides
public class DynInit17 {
	public static void main(String args[]) {
		double a =3.0, b= 4.0;
		// c is dynamically initialized 
		// c is initialized dynamically to the length of the hypotenuse (using the Pythagorean theorem).
		double c= Math.sqrt (a*a + b*b);
		System.out.println("Hypotenuse is "+ c);
	}

}
