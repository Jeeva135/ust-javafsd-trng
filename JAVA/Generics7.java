package week2day3;
class GenericClass <T extends Number>{
	public void display() {
		System.out.println("This is a bounded type generics class");
	}
}

public class Generics7 {
	public static void main (String args[]) {
		//GenericsClass <String>obj=new GenericClass<>();
		GenericClass <Integer>obj=new GenericClass<>();
		obj.display();
	}
}
