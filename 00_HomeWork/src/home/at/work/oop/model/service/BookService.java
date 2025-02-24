package home.at.work.oop.model.service;

import home.at.work.oop.model.vo.Book;

public class BookService {

	public void practice() {
		
		//기본 생성자
		//매개변수 생성자
		
		 Book book1 = new Book();
		 Book book2 = new Book("자바의 정석",30000,0.2,"남궁성");
		 
		 System.out.println(book1);
		 System.out.println(book2);
		 
		 System.out.println("===========================");
		 
		 book1.setTitle("C언어");
		 book1.setPrice(30000);
		 book1.setDiscountRate(0.1);
		 book1.setAuthor("홍길동");
		 
		 System.out.println("수정된 결과 확인");
		 System.out.println(book1);
		
		 System.out.println("===========================");
		 
		 int price = (int) (book1.getPrice() - (book1.getPrice() * book1.getDiscountRate()));
		 int price2 = (int) (book2.getPrice() - (book2.getPrice() * book2.getDiscountRate()));
		 
		 System.out.println("도서명 :" + book1.getTitle());
		 System.out.println("할인된 가격 :" + price + "원");
		 System.out.println("도서명 : " + book2.getTitle());
		 System.out.println("할인된 가격 :" + price2 + "원");
	}
	
}
