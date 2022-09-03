package com.ust;

public class Switch_example {
	public static void main(String args[]){
		String str="green";
		switch(str) {
		case"red":
			System.out.println("I am in red");
			System.out.println("**");
			break;
			
		case"green":
			System.out.println("I am in green");
			System.out.println("**");
			break;
			
		case"yellow":
			System.out.println("I am in yellow");
			System.out.println("**");
			break;
			
		default:
			System.out.println("default");
			System.out.println("**");
			
			}
		
	}
}
