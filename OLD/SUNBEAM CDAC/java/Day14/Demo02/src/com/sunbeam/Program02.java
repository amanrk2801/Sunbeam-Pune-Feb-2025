package com.sunbeam;

import java.lang.reflect.Method;
import java.util.Date;

public class Program02 {

	public static void invoke(String className, String methodName ) throws Exception {
		Class c1 = Class.forName(className);
		
		Object obj = c1.newInstance();
		
		Method method = c1.getDeclaredMethod(methodName);
		
		Object obj2 = method.invoke(obj);
		System.out.println(obj2);
	}
	
	public static void main(String[] args) throws Exception {
//		Date d = new Date();
//		System.out.println(d.toString());
		
//		String s1 = new String();
//		System.out.println(s1);
		
		invoke("java.util.Date", "toString");
		invoke("java.lang.String", "toString");
		invoke("java.time.LocalDate", "toString");
		
	}	

}
