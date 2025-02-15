package home.at.work.operater;

import java.util.Scanner;

public class OperaterEx {
	
	Scanner sc = new Scanner(System.in);
	
	public void op1(){
/*모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.

[실행화면]
인원 수 : 29
사탕 개수 : 100
1인당 사탕 개수 : 3
남는 사탕 개수 : 13*/
		
		System.out.print("인원 수 :");
		int iNum1 = sc.nextInt();
		
		System.out.print("사탕 개수 :");
		int iNum2 = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 :" + iNum2/ iNum1);
		System.out.println("남는 사탕 개수 :" + (iNum2 - iNum1 * ( iNum2/iNum1 )));	
	
	}

	public void op2() {
/*		키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.

		ex.
		이름 : 홍길동
		학년(정수만) : 3
		반(정수만) : 4
		번호(정수만) : 15
		성별(남학생/여학생) : 남학생
		성적(소수점 아래 둘째 자리까지) : 85.75
		3학년 4반 15번 홍길동 남학생의 성적은 85.75이다. */
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		
		System.out.print("반 :");
		int classroom = sc.nextInt();
		
		System.out.print("번호 :");
		int num = sc.nextInt();
		
		sc.nextLine(); // 입력버퍼 비우는 일 (개행문자 지우기)	
		
		System.out.print("성별(남학생/여학생) : ");
		String gender = sc.next();
		
		System.out.print("성적 :");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n"
			,grade, classroom, num, name, gender,score );
				
	
	}

	public void op3(){
		/*	국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
	세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.

	[실행화면]
	국어 : 60
	영어 : 80
	수학 : 40
	합계 : 180
	평균 : 60.0*/
		
		
		System.out.print("국어 :");
		int kor = sc.nextInt();
		
		System.out.print("영어 :");
		int eng = sc.nextInt();
		
		System.out.print("수학 :");
		int math = sc.nextInt();
		
		int sum = (kor + math + eng);
		double avg = sum/3;
		
		
		System.out.println("합계 :" + sum);
		System.out.print("평균 :" + avg);
		
		
	}
	
	public void op4(){
		
		/*키보드로 나이를 입력받아 
20세 이상이면 "저는 성인 입니다", 아니면 "저는 미성년 입니다" 출력.
입력받은 값이 13세 이상이면서 19세 이하면 "청소년입니까? true"출력, 아니면 false 출력
입력받은 값이 65세 이상이거나, 12세 이하면 
"노인이거나 어린이 입니까? true" 출력 아니면 false 출력
		
[실행화면]
		
당신의 나이는 ? : 20
저는 성인입니다
청소년 입니까? false
노인이거나 어린이 입니까? false
-----------------------------------------
당신의 나이는 ? : 13
저는 미성년입니다
청소년 입니까? true
노인이거나 어린이 입니까? false*/
		
		System.out.print("당신의 나이는 ? :");
		int age = sc.nextInt();

		String personType = (age >= 20) ? "성인":"미성년";
		System.out.println("저는" + personType + "입니다.");
		
		boolean isTeenager = (age>=13)&&(age<=19);
		System.out.println("청소년 입니까?" + isTeenager);
		
		boolean isSeniorOrChild = (age >= 65) || (age <= 12);
		System.out.println("노인이거나 어린이입니까?" + isSeniorOrChild);
		
		// 이 예문은 맞는 부분이 없었어.. 일주일 뒤에 다시 해보자.
		// true false 이야기가 나오면 boolean 을 생각해보자
		
		
	}

	public void op5(){
	/*문제1) 
마트에서 고객에게 할인 혜택을 제공하려고 한다
물건의 총 가격과 회원 여부를 입력받아, 
회원이라면 10% 할인을 적용하고, 그렇지 않다면 5% 할인을 적용한 최종 가격을 출력해라


[실행화면]
가격을 입력 하세요 : 10000
멤버십 있으세요? (있으면 true / 없으면 false 입력) : true
할인을 포함한 최종금액 : 9000.0원


가격을 입력 하세요 : 10000
멤버십 있으세요? (있으면 true / 없으면 false 입력) : false
할인을 포함한 최종금액 : 9500.0원
*/
		System.out.print(" 가격을 입력 하세요. :");
		int price = sc.nextInt();
		
		System.out.print("멤버십 있으세요 ? (있으면 true/없으면 false 입력) :");
		boolean isMember = sc.nextBoolean();
		
		double discount = isMember ? price * 0.10 : price * 0.05;
		
		double finalPrice = price - discount;
		
		
		// System.out.println("할인율 : " + discount); > 예시에 안 나오니 삭제해도 괜찮은거 같은데
		System.out.println("할인을 포함한 최종 금액 : " + finalPrice + "원");
		
		
		// 이 예문도 맞출 수가 없었다
		// 어떤 부분을 고려해야 할지도 감이 안 잡힘 삼항 연산자 부분 다시 공부해보자..		
}
	
	public void op6() {
		
		/*ATM에서 사용자가 원하는 금액을 입력하면, 5만원, 1만원, 5천원, 1천원 단위로 최소 개수의 지폐로 돈을 인출하라
ex) 사용자가 123000원을 입력하면, 5만원 지폐 2장, 1만원 지폐 2장, 5천원 지폐 0장, 1천원 지폐 3장이 필요함


[실행화면]
출금할 금액 입력 : 123000
50000원: 2
10000원: 2
5000원: 0
1000원: 3


출금할 금액 입력 : 253000
50000원: 5
10000원: 0
5000원: 0
1000원: 3
*/
		System.out.print("출금할 금액 입력 :");
		int amount = sc.nextInt();
		
		int fiftyTh = amount / 50000; // 5만원짜리 지폐 갯수
		//amount = amount % 50000; //5만원짜리 지폐 거르고 난 뒤 나머지 금액
		// 나머지값을 amount 변수에 재대입해야 아래 다음 지폐에서 재사용 할 수 있음.
		
		amount %= 50000; //복합대입연산자(%와 = 을 합쳐 사용)
		
		// += -= *= /=
		// amount = amount - 50000;
		// amount -= 50000;
		
		int tenTh = amount / 10000; //1만짜리 지폐 갯수
		amount %= 10000;
		
		int fiveTh = amount / 5000; // 5천원짜리 지폐 갯수
		amount %= 5000;
		
		int oneTh = amount / 1000; //1천원짜리 지폐 갯수
		
		System.out.println("50000원 : " + fiftyTh);
		System.out.println("10000원 : " + tenTh);
		System.out.println("5000원 : " + fiveTh);
		System.out.println("1000원 : " + oneTh);
		
		//이번에는 풀이 방식은 맞았어! 잘했다 잘했다
	}

	public void op7() {
	
	/*사용자로부터 두 개의 정수를 입력받아, 
첫 번째 수가 두 번째 수의 배수인지 확인하고 결과를 출력해라
만약 배수라면 "배수입니다"를 출력하고, 아니라면 "배수가 아닙니다"를 출력


[실행화면]
첫 번째 수 : 100
두 번째 수 : 5
배수입니다

첫 번째 수 : 200
두 번째 수 : 7
배수가 아닙니다*/
		
		System.out.print("첫 번째 수 :");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 수 :");
		int num2 = sc.nextInt();
		
		String result = num1 % num2 == 0? "배수입니다." : "배수가 아닙니다.";
		
		System.out.println(result);
	}
}
