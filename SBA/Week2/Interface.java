package week2day3;

interface Employee1{
	
	abstract void calculateSalary();
	abstract void fetchDepartment();
}
class Engineer1 implements Employee1{
	public void calculateSalary(){
		System.out.println("Engineer In Calculate salary");
	}
	
	public void fetchDepartment() {
		System.out.println("Engineer in fetch department");
	}
}
	class Doctor1 implements Employee1{
		public void calculateSalary(){
			System.out.println("Doctor In calculate salary");
		}
		
		public void fetchDepartment() {
			System.out.println("Doctor In Fetch Department");
		}
	
}

class Interface{
	public static void main(String args[]) {
		Engineer1 e=new Engineer1();
		Doctor1 d=new Doctor1();
		e.calculateSalary();
		e.fetchDepartment();
		d.calculateSalary();
		d.fetchDepartment();
	}
}



