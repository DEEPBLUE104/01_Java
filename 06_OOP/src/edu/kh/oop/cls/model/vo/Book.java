package edu.kh.oop.cls.model.vo;

public class Book {

	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	public Book() {

	title = "자바의 정석";
	price = 30000;
	discountRate = 0.2;
	author = "남궁성";
	}
	
	public Book(String title, int price, double discountRate, String author) {
		super();
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
}
