package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		
		HashTable tbl = new HashTable(10);
		
		tbl.put(8, "v1");
		tbl.put(3, "v2");
		tbl.put(4, "v3");
		tbl.put(6, "v4");
		tbl.put(10, "v5");
		tbl.put(13, "v6");
		tbl.put(26, "v7");
		tbl.put(13, "changed");
		//tbl.delete(13);
		
		String ret = tbl.get(13);
		if(ret != null)
			System.out.println("value : " + ret);
		else
			System.out.println("key is not found");
		
		
	}

}





