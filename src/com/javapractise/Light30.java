package com.javapractise;

public class Light30 {
	// compute the distance light travels using long variables.
	public static void main(String[] args) {
		int lightspeed;
		long days;
		long seconds;
		long distance;
    // appropriate speed of light in miles per second 
		lightspeed = 186000;
		days=1000; // specify no of days here
	    seconds= days * 24* 60* 60; // convert to seconds
	    distance = lightspeed * seconds; // compute distance
	    System.out.println("in  "+ days );
	    System.out.println(" days light will travel about ");
	    System.out.println(distance + " miles.");}

}
