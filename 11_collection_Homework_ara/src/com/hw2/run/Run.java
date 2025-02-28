package com.hw2.run;

import java.awt.DisplayMode;
import java.util.Scanner;

import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;
import com.hw2.model.service.Zoo;

public class Run { // 자바 코드 자동 정렬 ctrl + shift + F!

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Zoo 객체 생성
		// Tiger 객체 생성하여 zoo에 추가하기
		// Monkey 객체 생성하여 zoo에 추가하기

		// 동물원 메뉴 출력하여 입력된 값대로 코드 수행하기

		Zoo zoo = new Zoo();
		Tiger tiger = new Tiger();
		Monkey monkey = new Monkey();

		while (true) {
			zoo.displayMenu();
			int input = sc.nextInt();

			if (input == 1) {
				zoo.showAnimals();
				tiger.sound();
				monkey.sound();
			} else if (input != 1) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

}
