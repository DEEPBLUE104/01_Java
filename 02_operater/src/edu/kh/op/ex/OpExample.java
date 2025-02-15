package edu.kh.op.ex;

import java.util.Scanner;

//예제 코드 작성용 클래스 (기능용/메서드용)
public class OpExample {
	
	// ex() method : OpExample 이라는 클래스에 포함된 메서드
	public void ex1() {
		
		//증감(증감, 감소) 연산자 : ++ , --
		// 1을 더하거나 감소시키는 연산자
		
		int iNum1 = 10; 
		int iNum2 = 10;
		
		iNum1++;
		iNum2--;
		
		System.out.println("iNum1 :" + iNum1);
		System.out.println("iNum2 :" + iNum2);

		// 전위 연산
		int temp1 = 5;
		
		System.out.println(++temp1 +5);
							// 6 + 5 -> 11
		
		// 후위 연산
		int temp2 = 3;
		
		System.out.println( temp2-- +2 );
						// 3 + 2 > 5
						// 3-- > 2
		System.out.println(temp2);
		// 왜 위에 temp2는 3이고 여기는 2냐면 위에서 아래로 코드가 흘러가기 때문
		// 순서대로 진행해야 2라는 숫자가 나온다.
		
		int a = 3;
		int b = 5;
		int c = a++ + --b;
		
		//      3++ + --5
		//      3++ +   4(B)
		//     c> 3+4 > 7
		//     3++ > 4(A)
		
		
		System.out.printf("%d / %d / %d\n", a, b, c);
		//3, 4, 8   > 4, 4, 7
		
	}
	
	public void ex2() {
	

	//비교 연산자 : >  <  >=  <= == !=
	// - 비교 연산자의 결과는 항상 논리값(true/false)
	
	int a = 10;
	int b = 20;
	
	System.out.println( (a == b) == false );
					// (false ) == false
					// -> true
	int c = 4;
	int d = 5;
	
	System.out.println((++c !=d) == (--c !=d));
	// ++4(5) !=5 -> 5랑 5랑 같지 않다(false) (1번식)
	// --5(4) !=5 -> 4랑 5랑 같지 않다(true) (2번식)
	//-2번식에서 c가 5인 이유는 1번 식에서 1 증가했기 때문에.
	// false == true (false)
	
	System.out.println(100 > 90);
	System.out.println(100 >= 100);
	System.out.println(99 < 64 );
	System.out.println(99 <= 100 );
	
	
	}

	public void ex3() {
		
		//논리 연산자 : && (AND) , || (OR)
		
		//&& (AND) : 둘 다 true 면 true, 나머지 false 
		// 와, 그리고, ~면서, ~부터, ~까지, ~사이
		
		int a = 101;
		// a는 100 이상 이면서 짝수인가?
		System.out.println( (a >= 100) && (a % 2 == 0) ); //false
		
		int b = 5;
		// b는 1부터 10까지 숫자 범위에 포함되어 있는가?
		// 1 ~ 10 -> b는 1보다 크거나 같으면서/ 10보다 작거나 같다.
		System.out.println((b >=1) && (b <= 10));

		// || (OR) : 둘다 false면 false, 나머지는 true
		// 또는 ,혹은, ~거나
		
		int c = 10;
		
		// c는 10을 초과하거나 짝수인가.
		
		System.out.println(( c > 10 ) || (c % 2 ==0) );
		
		
	}

	public void ex4() {
		//삼항 연산자 : 조건식 ? true 일때 수행될 값 : false라면 수행될 값
		//* 조건식: 연산결과가 true / false 인 식
		
		int num = 30;
		//num이 30보다 크면 (초과) "num은 30보다 큰 수이다."
		//아니면 "num은 30 이하의 수이다." 출력
		
		String result = num > 30 ?  "num은 30보다 큰 수이다." :  "num은 30 이하의 수이다.";
		
		System.out.println(result);
	
		//------------------------
		
		// 입력받은 정수가 음수인지 양수인지 구분
		// 단, 0은 양수로 처리
		
		// Scanner 생성
		
		// ex) 
		// 정수 입력: 4
		// 양수입니다.
		
		//-----------------------
		
		// 정수 입력: -5
		// 음수 입니다.
		
		Scanner sc = new Scanner (System.in);
		System.out.print("정수 입력: ");
		int input = sc.nextInt();
		
		String result2 = input >= 0? "양수 입니다.":"음수 입니다.";
			
		System.out.println(result2);
	}

}