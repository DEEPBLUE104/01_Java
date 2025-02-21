package com.kh.practice.snack.veiw;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {

	Scanner sc = new Scanner(System.in);

	SnackController st = new SnackController();
	
	public void menu() {
		System.out.print("종류 : ");
		String kind = sc.next();
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("맛 : ");
		String flavor = sc.next();
			
	
		System.out.print("개수 : ");
		int numOf = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.println(st.saveData(kind ,name ,flavor ,numOf ,price));
		
		st.saveData(kind ,name ,flavor ,numOf ,price);
	
		System.out.print("저장된 정보를 확인하시겠습니까?(y/n) :");
		String answer = sc.next();
		
		if(answer.equals("y")) {
			System.out.printf("%s(%s - %s) %d개 %d원",kind,name,flavor,numOf,price );
		}else {
			System.out.println("");
		}
		
	}

}
