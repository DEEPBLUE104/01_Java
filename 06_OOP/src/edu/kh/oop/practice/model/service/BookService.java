package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {

	public void practice() {

	// 1) 기본 생성자를 이용하여 첫 번째 Book 객체 생성	
	Book bk = new Book();
	
	// 2) 매개변수 생성자를 이용하여 두 번째 Book 객체 생성(사용 데이터 참고)
	Book bk2 = new Book();
	
	//3) 객체가 가진 필드 값을 toString()을 이용하여 출력
	System.out.println(bk.toString());
	System.out.println(bk2.toString());
	
	}
	
	
		
		
	}

