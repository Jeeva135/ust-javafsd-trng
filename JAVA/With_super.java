package secondset;

class Animal1{
	//overridden method
	public void display()
	{
		System.out.println("I am an animal");
	}
}
class Dog1 extends Animal1{
	//Overriding method
	@Override
	public void display(){
		System.out.println("I am a dog");
		}
	public void printMessage(){
		super.display();
		}
}

public class With_super {
	public static void main(String args[]) {
		Dog1 dog1=new Dog1();
		dog1.printMessage();
		}
}
