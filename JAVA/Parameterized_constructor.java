package secondset;

class this_Test{
	int val1;
	int val2;
	
	//parameerized constructor
	
	this_Test(int val1,int val2)
	{
		this.val1=val1+val1;
		this.val2=val2+val2;
	}
	
	void display() {
		System.out.println("Value val1="+val1+"Value val2="+val2);
	}
	
}


class Parameterized_constructor{
	public static void main(String args[]) {
		this_Test object = new this_Test(5,10);
		object.display();
		}
}
