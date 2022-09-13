package week3day2;

public class Thread2 implements Runnable {
	public static void main(String[] args) {
		Runnable r=new Thread2();
		r.run();
	}
	
	public void run() {
		System.out.println("Thread");
	}

}
