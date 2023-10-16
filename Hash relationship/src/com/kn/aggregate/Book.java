package com.kn.aggregate;

public class Book {
	Page page;

	public Book(String content) {
		super();
		this.page = new Page(content);
	}
	public void bookContent()
	{
		System.out.println("Book Content.....");
		page.displayContent();
	}
	
}
