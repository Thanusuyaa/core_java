package com.javapractise;

public class Break {

	public static void main(String[] args) {
		boolean t = true;
		first:{
			second:{
				third:{
					System.out.println("before the break");
					if(t) break second; // break out of the second block
					System.out.println("this wont execute");
				}
				System.out.println("this wont execute");
			}
		}
		System.out.println("this is after the second block");

	}

}
