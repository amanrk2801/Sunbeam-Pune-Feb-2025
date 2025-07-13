package com.sunbeam;

public class Employee {
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
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this==obj)
			return true;
		if(obj instanceof Employee) {
			Employee e = (Employee)obj;
			return this.id == e.id;
		}
		return false;
	}
	
	
	
}
