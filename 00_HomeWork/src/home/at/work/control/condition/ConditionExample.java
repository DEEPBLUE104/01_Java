package home.at.work.control.condition;

import java.util.Scanner;

public class ConditionExample {
	
	Scanner sc = new Scanner(System.in);

	public void ce01() {
	
	System.out.print("숫자를 입력하세요. :");
	int input = sc.nextInt();
	
	if(input >= 1) {
		System.out.println("양수입니다.");
	
	} else if (input == 0 ) {
			System.out.println("0입니다.");
		
		} else { 
			System.out.println("음수입니다.");
		}
	}

	public void ce02() {
		
		System.out.print("정수 입력 :");
		int input = sc.nextInt();
		 
		if (input %2 == 1) {
			System.out.println("홀수입니다.");
		
		} else {
			
			if (input == 0) {
			System.out.println("0 입니다");
			} else {
			System.out.println(" 짝수입니다.");
		}
	
	}

}

	public void ce03() {
	/*public void ex4() {
		// 달(month)을 입력받아 해당 달에 맞는 계절 출력
		// 1,2,12 겨울 (-15도 이하 : "한파 경보" / -12도 이하 : "한파 주의보")
		// 3~5 봄
		// 6~8 여름 (35도 이상: "폭염 경보" / 33도 이상 : "폭염 주의보")
		// 9~11 가을
		// 1~12 사이가 아닐 땐 "해당하는 계절이 없다" 출력*/
	
	System.out.print(" 달 입력 :");
	int month = sc.nextInt();
	
	System.out.print("온도 입력 : ");
	int temperture = sc.nextInt();
	
	if (month == 1 || month == 2 || month ==12) {
		
		if(temperture<=-15 ) {
		System.out.println("겨울 : 한파 경보");
		
	} else if (temperture<-12) {
		System.out.println("겨울 : 한파 주의보");
	
	} else { System.out.println("겨울");
		}
	}	
	
	else if (month <=5 && month >=3) {
		System.out.println("봄");
		
	}else if (month >=6 && month <= 8) {
		if (temperture >=35) {
			System.out.println("여름 : 폭염경보");
		
		} else if (temperture>=33) {
			System.out.println("여름 : 폭염주의보");
		
		} else { System.out.println("여름");
	}		
	
	} else if( month >=9 && month <=11) {
		System.out.println("가을");

	} else { System.out.println("해당하는 계절이 없다");
	
		}
	}
		
	
	
	
	}
	
	