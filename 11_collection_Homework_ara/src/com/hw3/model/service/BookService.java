package com.hw3.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class BookService {

	private static final String bookmaker = null;
	private List<Book> bookList = new ArrayList<>();
	private List<Book> starlist = new ArrayList<Book>();
	private Scanner sc = new Scanner(System.in);

	public BookService() {

		bookList.add(new Book(1111, "세이노의 가르침", "세이노", 6480, "데이원"));
		bookList.add(new Book(2222, "문과남자의 과학공부", "유시민", 15750, "돌베개"));
		bookList.add(new Book(3333, "역행자", "자청", 17550, "웅진지식하우스"));
		bookList.add(new Book(4444, "꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들"));
		bookList.add(new Book(5555, "도둑맞은 집중력", "요한 하리", 16920, "어크로스"));

		starlist.add(new Book(3333, "역행자", "자청", 17550, "웅진지식하우스"));
		starlist.add(new Book(5555, "도둑맞은 집중력", "요한 하리", 16920, "어크로스"));

	}

	public void displaymenu() {
		
	try {
		int menuNum = 0;
		
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
			
			
				
				menuNum = sc.nextInt();
							
				switch (menuNum) {
				case 1: System.out.println( addBook() ); break;
				case 2: selectAll(); break;
				case 3: updateBook(); break;
				case 4: removeBook(); break;
				case 5: plusStarBook(); break;
				case 6: removeStarBook(); break;
				case 7: selectStarBook(); break;
				case 8: pickStarBook(); break;
				case 0: System.out.println("도서 프로그램을 종료합니다."); break;
				default : System.out.println("메뉴에 작성된 번호만 입력해주세요."); break;
				}
			
			}while(menuNum != 0);
			
			} catch (Exception e) {
				System.out.println("\nerror : 입력형식이 유효하지 않습니다. 다시 시도해주세요.");
				e.printStackTrace();
			}
	}

	public String addBook() throws InputMismatchException {
		System.out.println("======도서 등록======");

		System.out.print("도서번호 :");
		int booknumber = sc.nextInt();
		sc.nextLine();

		System.out.print("도서제목 :");
		String title = sc.nextLine();

		System.out.print("도서 저자 : ");
		String author = sc.nextLine();

		System.out.print("도서 가격 :");
		int price = sc.nextInt();
		sc.nextLine();

		System.out.println("도서 출판사 :");
		String bookmaker = sc.next();

		Book newBook = new Book(booknumber, title, author, price, bookmaker);

		bookList.add(newBook);

		return "등록 완료";

	}

	public void selectAll() {

		if (bookList.isEmpty()) {
			System.out.println("등록된 도서가 없습니다. 도서를 등록해주세요.");
		
		} else {

		for (Book temp : bookList) {
			System.out.println(temp);

			}
		}
	}

	public String updateBook() {
		
		selectAll(); // 등록된 도서를 출력하기
		
		System.out.println("======도서 수정========");
		
		int editMenu = 0; // 수정 메뉴 선택용 변수
		
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		int bookNum = sc.nextInt();
		
		boolean flag = true;
		 
		for(Book temp : bookList) {
			
			if(temp.getBooknumber() == bookNum) { 
				// 입력한 도서번호와 도서 목록의 도서 번호가 일치하는걸 찾았을때
			
				flag = false;
				
				System.out.println("1. 도서명");
				System.out.println("2. 도서 저자");
				System.out.println("3. 도서 가격");
				System.out.println("4. 도서 출판사");
				System.out.println("0. 수정 종료");
				System.out.print("어떤 정보를 수정하시겠습니까? ");
				
				editMenu = sc.nextInt();
				sc.nextLine(); // 입력버퍼에 남은 개행문자 제거
				
				switch(editMenu) {
				case 1 : 
					System.out.println("===도서명 수정===");
					System.out.print("수정할 도서명을 입력하세요 : ");
					String title = sc.nextLine();
					temp.setTitle(title);
					break;
					
				case 2 :
					System.out.println("===도서 저자 수정===");
					System.out.print("수정할 저자명을 입력하세요 : ");
					String writer = sc.nextLine();
					temp.setAuthor(writer);
					break;
					
				case 3 :
					System.out.println("===도서 가격 수정===");
					System.out.print("수정할 가격을 입력하세요 : ");
					int price = sc.nextInt();
					temp.setPrice(price);
					break;
					
				case 4 :
					System.out.println("===도서 출판사 수정===");
					System.out.print("수정할 출판사를 입력하세요 : ");
					String publisher = sc.nextLine();
					temp.setBookmaker(bookmaker);
					break;
					
				case 0 : System.out.println("종료합니다..."); break;
				default : System.out.println("메뉴에 있는 번호만 선택하세요"); break;
				}
				
			}
		}
		
		if(flag) {
			return "일치하는 도서 번호가 없습니다.";
		}
		
		return "수정 완료";
	}
	
	

	public String removeBook() {
		System.out.print("=======도서 삭제=======");
		selectAll();
		
		System.out.print("삭제할 도서의 번호를 입력하세요 :");
		int deleteNum = sc.nextInt();

		for(Book temp : bookList) {
			
			if(temp.getBooknumber() == deleteNum) {
				int index = bookList.indexOf(temp);
				// int List.indexOf(Object) : List에 일치하는 객체가 있으면 그 객체가 있는 index번호 반환
				
				System.out.println("index 번호 : " + index);
				
				System.out.print("정말 삭제하시겠습니까? (Y/N) : ");
				
				char answer = sc.next().toUpperCase().charAt(0); // "y" -> "Y" -> 'Y'
				
				if(answer == 'Y') {
					bookList.remove(index);
					break;
				} else {
					return "삭제를 진행하지 않습니다";
				}
			}
			
		}
		
		return "삭제 끝";
	}
	

	public String plusStarBook() {
		System.out.println("======즐겨찾기 도서 등록======");

		System.out.print("도서번호 :");
		int booknumber = sc.nextInt();
		sc.next();

		System.out.print("도서제목 :");
		String title = sc.next();

		System.out.print("도서 저자 : ");
		String author = sc.next();

		System.out.print("도서 가격 :");
		int price = sc.nextInt();

		System.out.println("도서 출판사 :");
		String bookmaker = sc.next();

		if (starlist.add(new Book(booknumber, title, author, price, bookmaker))) {
			return "등록완료";

		} else {
			return "오류가 발생했습니다. 다시 등록해주세요.";

		}
	}

	public String removeStarBook() {

		System.out.print("인덱스 번호 :");
		int index = sc.nextInt();

		if (starlist.isEmpty())
			return "입력된 도서정보가 없습니다.";

		if (index < 0)
			return "음수는 입력할 수 없습니다.";

		if (index >= starlist.size())
			return "범위를 넘어선 값을 입력할 수 없습니다.";

		System.out.print("정말 삭제 하시겠습니까? (Y/N) : ");
		char ch = sc.next().toUpperCase().charAt(0);

		if (ch == 'Y') {
			Book temp = starlist.remove(index);
			return temp.getTitle() + "의 정보가 제거 되었습니다.";
		}
		return "취소";
	}

	public void selectStarBook() {
		if (starlist.isEmpty()) {
			System.out.println("");
		}

		int index = 0;
		for (Book list : starlist) {
			System.out.println((index++) + "도서 :");
			System.out.println(starlist);

		}
	}

	public void pickStarBook() {

int max = bookList.size();
		
		int random = (int)(Math.random() * max); // 0 ~ 리스트의 마지막인데스번호
		
		System.out.println( bookList.get(random).getTitle() );
		
	}
	
	
	
	
}
