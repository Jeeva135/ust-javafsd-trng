package week4day2;

@FunctionalInterface
interface sayable{
	void say(String msg);
	int hashCode();
	String toString();
	boolean equals(Object obj);
}

public class Lambda_expression6 implements sayable {
	public void say(String msg) {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		Lambda_expression6 fie=new Lambda_expression6();
		fie.say("Hello there");
		
	}
}
