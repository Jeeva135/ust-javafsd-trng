package com.ust;

import java.util.Scanner;

public class Employee {
	int salary;
	String ename;
	int eno;
	
	//overloading
	int display(int salary) {
		return salary;
	}
	
	float display(float salary) {
		return salary;
	}
	
	void display1()
	{
		System.out.println("In Employee class");
	}
	

			
	public static void main(String args[]) {
		Employee e=new Employee();
		Engineer e1=new Engineer();
		//Scanner input=new Scanner(System.in);
		
		//e.salary=input.nextInt();
		System.out.println("Salary="+e.display(4660));
		System.out.println("Salary="+e.display(9660f));
		e1.display1();
		e.display1();
		
	}

}
//display function overridden
class Engineer extends Employee{
	
	void display1() {
		super.display1();
		System.out.println("Inside engineer class");
	}
}
