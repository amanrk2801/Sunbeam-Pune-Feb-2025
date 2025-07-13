package com.sunbeam;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee implements Serializable{
	private int id; 
	private String name; 
	private double salary; 
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false; 
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return String.format("%-15d%-20s%.2f",this.id,this.name,this.salary); 
	}
}
public class Program {
	private static Scanner sc = new Scanner(System.in); 
	private static List<Employee> empList = new ArrayList<Employee>();
	
	public static Employee[] getEmployees( ) {
		Employee[] arr = new Employee[4]; 
		arr[0] = new Employee(3, "Aditya", 3000.00); 
		arr[1] = new Employee(2, "Rahul", 4000.00); 
		arr[2] = new Employee(1, "Pratik", 2000.00); 
		arr[3] = new Employee(4, "Kunal", 1000.00);
		return arr;  
	}
	public static void addEmployee(Employee[] e) {
		for (Employee emp : e) {
			empList.add(emp); 
		} 
	}
	public static void acceptRecord(int[] empid) {
		System.out.println("Enter the empid : ");
		empid[0] = sc.nextInt(); 
	}
	public static Employee findEmployee(int empid) {
		Employee key = new Employee(); 
		key.setId(empid);
		int index = empList.indexOf(key); 
		if(index!=-1) {
			return empList.get(index); 
		}
		return null; 
	}
	public static void printRecord(Employee e) {
		if(e!=null) {
			System.out.println(e.toString());
		}
		else 
			System.out.println("Record not found");
	}
	public static boolean removeEmployee(int empid) {
		Employee key = new Employee(); 
		key.setId(empid);
		if(empList.contains(key)) {
			empList.remove(key); 
			return true; 
		}
		return false; 
	}
	public static void updateEmployee(int empid) {
		Employee key = new Employee(); 
		key.setId(empid);
		int index = empList.indexOf(key); 
		if(index!=-1) {
			Employee emp = empList.get(index); 
			System.out.println(emp.toString());
			System.out.println("1.ID");
			System.out.println("2.Name");
			System.out.println("3.Salary");
			System.out.println("Which part do you want to updated");
			int choice = sc.nextInt(); 
			sc.nextLine(); 
			switch (choice) {
			case 1:
				System.out.print("Enter the updatedID : ");
				int updatedID = sc.nextInt(); 
				emp.setId(updatedID);
				break;
			case 2:
				System.out.print("Enter the updatedName : ");
				String updatedName = sc.next(); 
				emp.setName(updatedName);
				break; 
			case 3: 
				System.out.print("Enter the updatedSalary : ");
				double updatedSalary = sc.nextDouble(); 
				emp.setSalary(updatedSalary);
				break; 
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
		else
			System.out.println("Employee not found");
	}
	public static void printRecord( ) {
		empList.sort((x,y) -> Integer.compare(x.getId(),y.getId()));
		//empList.forEach( e -> System.out.println(e));
		empList.forEach( System.out::println);
	}
	public static void writeRecord(String path) throws Exception{
		try(FileOutputStream fout = new FileOutputStream(path)){
			try(BufferedOutputStream bout = new BufferedOutputStream(fout)){
				try(ObjectOutputStream oout = new ObjectOutputStream(bout)){
					oout.writeObject(empList);
				}
			}//bout.close(); 
		}//fout.close(); 
	}
	public static void readRecord(String path) throws Exception{
		try(FileInputStream fin = new FileInputStream(path)){
			try(BufferedInputStream bin = new BufferedInputStream(fin)){
				try(ObjectInputStream oin = new ObjectInputStream(bin)){
					empList = (List<Employee>) oin.readObject(); 
				}
			}
		}
	}
	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Add Employee");
		System.out.println("2.Find Employee");
		System.out.println("3.Remove Employee");
		System.out.println("4.Update Employee");
		System.out.println("5.Print Employee[ Sorted ]");
		System.out.println("6.Write Record");
		System.out.println("7.Read Record");
		System.out.print("Enter the choice : ");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int[] empid = new int[1]; 
		String path = "Emp.db"; 
		int choice; 
		while((choice = menuList())!=0) {
			try {
				switch (choice) {
				case 1:
					Employee[] emp = Program.getEmployees(); 
					Program.addEmployee(emp);
					break;
				case 2: 
					Program.acceptRecord(empid);
					Employee e = Program.findEmployee(empid[0]); 
					Program.printRecord(e);
					break; 
				case 3: 
					Program.acceptRecord(empid);
					boolean removedStatus = Program.removeEmployee(empid[0]); 
					System.out.println(removedStatus ? "Employee removed " : "Record not found");
					break; 
				case 4: 
					Program.acceptRecord(empid);
					Program.updateEmployee(empid[0]);
					break; 
				case 5: 
					Program.printRecord();
					break; 
				case 6: 
					Program.writeRecord(path);
					break; 
				case 7: 
					Program.readRecord(path);
					Program.printRecord();
					break; 
				default:
					System.out.println("Invalid choice");
					break;
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
