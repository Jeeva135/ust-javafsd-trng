package week3day2;

public class Throws_example1 {
	static void fun() throws IllegalAccessException
	{
		System.out.println("Inside fun().");
		throw new IllegalAccessException("demo");
	}
	public static void main (String args[])
	{
		try {
			fun();
		}
		catch(IllegalAccessException e)
		{
			System.out.println("Caught in main.");
		}
	}

}
