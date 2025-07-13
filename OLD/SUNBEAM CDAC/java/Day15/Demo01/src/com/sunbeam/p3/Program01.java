package com.sunbeam.p3;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(new File("file8.txt"))) {
			while (sc.hasNextLine()) {
				String data = sc.nextLine();
				String[] arr = data.split(",");
				int empid = Integer.parseInt(arr[0]);
				String name = arr[1];
				double salary = Double.parseDouble(arr[2]);
				Employee emp = new Employee(empid, name, salary);
				System.out.println(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main1(String[] args) {
		Employee e1 = new Employee(1, "Akash", 2000);
		try (PrintStream out = new PrintStream("file8.txt")) {
			out.println(e1.empid + "," + e1.name + "," + e1.salary);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
