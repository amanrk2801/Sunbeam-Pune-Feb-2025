package com.sunbeam.tester;

import static com.sunbeam.utils.HibnernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.sunbeam.dao.EmployeeDao;
import com.sunbeam.dao.EmployeeDaoImpl;
import com.sunbeam.entities.Employee;
import com.sunbeam.entities.EmploymentType;

public class AddEmpDetails {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			// dao
			EmployeeDao dao = new EmployeeDaoImpl();
			System.out.println("Enter new emp details - String firstName, String lastName, "
					+ "String email, String password, LocalDate joinDate, double salary,\r\n"
					+ "			EmploymentType empType ");
			Employee emp = new Employee(sc.next(), sc.next(), sc.next(), sc.next(), LocalDate.parse(sc.next()),
					sc.nextDouble(), EmploymentType.valueOf(sc.next().toUpperCase()));
			//invoke dao's method
			System.out.println(dao.insertEmpDetails(emp));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
