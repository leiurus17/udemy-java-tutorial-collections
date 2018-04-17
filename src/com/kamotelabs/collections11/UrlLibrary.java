package com.kamotelabs.collections11;

import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String> {
	private LinkedList<String> urls = new LinkedList<String>();
	
	public UrlLibrary() {
		urls.add("http://www.caveofprogramming.com");
		urls.add("http://www.facebook.com");
		urls.add("http://www.kamotelabs.com");
		urls.add("http://news.bbc.co.uk");
	}

	@Override
	public Iterator<String> iterator() {
		return urls.iterator();
	}
}
