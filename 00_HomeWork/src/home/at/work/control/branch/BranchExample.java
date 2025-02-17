package home.at.work.control.branch;

import java.util.Scanner;

public class BranchExample {

	public void ex1() {
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		
			if( i == 5) {
			break;

			}
	}
}

	public void ex2() {
		
		Scanner sc = new Scanner(System.in);
		String str = " ";
		
		while(true) {
			System.out.print("문자열 입력(exit@ 입력시 종료) :");
			String input = sc.nextLine();
			
			if(input.equals("exit@")) {
				break;
			}
			
			str += input + "\n";
		}
	
		System.out.println("==========");
		System.out.println(str);
	}

	public void ex3() {
		
		for(int i = 1; i <=10; i++) {
			if (i % 3 == 0) {
				continue;
			}
		System.out.println(i +" ");
		}
	}
	
	public void ex4() {
	
		
		for(int i = 1; i <=100; i++) {
			
			if(i % 5 == 0) {
				continue;
		} else if (i >=40) {
			break;
		}
		System.out.println(i + " ");
	}
}

	public void ex5() {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[가위 바위 보 게임]");
		System.out.print("몇 판? :");
		int round = sc.nextInt();
	
		int win =0;
		int draw =0;
		int lose =0;
		
		for(int i=1; i <= round; i++) {
			
			System.out.println("\n" + i + "번째 게임");
			System.out.println("가위/바위/보 중 하나 입력 :");
			String input = sc.next();
			
			int random = (int)(Math.random()*3 + 1);
		
			String com = null;
			
			switch(random) {
			case 1 : com = "가위"; break;
			case 2 : com = "바위"; break;
			case 3 : com = "보"; break;
			}
		
			System.out.printf("컴퓨터는 [%s]를 선택했습니다.");
		
			if(input.equals(com)) {
				System.out.println("비겼습니다.");
				draw++;
			} else {
				
				boolean win1 = input.equals("가위") && com.equals("보");
				boolean win2 = input.equals("바위") && com.equals("가위");
				boolean win3 = input.equals("보") && com.equals("바위");
		
				if(win1 || win2 || win3) {
					System.out.println("졌습니다.");
					lose++;
				}
			}
		
			System.out.printf("현재 기록 : %d승 %무 %패\n", win ,draw, lose);
		}
	}
}