package com.javapractise;
    // demonstrate casts

public class Conversion {
	public static void main(String[] args) {
		byte b=10;
		int i =257;
		double d= 323.142;
		 System.out.println("conversion of int to byte");
		 b= (byte) i;
		 System.out.println("i and b " + i + " " + b);
		 System.out.println("conversion of double to int");
		 i = (int) d;
		 System.out.println("d and i "+ d+ " " +i);
		 System.out.println("conversion of double to byte");
		 b= (byte)d;
		 System.out.println("d and b "+ d+ " "+ b);
	}

}