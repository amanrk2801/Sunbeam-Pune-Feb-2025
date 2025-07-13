package com.sunbeam.p2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Program03 {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file7.txt")) {
			try (BufferedInputStream bis = new BufferedInputStream(fis)) {
				try (ObjectInputStream ois = new ObjectInputStream(bis)) {
					Employee e = (Employee) ois.readObject();
					System.out.println(e);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main1(String[] args) {
		Employee e1 = new Employee(1, "Akash", 2000);

		try (FileOutputStream fos = new FileOutputStream("file7.txt")) {
			try (BufferedOutputStream bos = new BufferedOutputStream(fos)) {
				try (ObjectOutputStream oos = new ObjectOutputStream(bos)) {
					oos.writeObject(e1);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
