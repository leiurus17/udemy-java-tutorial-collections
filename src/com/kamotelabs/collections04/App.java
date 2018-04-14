package com.kamotelabs.collections04;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Temp {
	
}

public class App {

	public static void main(String[] args) {

		// not sorted
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		// maintains the order on how you inserted them
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		
		// sorted in natural order
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		System.out.println(new Temp()); // prints hash code
		
		testMap(hashMap);
		testMap(linkedHashMap);
		testMap(treeMap);

	}
	
	public static void testMap(Map<Integer, String> map) {
		map.put(9, "fox");
		map.put(4, "cat");
		map.put(8, "dog");
		map.put(1, "lion");
		map.put(0, "swan");
		map.put(15, "bear");
		map.put(6, "snake");
		map.put(7, "giraffe");
		
		for(Integer key : map.keySet()) {
			
			String value = map.get(key);
			
			System.out.println(key + ": " + value);
		}
		
		System.out.println("\n-------");
		
		
	}

}
