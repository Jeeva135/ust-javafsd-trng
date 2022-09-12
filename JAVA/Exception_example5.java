package week3day1;

public class Exception_example5 {
	public static void main (String args[]) {
		int a[]= {1,2,3,4,5};
		System.out.println(a[5]);
		
		try {
			System.out.println(a[5]);
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			System.out.println(e);
		}
	}

}
