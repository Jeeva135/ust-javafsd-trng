package week2day2;

public class Overloading_Eg2 {
	private static void display(int a) {
		System.out.println("Got Integer data");
	}
	
	private static void display(String a) {
		System.out.println("Got String object");
	}
	
	public static void main(String args[]) {
		display(1);
		display("Hello");
	}

}
