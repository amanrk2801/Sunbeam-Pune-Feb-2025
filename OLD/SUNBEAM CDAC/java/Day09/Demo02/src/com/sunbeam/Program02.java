package com.sunbeam;

import java.util.StringTokenizer;

public class Program02 {

	public static void main(String[] args) {
		//String name = "Sunbeam Infotech";
		//StringTokenizer stk = new StringTokenizer(name);
		
		String name = "www.sunbeam.com";
		//StringTokenizer stk = new StringTokenizer(name,".");
		StringTokenizer stk = new StringTokenizer(name,".",true);
		
		while(stk.hasMoreTokens())
			System.out.println(stk.nextToken());
	}

}
