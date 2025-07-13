package com.sunbeam;


public class Program06 {

	public static void delay() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	static boolean flag = true;

	public static void main(String[] args) {
		Object obj = new Object();

		class MyThread extends Thread {
			@Override
			public void run() {
				String name = "Sunbeam ";
				synchronized (obj) {
					for (int i = 0; i < name.length(); i++) {
						System.out.print(name.charAt(i));
						System.out.flush();
						delay();
					}
					flag = false;
					obj.notify();
				}
			}
		}
		MyThread th1 = new MyThread();

		class AnotherThread implements Runnable {
			@Override
			public void run() {
			String name = "Infotech";
				synchronized (obj) {
					
					try {
						if(flag)
						obj.wait();
					} catch (InterruptedException e) {
					}
					
					for (int i = 0; i < name.length(); i++) {
						System.out.print(name.charAt(i));
						System.out.flush();
						delay();
					}
				}
			}
		}

		Thread th2 = new Thread(new AnotherThread());

		th1.start();
		th2.start();

	}

}
