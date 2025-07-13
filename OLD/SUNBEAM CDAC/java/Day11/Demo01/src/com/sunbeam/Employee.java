package com.sunbeam;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	double salary;
	String deptName;
	
	public Employee() {
	}

	public Employee(int id, String name, double salary, String deptName) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", deptName=" + deptName + "]";
	}

	// For natureal ordering of elements
	@Override
	public int compareTo(Employee o) {
		return this.id-o.id;
	}
	
	

	
}
