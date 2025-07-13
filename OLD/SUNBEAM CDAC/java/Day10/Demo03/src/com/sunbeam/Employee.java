package com.sunbeam;

public class Employee implements Comparable<Employee> {
	 int id;
	 String name;
	 double salary;
	 
	 public Employee() {
	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	// For ordering on empid
//	@Override
//	public int compareTo(Employee o) {
//		if(this.id<o.id)
//			return -3;
//		else if(this.id>o.id)
//			return 2;
//		return 0;
//		return this.id - o.id;
//	}
	
	// ordering on the basis of name
//	@Override
//	public int compareTo(Employee o) {
//		return this.name.compareTo(o.name);
//	}
	
	// ordering on the basis of salary
//	@Override
//	public int compareTo(Employee o) {
//		return Double.compare(this.salary,o.salary);
//	}
	
	// ordering on the basis of salary desc
		@Override
		public int compareTo(Employee o) {
			return Double.compare(o.salary,this.salary);
		}
	
	

	 
}
