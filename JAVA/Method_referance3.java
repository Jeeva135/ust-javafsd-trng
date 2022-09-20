package week4day2;

interface Sayable1{
	void say1();
}

public class Method_referance3 {
	public static void saySomething() {
		System.out.println("Hello,this is static method.");
	}
	
	public static void main(String[] args) {
		Sayable1 sayable =Method_referance3::saySomething;
		
		sayable.say1();
	}
}
