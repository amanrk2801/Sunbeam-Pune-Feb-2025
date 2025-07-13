package com.sunbeam;

public class Program03 {

	public static void delay() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		class MyThread extends Thread {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("Th1 = " + i);
					delay();
				}
			}
		}
		MyThread th1 = new MyThread();
		

		class AnotherThread implements Runnable {
			@Override
			public void run() {
				for (int i = 1; i <= 7; i++) {
					System.out.println("Th2 = " + i);
					delay();
				}
			}
		}
		
		Thread th2 = new Thread(new AnotherThread());
		
		th1.start();
		th2.start();
		

		for (int i = 1; i <= 5; i++) {
			System.out.println("Main = " + i);
			delay();
		}
		
		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Finished ..");

	}

}
