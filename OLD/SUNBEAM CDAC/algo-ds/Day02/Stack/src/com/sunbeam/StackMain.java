package com.sunbeam;

import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {
		
		Stack st = new Stack(4);
		int choice;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("0. Exit\n1. push\n2. pop\n3. peek");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				if(st.isFull())
					System.out.println("Stack is full");
				else {
					System.out.print("Enter data to be inserted : ");
					int value = sc.nextInt();
					st.push(value);
				}
				break;
			case 2:
				if(st.isEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("Poped data : " + st.pop());
				break;
			case 3:
				if(st.isEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("Peeked data : " + st.peek());
				break;
			}
			
		}while(choice != 0);
		

	}

}








