package com.javapractise;
    // Demonstrate if-else-if statement
public class Ifelse {
	public static void main(String[] args) {
	   int month=7;  // july
	   String season;
	   if(month==12||month==1 || month==2) season = "winter";
	   else if (month==3|| month==4||month==5) season ="Spring";
	   else if (month==6|| month==7||month==8) season ="Summer";
	   else if (month==9|| month==10|| month==11)season="Autumn";
	   else season="Bogus Month";
	   System.out.println("july is a month of " + season+ ".");
	   
		   

	}

}
