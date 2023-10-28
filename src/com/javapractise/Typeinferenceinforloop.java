package com.javapractise;
     // use type inference with the loop control variable
public class Typeinferenceinforloop {
	public static void main(String[] args) {
		System.out.println("values of x:" );
		for(double x=2.5; x <100.0; x = x*2)
		System.out.print(x+" ");
		System.out.println();
	// use type inference with the iteration variable.
        int[] nums = {1,2,3,4,5,6};
        System.out.println("values in nums array: ");
        for (int v: nums)
        System.out.print(v + " ");
        System.out.println();
	}

}
