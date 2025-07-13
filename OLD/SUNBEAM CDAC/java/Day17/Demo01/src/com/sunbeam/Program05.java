package com.sunbeam;

class ShareMarket{
	int shares = 1000;
	
	public synchronized void buy() {
		int nt = shares + 100;
		shares = nt;
	}
	
	public synchronized void sell() {
		int nt = shares - 100;
		shares = nt;
	}
}

public class Program05 {

	public static void delay() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ShareMarket sm = new ShareMarket();
		

		class BuyThread extends Thread {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					//synchronized (sm) {
						sm.buy();
						System.out.println("total after buy = "+sm.shares);
					//}
					delay();
				}
			}
		}
		
		
		class SellThread implements Runnable {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					//synchronized (sm) {
						sm.sell();
						System.out.println("total after sell = "+sm.shares);
					//}				
					delay();
				}
			}
		}
		
		BuyThread th1 = new BuyThread();
		Thread th2 = new Thread(new SellThread());
		
		th1.start();
		th2.start();


		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Total shares available = "+sm.shares);

	}

}
