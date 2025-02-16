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
		
	public void ce04() {
		
	System.out.print("달 입력 :");
	int month = sc.nextInt();
	
	String season;
	
	if (month == 1 || month == 2 || month == 12) {
		season = "겨울";
		
		System.out.print("온도 입력 :");
		int temperature = sc.nextInt();
		
		if(temperature <= -15) {
			season += "한파 경보";
		} else if(temperature <= -12) {
			season += "한파 주의보";
		}
		
	} else if ( month >=3 && month <= 5) {
		season = "봄";
	} else if ( month >=6 && month >= 8) {
		season = "여름";
		
		System.out.print("온도 입력 :");
		int temperature = sc.nextInt();
		
		if(temperature <= 35) {
			season += "폭염 경보";
		} else if(temperature <= -12) {
			season += "폭염 주의보";
		}
		
	} else if (month >= 9 && month <= 11) {
		season = "가을";
	} else { 
		season = "해당하는 계절이 없습니다.";
	}
	}
	
	public void ce05() {
		
		System.out.print("나이를 입력하세요. :");
		int age = sc.nextInt();
		
		if (age <= 13) {
			System.out.println("어린이 입니다.");
		} else if (age <=19 ) {
			System.out.println("청소년 입니다.");
		} else if (age > 19) { 
			System.out.println("성인입니다.");
		}
	}
	
	public void ce06() {
	
		System.out.println("나이를 입력하세요. : ");
		int age = sc.nextInt();
		
		String result;
		
		if (age <= 13) result = "어린이 입니다." ;
		else if (age <= 13) result = "청소년 입니다." ;
		else if (age <= 13) result = "성인 입니다." ;
	}

	public void ce07() {
		
		System.out.print("점수 입력 :");
		int score = sc.nextInt();
		
		double result = score/10;
	
		if(result == 10 || result < 0) {
			System.out.println("잘못 입력하셨습니다.");
		
		} else if(result >= 9) {
			System.out.println("A");
		
		} else if(result >= 8) {
			System.out.println("B");
		}else if(result >= 7) {
		System.out.println("C");
		
		}else if(result >= 6) {
		System.out.println("D");
		
		}else { 
			System.out.println("F");
		} // 음수를 입력해도 F 가 나옴.. 어떻게 된거지..
	}	

	public void ce08(){
		
		System.out.print("점수 입력:");
		int input = sc.nextInt();
		
		String result;
		
		if (input < 0 || input > 100) {
			result = "잘못 입력하셨습니다.";
		} else if (input >= 90) {
			result = "A";
		} else if (input >= 80) {
			result = "B";
		} else if (input >= 70) {
			result = "C";
		} else if (input >= 60) {
			result = "D";
		} else {
			result = "F";
		}
		
		System.out.println(result);
	}

	public void ce09() {
		
		System.out.print("나이입력 :");
		int age = sc.nextInt();

		System.out.print("키입력 :");
		double height = sc.nextDouble();
		
		String result;
		
		if (age > 100 || age < 0) {
			result = "잘못 입력하셨습니다.";
		} else if (age >= 12) {
			
			if(height>=140.0) {
				result= "탑승가능";
			
			} else { 
				result = "적정 키가 아닙니다.";
			}
			
	} else {
		result = "적정 연령이 아닙니다";
		
	}
		System.out.println(result);
	}
	
	public void ce10() {
		
		System.out.print("나이 입력 :");
		int age = sc.nextInt();
		
		System.out.print("키 입력 :");
		double height = sc.nextDouble();
		
		String result;
		
		if (age > 100 || age < 0) {
			result = "나이를 잘못 입력 하셨습니다.";
		
		} else if (height > 250.0 || height < 0) {
			result = "키를 잘못 입력 하셨습니다.";
		
		} else if (age >= 12) {
			if(height>=140.0) {
				result = "탑승 가능";
			} else {
				result = "나이는 적절하나, 키가 적절치 않음";
			}
		}else {
			if(height>=140.0) {
				result = "키는 적절하나, 나이가 적절치 않음";
			} else {
				result = "나이와 키 모두 적절치 않음";
		}
			System.out.println(result);
		
		}
		
	}
	
	public void ce11() {
		
		System.out.print("요일 번호 입력 :");
		int day = sc.nextInt();
		
		switch(day) {
		case 1: System.out.println("월요일"); break;
		case 2: System.out.println("화요일"); break;
		case 3: System.out.println("수요일"); break;
		case 4: System.out.println("목요일"); break;
		case 5: System.out.println("금요일"); break;
		case 6: System.out.println("토요일"); break;
		case 7: System.out.println("일요일"); break;
		default : System.out.println("잘못된 입력이다.");
		
		
		}
		
	}
	
}
	
	
	