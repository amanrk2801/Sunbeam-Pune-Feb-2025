package com.sunbeam;

public class Program02 {

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
				for (int i = 1; i <= 10; i++) {
					System.out.println("Th2 = " + i);
					delay();
				}
			}
		}
		
		Thread th2 = new Thread(new AnotherThread());

		// Passing Shorthand implementation of Runnabale interface (Lambda Expression)
//		Thread th3 = new Thread(()->{
//			for (int i = 1; i <= 10; i++) {
//				System.out.println("Th2 = " + i);
//				delay();
//			}
//		});
		
		
		// min priority
		th1.setPriority(1);
		
		// high priority
		th2.setPriority(10);
		
		int mainPriority = Thread.currentThread().getPriority();
		System.out.println("Main Priority = "+mainPriority);
		
		th1.start();
		th2.start();
		

		for (int i = 1; i <= 10; i++) {
			System.out.println("Main = " + i);
			delay();
		}
		
		System.out.println("Finished");

	}

}
