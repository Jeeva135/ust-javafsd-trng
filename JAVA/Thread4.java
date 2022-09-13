package week3day2;

public class Thread4  implements Runnable{
	
	
	@Override
	public void run() {
		System.out.println("Doing heavy processing-START"+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			doDBProcessing();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Doing heavy processing-END"+Thread.currentThread().getName());
	}
	
	
	
	private void doDBProcessing() throws InterruptedException{
		Thread.sleep(50000);
	}

}

