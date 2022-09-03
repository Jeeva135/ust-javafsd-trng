package com.ust;
import java.util.Scanner;
public class Input {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		//Getting float point
		System.out.println("Enter float");
		float myFloat=input.nextFloat();
		System.out.println("Double entered="+myFloat);
		//Getting double point
		System.out.println("Enter double");
		double myDouble=input.nextDouble();
		System.out.println("Double entered="+myDouble);
		//Getting String input
		System.out.println("Enter text:");
		String myString=input.next();
		System.out.println("Text entered="+myString);
	}
}
