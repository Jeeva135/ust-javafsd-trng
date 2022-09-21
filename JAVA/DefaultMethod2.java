package week4day3;

interface Sayable{
	default void say() {
		System.out.println("Hello,this is default method");
	}
	void sayMore(String msg);
}

public class DefaultMethod2 implements Sayable{
	
	public void sayMore(String msg) {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		
		DefaultMethod2 d=new DefaultMethod2();
		d.say();
		d.sayMore("Work is workship");
		
	}

}
