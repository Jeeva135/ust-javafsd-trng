package week3day2;

public class Thread3 extends Thread {
	public static void main(String[] args) {
		Thread3 t=new Thread3();
		try {
			System.out.println("Hi");
		t.sleep(5000);
		System.out.println("slept");
		}
		
		catch(Exception ex) {
			ex.getStackTrace();
		}
		
		
		
	}
}
