package com.sunbeam;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Program02 {
	
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file2.txt")){
			try(DataInputStream dis = new DataInputStream(fis)){
				while(true) {
					Employee e = new Employee();
					e.empid = dis.readInt();
					e.name = dis.readUTF();
					e.salary = dis.readDouble();
					System.out.println(e);
				}
			}
		}catch (EOFException e) {
			System.out.println("File read completed...");
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
		
		try(FileOutputStream fos = new FileOutputStream("file2.txt")){
			try(DataOutputStream dos = new DataOutputStream(fos)){
				for (Employee employee : empList) {
					dos.writeInt(employee.empid);
					dos.writeUTF(employee.name);
					dos.writeDouble(employee.salary);
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
