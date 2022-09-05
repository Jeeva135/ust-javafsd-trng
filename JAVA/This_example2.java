package secondset;

class Test_this{
	void print()
	{
		//calling function
		this.show();
		System.out.println("Test this::print");
		
	}
	void show()
	{
		System.out.println("Test this::show");
		}
}
public class This_example2 {
	public static void main(String args[]) {
		Test_this t1=new Test_this();
		t1.print();
	}
}
