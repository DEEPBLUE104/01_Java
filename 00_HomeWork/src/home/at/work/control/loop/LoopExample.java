package home.at.work.control.loop;

import java.util.Scanner;

public class LoopExample {

	Scanner sc = new Scanner(System.in);

	public void lp01() {
		for(int i =1; i <=10; i++) {
			System.out.println(i);
		}
	}

	public void lp02() {
		
		for(int i = 'A'; i <= 'Z'; i++) {
			System.out.print((char)i);
		}
		System.out.println("\n====================");

		for(char i = 'A'; i <= 'Z'; i++) {
			System.out.println(i);
		} // 두번째 조건식에 char 해도 변환 x 앞에 것만!

}
	
	public void lp03() {
		System.out.print("번호 입력 :");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++ ) {
			System.out.println(i);
		}
	}
	
	public void lp04() {
		
		int sum = 0; //합계 저장용 변수
		
		for (int i =1; i <= 5; i++) {
			System.out.println("입력"+ i + ":");
			int input =sc.nextInt();
			sum += input;
		}
		System.out.println("합계" + sum);
	}

	public void lp05() {
		
		System.out.print("괄호를 표시할 배수 :");
		int num = sc.nextInt();
		
		for(int i =1; i <= 20; i++) {
			if ( i % num == 0) {
				System.out.println("("+ i + ")");
			
			} else {
				System.out.println(i + "");
			}
		}
	
	}

	public void lp06() {
		
		System.out.print("단 입력 :");
		int dan = sc.nextInt();
		
		if(dan >=2 && dan <=9) {
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan*i);
		}
		System.out.println();
	} else {
		System.out.println("잘못 입력하셨습니다.");
	}
}

	public void lp07() {
		
		int count = 0;
		int sum = 0;
		String result = "";
		
		System.out.print("배수 입력 :");
		int num = sc.nextInt();
		
		for(int i = 1; i <= 20; i++) {
			if(i % num == 0) {
				result += i + "";
				count++;
				sum += i;
			}
			
		}
	
		System.out.printf("%s: %d개\n", result, count);
		System.out.printf("%d의 배수 합계 : %d\n",num,sum);
	}

	public void lp08() {
		
		for(int dan=2; dan <=9; dan++) {		
			for(int i =1; i <= 9; i++) {
			System.out.printf("%d X %d = %2d   ", dan, i, dan * i);
			}
			
			System.out.println();
		}
			
		}
	
	public void lp09() {
		
		for(int dan =9; dan >= 2; dan--) {
			for(int  i =1; i <= 9; i++) {
				System.out.printf("%d X %d = %2d   ", dan, i, dan * i);
			}
			System.out.println();
		}
	}
	
	public void lp10() {
		
		System.out.print("1 이상의 숫자를 입력해주세요. :");
		int num = sc.nextInt();
		
		if (num >= 1 ) {
		for(int i = 1; i <= num; i++ ) {
			System.out.println(i + "");
		}
		
		} else { System.out.println("1이상의 숫자를 입력하세요");
		
	}
	
}

	public void lp11() {
		
		System.out.print("1 이상의 숫자를 입력하세요. : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i = num; i >= 1; i--) {
				System.out.print(  i +   " "  );
			}
		} else { System.out.println("1 이상의 숫자를 입력하세요.");
	}
}

	public void lp12() {
		System.out.print("정수를 하나 입력하세요 :");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
			
			if(i == num) {
			System.out.print(i +   "="   + sum);
			
		} else { 
			System.out.print(i +   "+");
		}
	}
}

	public void lp13() {
		System.out.print("첫 번째 숫자 :");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 :");
		int num2 = sc.nextInt();
		
		if (num1 <= 0 || num2 <= 0) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}	
	}
}