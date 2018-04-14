package com.kamotelabs.collections05;

import java.util.HashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<String>();
		
		set1.add("Dog");
		set1.add("Cat");
		set1.add("Mouse");
		set1.add("Snake");
		set1.add("Bear");
		
		// adding duplicate items does nothing.
		
		set1.add("Mouse");
		
		System.out.println(set1);
		

	}

}
