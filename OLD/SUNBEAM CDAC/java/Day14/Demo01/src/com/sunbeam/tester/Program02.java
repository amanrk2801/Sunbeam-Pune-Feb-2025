package com.sunbeam.tester;

import java.sql.SQLException;
import java.util.Scanner;

import com.sunbeam.dao.AccountDao;
import com.sunbeam.dao.StudentDao;

public class Program02 {

	public static void main(String[] args) {
		try (AccountDao accountDao = new AccountDao()) {
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter the sender Id - ");
				int senderId = sc.nextInt();
				
				System.out.println("Enter the merchant Id - ");
				int merchantId = sc.nextInt();
				
				System.out.println("Enter the amount to send - ");
				double amount = sc.nextDouble();
				
				accountDao.doTransaction(senderId, merchantId, amount);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
