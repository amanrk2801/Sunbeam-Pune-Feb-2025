package com.sunbeam.p2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Program01 {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file1.txt")) {
			try (BufferedInputStream bis = new BufferedInputStream(fis)) {
				try (DataInputStream dis = new DataInputStream(bis)) {
					Employee e = new Employee(dis.readInt(), dis.readUTF(), dis.readDouble());
					System.out.println(e);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main1(String[] args) {
		Employee e1 = new Employee(1, "Akash", 2000);

		try (FileOutputStream fos = new FileOutputStream("file6.txt")) {
			try (BufferedOutputStream bos = new BufferedOutputStream(fos)) {
				try (DataOutputStream dos = new DataOutputStream(bos)) {
					dos.writeInt(e1.empid);
					dos.writeUTF(e1.name);
					dos.writeDouble(e1.salary);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
