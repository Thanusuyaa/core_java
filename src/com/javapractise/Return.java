package com.javapractise;
    // Demonstrate return
public class Return {

	public static void main(String[] args) {
	boolean t=true;
	System.out.println("before the return ");
    if(t) return; // return to caller
    System.out.println("This wont execute");
	}

}
