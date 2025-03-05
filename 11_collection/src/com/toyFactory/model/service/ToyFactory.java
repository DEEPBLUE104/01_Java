package com.toyFactory.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.toyFactory.model.dto.Toy;

public class ToyFactory {

	private Scanner sc = new Scanner(System.in);
	private Set<Toy> toyset = new HashSet<>();
	private Map<Integer, String> materialMap = new HashMap<Integer, String>();
	Toy toy = new Toy();

	public ToyFactory() {

		materialMap.put(1, "면직물");
		materialMap.put(2, "플라스틱");
		materialMap.put(3, "유리");
		materialMap.put(4, "고무");

		toyset.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", addMaterials(1, 4)));
		toyset.add(new Toy("허기워기", 5, 12000, "파란색", "19940312", addMaterials(1, 2)));
		toyset.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", addMaterials(1, 2)));
		toyset.add(new Toy("캣냅", 8, 27000, "보라색", "19960128", addMaterials(1, 2)));
		toyset.add(new Toy("파피", 12, 57000, "빨간색", "19931225", addMaterials(1, 2, 4)));
	}

	/*
	 * 매개변수로 전달받은 값들을 재료저장 Map에 있는지 확인하고 Set형태로 반환하는 메서드
	 * 
	 * 가변인자 작성법: 자료형...변수명 -> 매개변수의 수가 정확히 몇 개인지 특정할 수 없을 때 사용
	 * 
	 * @return
	 */
	public Set<String> addMaterials(Integer... materials /* List<Integer> materials */ /* int[] materials */) {
		Set<String> addMaterials = new HashSet<String>(); // 매개변수로 전달받은 재료를 저장하여 반환할 set 객체 생성

		for (Integer materialKey : materials) {
			// Map에서 재료 고유 번호(Key)에 대응하는 재료명(value)를 가져와서
			// addMaterials에 추가

			String materialValue = materialMap.get(materialKey);

			if (materialValue != null) {
				addMaterials.add(materialValue);
			}
		}
		return addMaterials;
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
				System.out.println("0. 프로그램 종료");

				System.out.print("선택 : ");
				menuNum = sc.nextInt();

				switch (menuNum) {
				case 1:
					seeAllToy();
					break;
				case 2:
					makeNewToy();
					break;
				// case 3: deleteToy(); break;
				// case 4: seeMadeDayToy(); break;
				// case 5: seeWhenCanToy(); break;
				// case 6: plusMaterials(); break;
				// case 7: minusMaterials(); break;

				default:
					System.out.println("번호를 잘 못 입력하셨습니다.");

				}

			} while (menuNum != 0);
		} catch (Exception e) {
			System.out.println("예외 발생");
			e.printStackTrace();
		}

	}

	public void seeAllToy() {

		System.out.println("\n<전체 장난감 목록>");

		if (toyset.isEmpty()) {
			System.out.println("등록된 장난감이 없습니다.");
			return;

		}
		int index = 1;
		for (Toy toy : toyset) {
			System.out.println(index + "." + toy.toString());
			index++;
		}
	}

	public void makeNewToy() throws Exception {

		System.out.println("\n<새로운 장난감 추가>");

		System.out.print("장난감 이름 :");
		String toyname = sc.next();

		for (Toy existingToy : toyset) {

			if (existingToy.getToyname().equals(toyname)) {
				System.out.println("이미 같은 이름을 가진 장난감이 존재합니다.");

				return;
			}
		}

		System.out.print("사용 가능 연령 : ");
		int toyAge = sc.nextInt();

		System.out.print("가격 :");
		int toyprice = sc.nextInt();
		sc.nextLine();

		System.out.print("색상 : ");
		String toycolor = sc.next();

		System.out.print("제조일 (YYYYMMDD 형식으로 입력) :");
		String toymakeday = sc.next();

		Set<String> materials = new HashSet<String>();

		System.out.println("사용 가능한 재료 목록");

		// System.out.println(materialMap.entrySet());
		// [1=면직물, 2=플라스틱, 3=유리, 4=고무]
		// Set <Entry<K, V> > Map.entrySet() : key=value 한 쌍으로 이루어진 Entry 객체를
		// Set 객체로 반환

		// Entry.getKey() : Entry 객체의 key 반환
		// Entry.getValue() : Entry 객체의 value 반환
		for (Entry<Integer, String> entry : materialMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		// 1 : 면직물
		// 2 : 플라스틱
		// 3 : 유리
		// 4 : 고무

		while (true) {
			System.out.print("재료를 입력하세요 (종료하려면 'q'를 입력하세요.) :");

			try {
				String toymaterials = sc.next();

				if (toymaterials.equals("q")) {
					break;
				}

				int materialKey = Integer.parseInt(toymaterials); // "1" -> 1
				// NumberFormatException 발생 가능성 있음 : 문자열 (String)을 숫자로 변환하려고 할 때, 변환이 불가능한 경우 발생

				String material = materialMap.get(materialKey);

				if (material != null) {
					if (materials.contains(toymaterials)) {
						System.out.println("이미 추가된 재료입니다. 다른 재료를 선택하세요.");
					} else {
						materials.add(toymaterials);
						System.out.println("재료가 추가되었습니다 :" + material);
					}
				} else {
					System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				}

			} catch (Exception e) {
				System.out.println("숫자를 입력하거나 q를 입력하세요.");
			}

		}
	
	Toy newToy = new Toy(toyname,toyAge,toyprice,toycolor,toymakeday,materials);
	
	toyset.add(newToy);
	System.out.println("새로운 장난감이 추가되었습니다.");
	}

	public void deleteToy() throws Exception{
		System.out.println("삭제하실 장난감 번호를 입력해주세요.");
		int deletetoy = sc.nextInt();

		for (Toy toy : toyset) {
		}

	}
}
