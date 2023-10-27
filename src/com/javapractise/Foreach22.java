package com.javapractise;
   // 
public class Foreach22 {

	public static void main(String[] args) {
		int nums[]= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
	//  use for-each style for to display and sum the values
		for(int n: nums) {
			System.out.println("value is: "+n);
			sum+=n;
		}
		System.out.println("summation: "+sum);
	}

}
