package week3day1;

public class Exception_example7 {
	
	public double calculate(int a,int b)//throws Exception 
	{
		//throw new Exception("abc");
		return a+b;
	}
	
	void display(int x) throws Exception
	{
		if (x==5)throw new Exception();
		else
		{
			System.out.println("all okay");
		}
	}
	
	public static void main (String args[]) {
		Exception_example7 e= new Exception_example7();
		try
		{
		e.calculate(5,6);
		e.display(5);
		}
		catch(Exception f){
			f.printStackTrace();
		}
		
	}

}
