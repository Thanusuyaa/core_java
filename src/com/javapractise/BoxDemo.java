package com.javapractise;

import javax.swing.Box;

// A program that uses the box class.
public class BoxDemo {
	class Box{
		double width;
		double height;
		double depth;
	}
   // this class declares an object of type box.
	public static void main(String[] args) {
		Box myBox = new Box();
		int vol;
		// assign values to mybox's instance variable
     myBox.depth=15;
     myBox.height=20;
     myBox.width=10;
	 
	 // compute volume of box
	 vol=myBox.depth*myBox.height*myBox.width;
	 System.out.println("volume is "+ vol);
	 }

}
