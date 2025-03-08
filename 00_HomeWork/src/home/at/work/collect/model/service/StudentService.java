package home.at.work.collect.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import home.at.work.collect.model.vo.Student;

public class StudentService {

	
	private List<Student> studentlist = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);

	public StudentService() {
		
		studentlist.add(new Student("홍길동", 23, "서울시 중구", 'M', 100));
		studentlist.add(new Student("고영희", 23, "경기도 안산시", 'F', 100));
		studentlist.add(new Student("강아지", 30, "서울시 강남구", 'M', 80));
		studentlist.add(new Student("오미나", 27, "충북 청주시", 'F', 90));
		studentlist.add(new Student("박주희", 24, "서울시 서대문구", 'F', 70));
	}

	public void displayMenu() {
		
		int menuNum = 0;
		
		do {
			System.out.println("\n=======학생 관리 프로그램=========");
			System.out.println("1. 학생 정보 추가");
			System.out.println("2. 학생 정보 전체 조회");
			System.out.println("3. 학생 정보 수정");
			System.out.println("4. 학생 정보 제거");
			System.out.println("5. 이름으로 검색(일치)");
			System.out.println("6. 이름으로 검색(포함)");
			System.out.println("7. 나이순으로 정렬"); // Comparable 사용
			System.out.println("8. 이름순으로 정렬"); // Comparator 사용
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 번호 선택 : ");
			
			try {
				menuNum = sc.nextInt();
				sc.nextLine();
				
				switch(menuNum) {
			//	case 1: System.out.println( addStudent() ); break;
			//	case 2: selectAll(); break;
			//	case 3: System.out.println( updateStudent() ); break;
			//	case 4: System.out.println( removeStudent() ); break;
			//	case 5: searchName1(); break;
			//	case 6: searchName2(); break;
			//	case 7: sortByAge(); break;
			//	case 8: sortByName(); break;
			//	case 0: System.out.println("프로그램 종료.."); break;
				default : System.out.println("메뉴에 작성된 번호만 입력하세요!");
				}
				
			}catch(Exception e) {
				System.out.println("\nerror: 입력형식이 유효하지 않습니다. 다시 시도해주세요.");
				
				sc.nextLine();
				
				menuNum = -1;
			}
			
			
		}while(menuNum != 0);
	}

	
	public void addStudent() {
		
		
		
	}
}
