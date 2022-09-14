package week3day3;

enum Size2{
	SMALL,MEDIUM,LARGE,EXTRALARGE;


	public String getSize() {
		switch(this) 
		{
		case SMALL:
			return "small";
		case MEDIUM:
			return "medium";
		case LARGE:
			return "large";
		case EXTRALARGE:
			return "extralarge";
		default:
			return null;
		}
	}
}
public class Enum_3{

	public static void main(String[] args) {
		System.out.println("The size of the pizza is "+Size2.SMALL.getSize());
	}

}
