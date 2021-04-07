package com.fdmgroup.library;

import java.util.HashMap;

public class Book {
	private static HashMap<String, String> bookAuthor = new HashMap<String, String>();

	public static void addBookAuthor(String title, String author) {
		bookAuthor.put(title, author);
	}

	public static String findAuthor(String title) {
		return bookAuthor.get(title);
	}
}
