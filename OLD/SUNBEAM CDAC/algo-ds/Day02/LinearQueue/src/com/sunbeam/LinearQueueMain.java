package com.sunbeam;

import java.util.Scanner;

public class LinearQueueMain {

	public static void main(String[] args) {
		
		Queue q = new Queue(4);
		int choice;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("0. exit\n1. push\n2. pop\n3. peek");
			System.out.print("Enter choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				if(q.isFull())
					System.out.println("Queue is full");
				else {
					System.out.print("Enter value to be inserted : ");
					int value = sc.nextInt();
					q.push(value);
				}
				break;
			case 2:
				if(q.isEmpty())
					System.out.println("Queue is empty");
				else
					System.out.println("Poped data : " + q.pop());
				break;
			case 3:
				if(q.isEmpty())
					System.out.println("Queue is empty");
				else
					System.out.println("Peeked data : " + q.peek());
				break;
			}
		}while(choice != 0);
		
		
		sc.close();
	}

}





