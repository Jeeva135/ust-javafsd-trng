package week2day3;

abstract class Employee{
	int eid;
	String ename;
	abstract void calculateSalary();
	abstract void fetchDepartment();
}
class Engineer extends Employee{
	public void calculateSalary(){
		System.out.println("Engineer In Calculate salary");
	}
	
	public void fetchDepartment() {
		System.out.println("Engineer in fetch department");
	}
}
	class Doctor extends Employee{
		public void calculateSalary(){
			System.out.println("Doctor In calculate salary");
		}
		
		public void fetchDepartment() {
			System.out.println("Doctor In Fetch Department");
		}
	
}

class Abstraction {
	public static void main(String args[]) {
		Engineer e=new Engineer();
		Doctor d=new Doctor();
		e.calculateSalary();
		e.fetchDepartment();
		d.calculateSalary();
		d.fetchDepartment();
	}
}


