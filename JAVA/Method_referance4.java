package week4day2;

public class Method_referance4 {
public void printnMsg() {
	System.out.println("Hello,this is instance method");
	}
	public static void main(String[] args) {
		Thread t2= new Thread(new Method_referance4()::printnMsg);
		t2.start();
	}
}
