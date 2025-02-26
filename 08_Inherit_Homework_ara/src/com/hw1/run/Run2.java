package com.hw1.run;

import com.hw1.model.dto.Book;
import com.hw1.model.dto.Novel;
import com.hw1.model.dto.Poetry;
import com.hw1.model.dto.Textbook;

public class Run2 {

	public static void main(String[] args) {

		Book book[] = new Book[3];
		
		Book b1 = new Novel("해리 포터","J.K 롤링","판타지");
		Book b2 = new Textbook("자바 프로그래밍","James Gosling","컴퓨터 과학");
		Book b3 = new Poetry("우리들의 사랑시","김소월",30);
		
		book[0] = b1; //소설
		book[1] = b2; //텍북
		book[2] = b3; // 시
		
		book[0].displayInfo();
		book[1].displayInfo();
		book[2].displayInfo();
	}

}
