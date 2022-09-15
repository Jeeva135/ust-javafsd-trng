package week3day4;



public class Outer {
	class Inner{
		void display() {
			System.out.println("In inner class");
		}
	}
	public static void main(String[] args) {
		Inner i=new Outer().new Inner();
		i.display();
		
	}

}
