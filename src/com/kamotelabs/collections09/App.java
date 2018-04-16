package com.kamotelabs.collections09;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {

	public static void main(String[] args) {

		// head and tail queue
		// first in first out

		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);

		q1.add(10);
		q1.add(20);
		q1.add(30);

		// Throws NoSuchElementException
		System.out.println("Head of queue: " + q1.element());

		try {
			q1.add(40);
		} catch (IllegalStateException e) {
			System.out.println("Tried to add to many items to the queue.");
		}

		for (Integer value : q1) {
			System.out.println("Queue value: " + value);
		}

		// Integer value;

		// value = q1.remove();

		System.out.println("Removed from queue: " + q1.remove());
		System.out.println("Removed from queue: " + q1.remove());
		System.out.println("Removed from queue: " + q1.remove());

		try {
			System.out.println("Removed from queue: " + q1.remove());
		} catch (NoSuchElementException e) {
			System.out.println("Tried to removed to many items from queue");
		}
		
		//////////////////////////////////////
		
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);

		// Peek takes the head element but does not throw exception
		// If there are no elements
		System.out.println("Queue 2 peek: " + q2.peek());
		
		// offer does not throw exception
		q2.offer(10);
		q2.offer(20);
		q2.offer(30);
		
		for (Integer value : q2) {
			System.out.println("Queue value: " + value);
		}
		
		System.out.println("Queue 2 poll: " + q2.poll());
		System.out.println("Queue 2 poll: " + q2.poll());
		System.out.println("Queue 2 poll: " + q2.poll());
		System.out.println("Queue 2 poll: " + q2.poll());
		
		

	}

}
