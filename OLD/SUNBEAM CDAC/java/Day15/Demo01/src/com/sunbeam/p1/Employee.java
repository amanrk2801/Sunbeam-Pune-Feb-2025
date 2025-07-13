package com.sunbeam.p1;

import java.io.Serializable;

public class Employee implements Serializable {
	
	int empid;
	String name;
	double salary;
	//transient String deptName;
	static String deptName = "Dev";

	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public Employee(int empid, String name, double salary, String deptName) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.deptName = deptName;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", deptName=" + deptName + "]";
	}


}
