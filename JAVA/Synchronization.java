package week4day4;

public class Synchronization extends Thread{
	public static void main(String[] args) {
		Synchronization t1 =new Synchronization();
		t1.start();
		Thread t2=new Thread();
		t2.start();
	}
	public void run () {
		synchronized(this){
			System.out.println("In synchronized");
		}
		System.out.println("Thread is started");
		System.gc();
	}

}
