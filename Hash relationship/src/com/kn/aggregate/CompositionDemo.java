package com.kn.aggregate;

public class CompositionDemo {

	public static void main(String[] args) {
		Book book = new Book("venky BookContent.......");
		book.bookContent();
		book=null;
	}

}
