package week4day3;

interface TestInterface{
	public void square(int a);
	
	default void show() {
		System.out.println("Default method executed");
	}
}

public class DefaultMethod1 implements TestInterface{
	
	public void square(int a) {
		System.out.println(a*a);
	}
	public static void main(String[] args) {
		DefaultMethod1 d=new DefaultMethod1();
		d.square(4);
		
		
		d.show();
	}

}
