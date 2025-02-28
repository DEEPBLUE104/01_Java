package com.hw3.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class BookService {

	List<Book> bookList = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);

	public void booklist() {

		bookList.add(new Book(1111, "세이노의 가르침", "세이노", 6480, "데이원"));
		bookList.add(new Book(2222, "문과남자의 과학공부", "유시민", 15750, "돌베개"));
		bookList.add(new Book(3333, "역행자", "자청", 17550, "웅진지식하우스"));
		bookList.add(new Book(4444, "꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들"));
		bookList.add(new Book(5555, "도둑맞은 집중력", "요한 하리", 16920, "어크로스"));

		do {
			System.out.println("===도서 목록 프로그램===");
			System.out.println("1. 도서등록");
			System.out.println("2. 도서조회");
			System.out.println("3. 도서수정");
			System.out.println("4. 도서삭제");
			System.out.println("5. 즐겨찾기 추가");
			System.out.println("6. 즐겨찾기 삭제");
			System.out.println("7. 즐겨찾기 조회");
			System.out.println("8. 추천도서 뽑기");
			System.out.println("0. 프로그램 종료");

			System.out.print("메뉴를 입력하세요 :");
			
			
			int input = sc.nextInt();

/*			switch (input) {
			case 1: addBook(); break;
			case 2: selectAll(); break;
			case 3: updateBook(); break;
			case 4: removeBook(); break;
			case 5: plusStarBook(); break;
			case 6: removeStarBook(); break;
			case 7: addbook(); break;
			case 8: addbook(); break;
			case 0: addbook(); break;
			default : System.out.println("메뉴에 작성된 번호만 입력해주세요.");
			}
*/
	
		}
	}

	public String addBook() {
		System.out.println("======도서 등록======");
		
		System.out.print("도서번호");
		int booknumber = sc.nextInt();
		
		System.out.print("도서제목");
		int title = sc.nextInt();
		
		return"";
	}


}
