package com.kamotelabs.collections07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

		// static method to sort list
		Collections.sort(animals);

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
		Collections.sort(numbers);

		for (Integer number : numbers) {
			System.out.println(number);
		}

	}

}
