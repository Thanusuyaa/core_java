package com.javapractise;
   // Test for prime
public class FindPrime20 {
	public static void main(String[] args) {
		int num;
		boolean isprime;
		num =7;
		if (num<2) isprime = false;
		else isprime = true;
		for (int i=2; i<=num/i; i++) {
		if((num % i)==0){
		isprime = false;
		break;	
			}
		}
		if (isprime) System.out.println("prime");
		else System.out.println("not prime");
	}
}
