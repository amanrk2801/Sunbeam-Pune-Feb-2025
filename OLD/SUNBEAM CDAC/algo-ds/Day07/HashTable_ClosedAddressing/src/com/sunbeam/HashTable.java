package com.sunbeam;

import java.util.LinkedList;
import java.util.List;

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
	private List<Entry> arr[];
	public HashTable(int size) {
		SIZE = size;
		arr = new List[SIZE];
		for(int i = 0 ; i < SIZE ; i++)
			arr[i] = new LinkedList<HashTable.Entry>();
	}
	
	public int h(int key) {
		return key % SIZE;
	}
	
	public void put(int key, String value) {
		//1. find slot for given key
		int slot = h(key);
		
		//2. if key value pair is already exist, then update value of the key
		if(!arr[slot].isEmpty()) {
			for(Entry e : arr[slot]) {
				if(e.key == key) {
					e.value = value;
					return;
				}
			}
		}
		
		//3. create and add entry at slot
		Entry e = new Entry(key, value);
		arr[slot].add(e);		
	}
	
	public String get(int key) {
		//1. find slot for given key
		int slot = h(key);

		//2. if list of slot is not empty, then search the key
		if(!arr[slot].isEmpty()) {
			for(Entry e : arr[slot]) {
				if(e.key == key) {
					return e.value;
				}
			}
		}
		// if key is not found
		return null;
	}
	
	public String delete(int key) {
		//1. find slot for given key
		int slot = h(key);

		//2. if list of slot is not empty, then search the key
		if(!arr[slot].isEmpty()) {
			for(Entry e : arr[slot]) {
				if(e.key == key) {
					String temp = e.value;
					arr[slot].remove(e);
					return temp;
				}
			}
		}
		// if key is not found
		return null;
	}
}











