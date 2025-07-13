package com.sunbeam;

class Employee{
	int empid;
	double salary;

	public Employee(int empid, double salary) {
		this.empid = empid;
		this.salary = salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void display() {
		System.out.println(empid +" - "+ salary);
	}
}

public class Program02 {
	
	private static void incrementSalary(Employee e) {
		e.setSalary(e.getSalary()+2000);
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1, 10000);
		e1.display();
		incrementSalary(e1);
		
	}

	

}
