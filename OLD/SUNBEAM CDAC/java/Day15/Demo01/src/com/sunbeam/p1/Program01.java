package com.sunbeam.p1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Program01 {
	
	public static void main1(String[] args) {
		try(FileInputStream fis = new FileInputStream("file5.txt")){
			try(ObjectInputStream ois = new ObjectInputStream(fis)){
				Employee emp = (Employee)ois.readObject();
				System.out.println(emp);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		//Employee emp =  new Employee(1,"Akash",2000,"Dev");
		Employee emp =  new Employee(1,"Akash",2000);
		
		try(FileOutputStream fos = new FileOutputStream("file5.txt")){
			try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(emp);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
