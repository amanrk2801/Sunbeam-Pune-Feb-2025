package com.sunbeam;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Program03 {
	
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file3.txt")){
			try(ObjectInputStream ois = new ObjectInputStream(fis)){
				Employee e =(Employee)ois.readObject();
				System.out.println(e);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main1(String[] args) {
		Employee e1 = new Employee(1,"Akash",2000);
		
		try(FileOutputStream fos = new FileOutputStream("file3.txt")){
			try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(e1);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
