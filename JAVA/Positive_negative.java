package com.ust;

public class Positive_negative {
	public static void main(String args[]) {
		int number=10;
		
		//check if number is greater than 0
		if (number>0) {
			System.out.println("The number is positive");

		}
		
		//checks if number is less than 0
		else if (number<0) {
			System.out.println("the number is negative");
		}
		
		//if both condition is false
		else {
			System.out.println("The number is 0");
		}
	}
}
