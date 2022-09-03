package com.ust;

public class Access_modifier {
	static int x=1;
	private int y=3;
	public void method1(int x)
	{
		Access_modifier t=new Access_modifier();
		this.x=2;
		y=4;
		
		System.out.println("Test.x:"+Access_modifier.x);
		System.out.println("t.x"+t.x);
		System.out.println("t.y"+t.y);
		System.out.println("y"+y);
		
	}
	public static void main(String args[]){
		Access_modifier t =new Access_modifier();
		t.method1(5);
	}
}



