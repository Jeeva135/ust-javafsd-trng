package secondset;

/**
 * The type Access modifier.
 */
public class Access_modifier {
	/**
	 * The X.
	 */
	static int x=1;
	private int y=3;

	/**
	 * Method 1.
	 *
	 * @param x the x
	 */
	public void method1(int x)
	{
		Access_modifier t=new Access_modifier();
		this.x=2;
		y=4;
		
		System.out.println("Testg.x:"+Access_modifier.x);
		System.out.println("t.x"+t.x);
		System.out.println("t.y"+t.y);
		System.out.println("y"+y);
		
	}

	/**
	 * Main.
	 *
	 * @param args the args
	 */
	public static void main(String args[]){
		Access_modifier t =new Access_modifier();
		t.method1(5);
	}
}



