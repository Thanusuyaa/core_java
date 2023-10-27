package com.javapractise;
     // the for loop is essentially read-only
public class Nochange38 {

	public static void main(String[] args) {
		int nums[]= {1,2,3,4,5,6,7,8,9,10};
        for (int n: nums) {
        	System.out.print(n + " ");
        	n = n*10; // no effect
        }
        System.out.println();
        for (int n : nums)
        System.out.print(n+ " ");
        System.out.println();
	}

}
