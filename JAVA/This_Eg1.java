package week2day2;

class This_Eg1 {
	int a;
	int b;
	
	This_Eg1()
	{
		a=10;
		b=20;
	}
	This_Eg1 get()
	{
		return this;
	}
	
	void display()
	{
		System.out.println("a="+a+"b="+b);
	}
	public static void main(String args[])
	{
		This_Eg1 object=new This_Eg1();
		object.get().display();
	}
}
