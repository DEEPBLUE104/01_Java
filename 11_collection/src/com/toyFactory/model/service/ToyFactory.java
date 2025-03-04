package com.toyFactory.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.toyFactory.model.dto.Toy;

public class ToyFactory {

	Scanner sc = new Scanner(System.in);
	Set<Toy> toyset = new HashSet<>();
	Map<Integer, String> map = new HashMap<Integer, String>();
	Toy toy = new Toy();
	
	public ToyFactory() {
	
	map.put(1, "면직물");
	map.put(2, "플라스틱");
	map.put(3, "유리");
	map.put(4, "고무");

	toyset.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", "면직물, 고무"));
	toyset.add(new Toy("허기워기", 5, 12000, "파란색", "19940312", "면직물, 플라스틱"));
	toyset.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", "면직물, 플라스틱"));
	toyset.add(new Toy("캣냅", 8, 27000, "보라색", "19960128", "면직물, 플라스틱"));
	toyset.add(new Toy("파피", 12, 57000, "빨간색", "19931225", "면직물, 플라스틱 ,고무"));
}
	public void PlayTimeFactory() {


		int menuNum = 0;

		try {
			do {
				System.out.println("<<플레이타임 공장>>");
				System.out.println("1. 전체 장난감 조회하기");
				System.out.println("2. 새로운 장난감 만들기");
				System.out.println("3. 장난감 삭제하기");
				System.out.println("4. 장난감 제조일 순으로 조회하기");
				System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
				System.out.println("6. 재료 추가");
				System.out.println("7. 재료 제거");

				System.out.print("선택 : ");
				menuNum = sc.nextInt();
			
				switch (menuNum) {
				case 1:
					seeAllToy();
					break;
			//	case 2: makeNewToy(); break;
			//	case 3: deleteToy(); break;
			//	case 4: seeMadeDayToy(); break;
			//	case 5: seeWhenCanToy(); break;
			//	case 6: plusMaterials(); break;
			//	case 7: minusMaterials(); break;
					
				default: System.out.println("번호를 잘 못 입력하셨습니다.");
				
				}

			} while (menuNum != 0);
		} catch (Exception e) {
			System.out.println("예외 발생");
			e.printStackTrace();
		}


	}

	public void seeAllToy() {

		System.out.println("<전체 장난감 목록>");

		if (toyset.isEmpty()) {
			System.out.println("등록된 장난감이 없습니다.");
		} else {
			int index = 1;
			for (Toy toy : toyset) {
				System.out.println(index + "." + toy.toString());
				index++;
			}
		}
	}


	public void makeNewToy() {
	
		System.out.println("<새로운 장난감 추가>");
		
		System.out.print("장난감 이름 :");
		String toyname = sc.next();
		
		System.out.print("사용 가능 연령 : ");
		int toyAge = sc.nextInt();
		
		System.out.print("가격 :");
		int toyprice = sc.nextInt();
		sc.nextLine();
		
		System.out.print("색상 : ");
		String toycolor = sc.next();
		
		System.out.print("제조일 (YYYYMMDD 형식으로 입력) :");
		String toymakeday = sc.next();
		
		System.out.print("재료를 입력하세요 (종료하려면 'q'를 입력하세요.) :");
		String toymaterials = sc.next();
		
		if(toymaterials != "q") {
		
		}
		
	}
	
}
