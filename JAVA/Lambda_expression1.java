package week4day2;



@FunctionalInterface
interface MyInterface{
	double getPiValue();
}

public class Lambda_expression1 {
	public static void main(String[] args) {
		
	
	MyInterface ref;
	ref=()->3.1415;
	System.out.println("Value of Pi="+ref.getPiValue());

	}

	

	

}
