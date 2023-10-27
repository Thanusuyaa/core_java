package com.javapractise;
// Average an array of values 
public class Average4 {
	public static void main(String[] args) {
		double nums[]= {10.1,11.2,12.3,14.3,15.4};
		double result = 0;
		int i;
		for (i=0; i<5; i++)
		result = result + nums[i];
		System.out.println("An average is " + result/5);
	}
}
