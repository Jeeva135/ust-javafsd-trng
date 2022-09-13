package week3day2;

public class Thread8 implements Runnable{
	Thread t;
	Thread8 (String str){
		t=new Thread(this,str);
		t.start();
	}
	public void run() {
		for (int i=0;i<5;i++)
		{
			if ((i%5)==0) {
				System.out.println(Thread.currentThread().getName()+"yielding control...");
				Thread.yield();
			}
		}
		System.out.println(Thread.currentThread().getName()+" has finished executing.");
	}
	public static void main(String args[]) {
		new Thread8("Thread 1");
		new Thread8("Thread 2");
		new Thread8("Thread 3");
	}

}
