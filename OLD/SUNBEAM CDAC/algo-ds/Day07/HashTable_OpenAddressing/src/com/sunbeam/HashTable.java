package com.sunbeam;

public class HashTable {
	static class Entry{
		private int key;
		private String value;
		public Entry(int k, String v) {
			key = k;
			value = v;
		}
	}
	
	private final int SIZE;
	private Entry arr[];
	
	public HashTable(int size) {
		SIZE = size;
		arr = new Entry[SIZE];
	}
	
	public int h(int key) {
		return key % SIZE;
	}
	
	public int h(int key, int i) {
		return (h(key) + i) % SIZE;
	}
	
	public void put(int key, String value) {
		//1. find slot for given key
		int slot = h(key);
		int i = 1;
		
		//2. if same key come again or slot is not empty
		while(arr[slot] != null) {
			//2.1 check if key same, update value
			if(arr[slot].key == key) {
				arr[slot].value = value;
				return;
			}
			//2.2 do probing
			slot = h(key, i++);
		}
		
		//3. create and add entry at derived slot
		Entry e = new Entry(key, value);
		arr[slot] = e;
	}
	
	public String get(int key) {
		//1. find slot for given key
		int slot = h(key);
		int i = 1;
		
		//2. if slot is not empty
		while(arr[slot] != null) {
			// check key of slot with given key
			if(arr[slot].key == key)
				return arr[slot].value;
			
			slot = h(key, i++);
		}
		
		//3. if slot is empty, key is not found
		return null;
	}
	
	public String delete(int key) {
		//1. find slot for given key
		int slot = h(key);
		int i = 1;

		//2. if slot is not empty
		while(arr[slot] != null) {
			// check key of slot with given key
			if(arr[slot].key == key) {
				String temp =  arr[slot].value;
				arr[slot] = null;
				return temp;
			}
			slot = h(key, i++);
		}

		//3. if slot is empty, key is not found
		return null;
	}
}




















