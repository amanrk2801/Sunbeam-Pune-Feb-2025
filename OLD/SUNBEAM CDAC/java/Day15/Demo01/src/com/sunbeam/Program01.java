package com.sunbeam;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Program01 {
	
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file1.txt")){
			try(DataInputStream dis = new DataInputStream(fis)){
				Employee e = new Employee(dis.readInt(),dis.readUTF(),dis.readDouble());
				System.out.println(e);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main1(String[] args) {
		Employee e1 = new Employee(1,"Akash",2000);
		
		try(FileOutputStream fos = new FileOutputStream("file1.txt")){
			try(DataOutputStream dos = new DataOutputStream(fos)){
				dos.writeInt(e1.empid);
				dos.writeUTF(e1.name);
				dos.writeDouble(e1.salary);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
