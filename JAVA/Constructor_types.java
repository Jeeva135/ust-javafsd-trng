package week2day2;

public class Constructor_types 
{
	int a;
	int b;
	
	Constructor_types()
	{
		this(10,20);
		System.out.println("Inside default constructor\n");
	}
	
	Constructor_types(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Inside parameterized constructor");
	}
	public static void main(String args[])
	{
		Constructor_types object=new Constructor_types();
	}
}