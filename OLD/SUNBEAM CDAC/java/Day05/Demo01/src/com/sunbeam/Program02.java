package com.sunbeam;

class Singleton{
	//step-3
	private static Singleton ref = null;
	
	// step-1
	private Singleton() {
		System.out.println("Inside Ctor");
	}
	
	//step-2
	public static Singleton getInstance(){
		
		//step-4
		if(ref==null)
			ref = new Singleton();
		return ref;
	}
}

public class Program02 {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		Singleton s4 = Singleton.getInstance();
	}

}
