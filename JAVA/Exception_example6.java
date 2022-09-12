package week3day1;

class SuperException
{
	void display() {
		System.out.println("Display test");
	}
}
public class Exception_example6 extends SuperException{
	
	public static void main (String args[]) {
		SuperException s=new SuperException();
		Exception_example6 e=new Exception_example6();
		
		SuperException s1=new Exception_example6();
		Exception_example6 e1=new Exception_example6();
	}

}
