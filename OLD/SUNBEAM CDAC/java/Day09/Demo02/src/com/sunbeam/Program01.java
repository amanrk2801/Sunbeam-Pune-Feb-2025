package com.sunbeam;

public class Program01 {

	public static void main(String[] args) {
		//String name = "Sunbeam Infotech";
		//String []arr = name.split(" ");
		
		String name = "www.sunbeam.com";
		String []arr = name.split("[.]");
		for (String element : arr)
			System.out.println(element);
	}

}
