package com.javapractise;
     // search an array using for-each  style for 
public class Search43 {
	public static void main(String[] args) {
	int nums[]= {6,8,3,7,5,6,1,4};
	int val=11;
	boolean search=false;
	// use for-each style for to search nums for value
	for(int x: nums) {
		if(x == val) {
			search=true;
			break;
		}
	}
		if(search) {
			System.out.println("value found!");
	}else {
		System.out.println("value  not found!");		
}
	}
}