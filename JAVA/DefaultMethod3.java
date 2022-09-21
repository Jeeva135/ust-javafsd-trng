package week4day3;

interface Sayable1{
	default void say() {
		System.out.println("Hello,this is default method");
	}
	void sayMore(String msg);
	static void sayLouder(String msg) {
		System.out.println(msg);
	}
}



public class DefaultMethod3 implements Sayable1{
	
	
	public void sayMore(String msg) {
			System.out.println(msg);
	}
	
	
	public static void main(String[] args) {
		
	
		DefaultMethod3 d=new DefaultMethod3();
		d.say();
		d.sayMore("Work is workship");
		Sayable1.sayLouder("Helloo....");
	}

}
