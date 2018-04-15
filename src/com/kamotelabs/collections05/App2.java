package com.kamotelabs.collections05;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App2 {

	public static void main(String[] args) {

		// TreeSet sorts in natural order
		Set<String> set1 = new TreeSet<String>();

		// TreeSet sorts in natural order
		Set<String> set2 = new TreeSet<String>();

		set1.add("Dog");
		set1.add("Cat");
		set1.add("Mouse");
		set1.add("Snake");
		set1.add("Bear");
		set1.add("Giraffe");
		set1.add("Monkey");
		set1.add("Ant");
		
		set2.add("Dog");
		set2.add("Cat");
		set2.add("Mouse");
		set2.add("Snake");
		set2.add("Bear");
		set2.add("Zebra");
		set2.add("Snail");
		
		Set<String> intersection = new HashSet<String>(set1);
		
		System.out.println(set1);
		System.out.println(intersection);
		
		intersection.retainAll(set2);
		
		System.out.println(intersection);

	}

}
