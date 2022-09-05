package secondset;

interface Vehicle{
	
	public abstract String getColor();
	public abstract String getEngineType();
	public static final int x=4;
	}
abstract public class InterfaceEg implements Vehicle {
	public String Getcolor()
	{
		return "Green";
	}
	/**String getEngineType() {
		return "Manual";
	}  */
}
