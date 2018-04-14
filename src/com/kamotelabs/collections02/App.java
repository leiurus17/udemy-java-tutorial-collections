package com.kamotelabs.collections02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		/*
		 * ArrayList manage arrays internally
		 * [0][1][2][3][4][5] ....
		 * 
		 */

		// if you want to add or remove only at the end of the list, use an ArrayList
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		/*
		 * LinkedList consists of elements where each element
		 * has a reference to the previous and next element
		 * [0] -> [1] -> [2] ....
		 *     <-     <-
		 * 
		 */
		
		// if you want to add or remove anywhere on the list, use a LinkedList
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
	
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
	}
	
	private static void doTimings(String type, List<Integer> list) {
		
		for(int i=0; i<1E5; i++) {
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		
		// add items at the end of the list
		// for(int i=0; i<1E5; i++) {
		// list.add(i);
		// }
		
		// add items elsewhere list
		for(int i=0; i<1E5; i++) {
			list.add(0, i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken: " + (end - start) + " ms for " + type);
	}

}
