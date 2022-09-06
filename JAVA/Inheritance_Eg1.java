package week2day2;

class Animal{
	protected String name;
	
	protected void display() {
		System.out.println("I am an animal.");
	}
}

class Dog extends Animal{
	public void getInfo() {
		System.out.println("My name is "+name);
	}
}

public class Inheritance_Eg1 {
	public static void main(String args[]) {
		Dog labrador=new Dog();
		labrador.name="Rocky";
		labrador.display();
		
		labrador.getInfo();
	}

}
