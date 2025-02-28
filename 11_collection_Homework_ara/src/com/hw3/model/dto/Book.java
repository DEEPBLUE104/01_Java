package com.hw3.model.dto;

public class Book {

	private int booknumber;
	private String title;
	private String author;
	private int price;
	private String bookmaker;
	
	public Book() {	}

	public Book(int booknumber, String title, String author, int price, String bookmaker) {
		super();
		this.booknumber = booknumber;
		this.title = title;
		this.author = author;
		this.price = price;
		this.bookmaker = bookmaker;
	}

	public int getBooknumber() {
		return booknumber;
	}

	public void setBooknumber(int booknumber) {
		this.booknumber = booknumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBookmaker() {
		return bookmaker;
	}

	public void setBookmaker(String bookmaker) {
		this.bookmaker = bookmaker;
	}

	@Override
	public String toString() {
		return booknumber + "번 도서 : [도서제목 :" + title + "/ 도서저자" + author +
				"/ 도서가격 : " + price + "원 / 출판사 :" + bookmaker + "]";
	}
	
	
}
