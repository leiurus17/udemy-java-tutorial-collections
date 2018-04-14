package com.kamotelabs.collections03;

import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {

		/*
		 * HashMap is not sorted
		 * The order is not maintained
		 * 
		 */
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(5, "Five");
		map.put(8, "Eight");
		map.put(6, "Six");
		map.put(4, "Four");
		map.put(2, "Two");
		
		// overwrite the previous map key-value pairs
		// map.put(6, "Hello");
		
		String text = map.get(6);
		
		System.out.println(text);
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println("Key is: " + key + " and value is: " + value);
		}
	}

}
