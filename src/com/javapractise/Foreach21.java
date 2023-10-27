package com.javapractise;
    // use break with a for each style for
public class Foreach21 {
	public static void main(String[] args) {
	int sum=0;
	int nums[]= {1,2,3,4,5,6,7,8,9,10};
	// use for to display and sum the values
	for (int n : nums) {
		System.out.println("value is  " + n);
		sum +=n;
		if(n == 5) break; // stop the loop
	}
	System.out.println("summation of first five element is " + sum);
	}
}
