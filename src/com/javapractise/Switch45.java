package com.javapractise;
     // An improved version of the season program
public class Switch45 {

	public static void main(String[] args) {
		int month = 7;
		String season;
		switch(month) {
		case 12:
		case 1:
		case 2:
			season="winter";
			break;
		case 3:
		case 4:
		case 5:
			season="Spring";
			break;
		case 6:
		case 7:
		case 8:
			season="Summer";
			break;
		case 9:
		case 10:
		case 11:
			season="Autumn";
			break;
		default:
			season="Bogus Month";
		}
		System.out.println("july is a month of "+ season+ ".");;
		}
		

	}


