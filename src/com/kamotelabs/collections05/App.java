package com.kamotelabs.collections05;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		
		
		// HashSet does not retain order
		Set<String> set1 = new HashSet<String>();
		
		// LinkedHashSEt remembers the order you added items in
		Set<String> set2= new LinkedHashSet<String>();
		
		// TreeSet sorts in natural order
		Set<String> set3 = new TreeSet<String>();
		
		if(set1.isEmpty()) {
			System.out.println("Set1 is empty.");
		}
		
		set1.add("Dog");
		set1.add("Cat");
		set1.add("Mouse");
		set1.add("Snake");
		set1.add("Bear");
		
		if(set1.isEmpty()) {
			System.out.println("Set1 is empty.");
		}
		
		set2.add("Dog");
		set2.add("Cat");
		set2.add("Mouse");
		set2.add("Snake");
		set2.add("Bear");
		
		set3.add("Dog");
		set3.add("Cat");
		set3.add("Mouse");
		set3.add("Snake");
		set3.add("Bear");
		
		// adding duplicate items does nothing.
		
		set1.add("Mouse");
		
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
		
		for(String element: set1) {
			System.out.println(element);
		}
		
		for(String element: set2) {
			System.out.println(element);
		}
		
		for(String element: set3) {
			System.out.println(element);
		}
		
		if(set1.contains("Aardvark")) {
			System.out.println("Contains Aardvark");
		}
		
		if(set1.contains("Cat")) {
			System.out.println("Contains Cat");
		}

	}

}
