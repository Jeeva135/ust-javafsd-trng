package week4day2;

public class Lambda_expression7 {
	public static void main(String[] args) {
		new Thread(()->{
			System.out.println("New thread created");
		}).start();
	}

}
