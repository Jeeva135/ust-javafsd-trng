package week4day2;

public class Method_referance2 {
	public static void ThreadStatus() {
		System.out.println("Thread is running.....");
	}
	
	public static void main(String[] args) {
		Thread t2=new Thread(Method_referance2::ThreadStatus);
		t2.start();
	}

}
