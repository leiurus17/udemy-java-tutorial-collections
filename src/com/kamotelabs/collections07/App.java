package com.kamotelabs.collections07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		
		int len1 = s1.length();
		int len2 = s2.length();
		
		if(len1 > len2) {
			return 1;
		} else if(len1 < len2) {
			return -1;
		}
		
		return 0;
	}
	
}

class AlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		
		return s1.compareTo(s2);
	}
	
}

class ReverseAlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		
		// negative sign
		return -s1.compareTo(s2);
	}
	
}

public class App {

	public static void main(String[] args) {

		List<String> animals = new ArrayList<String>();

		animals.add("tiger");
		animals.add("lion");
		animals.add("snake");
		animals.add("mongoose");
		animals.add("cat");
		animals.add("elephant");

		for (String animal : animals) {
			System.out.println(animal);
		}

		System.out.println("============");

		// static method to sort list on string length
		// Collections.sort(animals, new StringLengthComparator());
		
		Collections.sort(animals, new ReverseAlphabeticalComparator());

		for (String animal : animals) {
			System.out.println(animal);
		}

		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(3);
		numbers.add(1);
		numbers.add(36);
		numbers.add(73);
		numbers.add(40);
		numbers.add(1);

		// static method to sort list
		Collections.sort(numbers, new Comparator<Integer>() {

			// negative sign for reverse
			@Override
			public int compare(Integer num1, Integer num2) {
				return -num1.compareTo(num2);
			}
			
		});

		for (Integer number : numbers) {
			System.out.println(number);
		}

	}

}
