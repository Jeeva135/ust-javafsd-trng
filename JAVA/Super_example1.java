package secondset;

class Animal3{
	Animal3(){
		System.out.println("I am an animal");
	}
}

class Dog3 extends Animal3{
	Dog3(){
		super();
		System.out.println("I am a dog");
	}
}

public class Super_example1 {
	public static void main(String args[]) {
		Dog3 dog=new Dog3();
	}
}
