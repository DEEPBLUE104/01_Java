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
				case 1 : System.out.println( signUp() );  break;
				case 2 : System.out.println( login() );   break;
				case 3 : System.out.println( selectMember() );    break;
				case 4 : int result = updateMember();
				
					if(result == -1) {
						System.out.println("로그인 후 이용바람");
					} else if (result == 0) {
						System.out.println("회원 정보 수정 실패(비밀번호 불일치)");
					} else {
						System.out.println("회원 정보가 수정되었습니다.");
					}
					
					
					break;
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

	
	public String login() {
		
		System.out.println("\n========로그인==========");
	
		System.out.print("아이디 :");
		String memberId = sc.next();
	
		System.out.print("비밀번호 :");
		String memberPw = sc.next();
	
		for (int i =0; i <memberArr.length; i++) {
			if(memberArr[i] != null) {
				if(memberArr[i].getMemberId().equals(memberId) &&
					memberArr[i].getMemberPw().equals(memberPw)){
						loginMember = memberArr[i];
					}
			}
		}
	
		if (loginMember == null) {
			return "아이디 또는 비밀번호가 일치하지 않습니다.";
		} else {
			return loginMember.getMemberName() + "님 환영합니다";
		}
	}

	
	public void searchReigon() {
		
		System.out.println("\n========회원 검색(지역)==========");
		System.out.print("검색할 지역을 입력하세요 :");
		String inputRegion = sc.next();
		
		boolean flag = true;
		
		for(int i = 0; i < memberArr.length; i++) {
			if(memberArr[i] == null) {
				break;
			}
		
			if (memberArr[i].getRegion().equals(inputRegion)) {
				System.out.printf("아이디 : %s, 이름 : %s\n",
							memberArr[i].getMemberId(),
							memberArr[i].getMemberName());
		
				flag = false;
			}
		}
	
		if(flag) {
			System.out.println("일치하는 검색결과가 없습니다.");
		}
	}

	
	public String selectMember() {
		System.out.println("\n===========회원 정보 조회============");
	
		if(loginMember == null) {
			return "로그인 후 이용바람";
		}
		
		String str = "이름 : " + loginMember.getMemberName();
		str += "\n아이디 :" + loginMember.getMemberId();
		str += "\n나이 : " + loginMember.getMemberAge();
		str += "\n지역 :" + loginMember.getRegion(); 
		
		return str;
		
	}

	
	public int updateMember() {
		System.out.println("\n==========회원 정보 수정=============");
	
		if(loginMember == null) {
			return -1;
		}
	
		System.out.print("수정할 이름 입력 :");
		String inputName = sc.next();
		
		System.out.print("수정할 나이 입력 :");
		int inputAge = sc.nextInt();
		
		System.out.print("수정할 지역 입력 : ");
 		String inputRegion = sc.next();
 		
 		System.out.print("비밀번호 입력 : ");
 		String inputPw = sc.next();
 		
	if( inputPw.equals(loginMember.getMemberPw()) ) {
 			
			loginMember.setMemberName(inputName);;
 			loginMember.setMemberAge(inputAge);
 			loginMember.setRegion(inputRegion);
 			
 			return 1;
 			
 		} else { // 다를 경우
 			// 5) 비밀번호가 다를 경우 0 반환
 			return 0;
 		}
 		
 		
 	}
 	
	}
