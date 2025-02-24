package home.at.work.objectArray.service;

import java.util.Scanner;

import home.at.work.objectArray.model.vo.Member;

public class MemberService {

	private Scanner sc = new Scanner(System.in);
	
	private Member[] memberArr = new Member[5];

	private Member loginMember = null;
	
	public MemberService() {
		
		memberArr[0] = new Member("user01","pass01","홍길동",30,"서울");
		memberArr[1] = new Member("user02","pass02","계보린",25,"경기");
		memberArr[2] = new Member("user03","pass03","고길동",45,"강원");
	}

	public void displayMenu() {
		
		int menuNum = 0;
		
		do {
			
				System.out.println("====회원 정보 관리 프로그램 v2=====");
				System.out.println("1. 회원가입");
				System.out.println("2. 로그인");
				System.out.println("3. 회원 정보 조회");
				System.out.println("4. 회원 정보 수정");
				System.out.println("5. 회원 검색(지역");
				System.out.println("0. 프로그램 종료");

				System.out.println("메뉴 입력 :");
				menuNum = sc.nextInt();
				sc.nextLine();
				
				switch(menuNum) {
				case 1 : break;
				case 2 : break;
				case 3 : break;
				case 4 : break;
				case 5 : break;
				case 0 : System.out.println("프로그램 종료"); break;
				default : System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
				}
		} while(menuNum != 0);
	}

	public int emptyIndex() {
		for(int i = 0; i <memberArr.length; i++) {
			if(memberArr[i] == null) {
				return i;
			}
		}
		return -1;
	}
	

	public String signUp() {
		System.out.println("\n========회원 가입===========");
	
		int index = emptyIndex();
		
		if(index == -1) {
			return "회원가입 불가능 합니다.(인원 수 초과)";
		}
	
		System.out.print("아이디 :");
		String memberId = sc.next();
		
		System.out.print("비밀번호 :");
		String memberPw = sc.next();
	
		System.out.print("비밀번호 :");
		String memberPw2 = sc.next();
		
		System.out.print("이름 :");
		String memberName = sc.next();
	
		System.out.print("나이 :");
		String memberAge = sc.next();
		
		System.out.print("지역 :");
		String region = sc.next();

	if (memberPw.equals(memberPw2)) {
		return "회원가입 성공";
	} else {
		return "회원 가입 실패";
	}
	}
	
}
