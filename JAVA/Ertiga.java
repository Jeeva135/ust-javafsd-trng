package com.ust;

class Car{
	String model;
	int wheels;
	float price;
	int seats;
	String colour;
	
	
	void display() {
		System.out.println("in car class");
	}
}


class Ciaz extends Car{
	void dispaly() {
		System.out.println("in ciaz class");
	}
	void show() {
		System.out.println("in show method");
	
	}
}

public class Ertiga extends Car {
	void dispaly() {
		System.out.println("in Ertiga class");
		super.display();
	}
	public static void main(String args[]) {
		Ciaz c=new Ciaz();
		
		c.display();
		c.show();
		Ertiga e=new Ertiga();
		e.dispaly();System.out.println(e.colour);
		
		
	}
}
