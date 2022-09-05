package secondset;

abstract class MotorBike{
	abstract void brake();
}

class SportsBike extends MotorBike{
	public void brake() {
		System.out.println("Sports Bike Brake");
	}
}

class MountainBike extends MotorBike{
	public void brake() {
		System.out.println("Mountain Bike Brake");
	}
}

class AbstractEg2 {
	public static void main(String args[])
{
		MountainBike m1= new MountainBike();
		m1.brake();
		SportsBike s1=new SportsBike();
		s1.brake();
		}
}
