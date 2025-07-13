package com.sunbeam;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Program04 {
	
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file4.txt")){
			try(ObjectInputStream ois = new ObjectInputStream(fis)){
				List<Employee> empList = (List<Employee>)ois.readObject();
				for (Employee employee : empList)
					System.out.println(employee);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main1(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1,"Akash",2000));
		empList.add(new Employee(2,"Anil",3000));
		empList.add(new Employee(3,"Mukesh",4000));
		
		try(FileOutputStream fos = new FileOutputStream("file4.txt")){
			try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(empList);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
