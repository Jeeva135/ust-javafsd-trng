package week3day2;

public class Throw_example1 {
	static void fun()
	{
		try {
			throw new NullPointerException("demo");
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught inside fun()");
			throw e;
		}
	}
	public static void main (String args[])
	{
		try
		{
			fun();
		}
		catch(NullPointerException e) {
			System.out.println("Caught in main");
		}
	}

}
