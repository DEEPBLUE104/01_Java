package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){ 
		
	/*사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
단, 입력한 수는 1보다 크거나 같아야 합니다.
만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.

ex.
1이상의 숫자를 입력하세요 : 4 1이상의 숫자를 입력하세요 : 0
1 2 3 4 1이상의 숫자를 입력하세요 :
*/	
		
		//1. 내가 입력한 값(input)이 조건에 맞는지 파악하기
		// 조건문을 이용해야 한다. > IF
		
		System.out.print("1이상의 숫자를 입력하세요 :");
		int input = sc.nextInt();
		
		
		if(input >= 1) { 
			
			// 1 부터 input까지 1씩 증가 반복 출력
			for(int i =1; i <= input; i ++) {
				System.out.println(i + " ");
		} 
		}else { //조건
			System.out.println("1이상의 숫자를 입력하세요");
			} 
	
}

	public void practice2(){

		
		/*사용자로부터 한 개의 값을 입력 받아 1부터 
		 * 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		단, 입력한 수는 1보다 크거나 같아야 합니다.

		ex.
		1이상의 숫자를 입력하세요 : 4 1이상의 숫자를 입력하세요 : 0
		4 3 2 1 1 이상의 숫자를 입력해주세요.*/ 
 		
		System.out.print("1이상의 숫자를 입력하세요 :");
		int input = sc.nextInt();
		
		if(input >= 1) {//조건 o
			//input = 5 > 5, 4, 3, 2, 1
			// 시작 5부터 끝 1, 1씩 감소하면서..
			
			for (int i = input; i >= 1; i--) {
				System.out.println(i+ " ");
			}
			System.out.println();
		} else { //조건
			System.out.print("1이상의 숫자를 입력하세요.");
		}
		
		

}

	public void practice3(){
		
    /*	1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.

		ex.
		정수를 하나 입력하세요 : 8
		1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36*/
	
	System.out.println("정수를 하나 입력하세요 :");
	int input = sc.nextInt();
	int sum = 0;

	
	for(int i = 1; i <= input; i--) {
		sum += i;
		
		// 마지막 숫자인 경우 "+" 출력하지 않음
		if(i==input) {
			System.out.println(i + "=" + sum); 
	} else { // 이전 턴
		System.out.println(i + "+");
	}
}
	}
	
	public void practice4(){
		/*사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
	만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.

	ex.
	첫 번째 숫자 : 8 첫 번째 숫자 : 4 첫 번째 숫자 : 9
	두 번째 숫자 : 4 두 번째 숫자 : 8 두 번째 숫자 : 0
	4 5 6 7 8 4 5 6 7 8 1 이상의 숫자를 입력해주세요.
*/
		
		System.out.print("첫 번째 숫자 :");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 :");
		int num2 = sc.nextInt();
		String result;
		
		
	if (num1 <1 || num2 < 0){ // 1미만의 숫자가 입력된 경우
		System.out.println("1 이상의 숫자만 입력");
		
	} else { //정상인 경우
		
		// 일단 start에 첫 번쩨 숫자, end 두 번째 숫자 대입
		
		int start = num1;
		int end = num2;
		
		//만약 첫 번째 숫자가 크다면 start, end의 값 바꾸기
		if(num1 > num2) {
			start = num2;
			end = num1;
		}
	
		for (int i = start; i <= end; i++) {
			System.out.println(i + "");
		}
		}
	
	}

	public void practice5(){

		
	/*사용자로부터 입력 받은 숫자의 단을 출력하세요.

	ex.
	숫자 : 4
	===== 4단 =====
	4 * 1 = 4
	4 * 2 = 8
	4 * 3 = 12
	4 * 4 = 16
	4 * 5 = 20
	4 * 6 = 24
	4 * 7 = 28
	4 * 8 = 32
	4 * 9 = 36*/	
		
		System.out.println("숫자 :");
		int dan = sc.nextInt();
		
		System.out.println("======="+dan+"=======");
		for(int i =1; i <= 9; i ++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan * i);
		}
		
	}
	
	 public void practice6() {
	   
		 /*사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
			단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요.

			숫자 : 4 숫자 : 10
			===== 4단 ===== 2~9 사이 숫자만 입력해주세요.
			===== 5단 =====
			===== 6단 =====
			===== 7단 =====
			===== 8단 =====
			===== 9단 =====
			(해당 단의 내용들은 길이 상 생략)
		*/

		 
		 System.out.print("숫자: ");
	        int input = sc.nextInt();

	        if (input < 2 || input > 9) {
	            System.out.println("2~9 사이 숫자만 입력해주세요.");
	        } else {
	            for (int dan = input; dan <= 9; dan++) {
	                System.out.println("===== " + dan + "단 =====");
	                for (int i = 1; i <= 9; i++) {
	                    System.out.printf("%d * %d = %d\n", dan, i, dan * i);
	                }
	                System.out.println();
	            }
	        }
	    }


	public void practice7() {
		/*정수 입력 : 4
*
**
***
****

*- 행 (row)은 입력한 input 만큼
*-열(col)은 현재형(row)만큼 반복
*
*
**/

System.out.println("정수 입력 :");
int input = sc.nextInt();

for(int row = 1; row <= input; row++) { //1~4까지 4번 반복
	
	for(int col =1; col <= row; col++) {
		
		System.out.println("*");
	}
	System.out.println();  //한 행의 모든 열 출력이 끝나면 줄 바꿈
}
		
	}
	
}