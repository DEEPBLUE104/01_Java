package home.at.work.array;

import java.util.Scanner;

public class ArrayExample {
	
	Scanner sc = new Scanner(System.in); 
	
	
	public void ex1() {
		
		int [] arr = new int[9];
	
		int sum = 0;
		
		for (int i = 0; i <arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
			
			if(i % 2 == 0 ) {
				sum += arr[i];
			
			}
		}
	System.out.print("짝수 번쩨 인덱스의 합 :" + sum);
	}


	public void ex2() {
	
		double [] height = new double [5];
				
		for(int i = 0; i < height.length; i++) {
			System.out.print((i+1) + "번 키 입력 :");
			height[i] = sc.nextDouble();
			
		}
		System.out.println();
		double sum = 0;
		
		for(int i = 0; i <height.length; i++) {
			sum += height[i];
		}
		System.out.printf("\n평균 : %.2f cm ", sum/height.length );
	}

	public void ex3() {
		
		System.out.print("입력받을 인원 수 :");
		int input = sc.nextInt();
		
		int[] score = new int[input];
		int sum = 0;
		
		for(int i =0; i <score.length; i++) {
			score[i] = sc.nextInt();
			sum += score[i];
		}
	
		int max = score[0];
		int min = score[0];
		for(int i =0; i <score.length;i++) {
			if (score[i] > max) {
				max = score[i];
			}
			if (score[i] < min) {
				min = score[i];
			}
		
		}
		
		System.out.println("합계 :" + sum);
		System.out.printf("평균 : %2f\n", sum/score.length);
		System.out.println("최고점 :" + max);
		System.out.println("최저점 :" + min);
	}

	public void ex4() {
		String[] arr = {"김밥","서브웨이","햄버거","백반","국밥","짜장면"};
		
		System.out.println("오늘 점심 메뉴 :" + arr [(int)(Math.random()*6)]);
	}

	public void ex5() {
		
		int[] arr ={100,200,300,400,500,600,700,800,900,1000};
		
		System.out.print("정수 입력 :");
		int input = sc.nextInt();
		
		boolean flag = false;
		
		for(int i =0; i < arr.length; i++) {
			if(arr[i] == input) {
				System.out.println( i + "번째 인덱스에 존재");
				flag = true;
			}
		}
		if( ! flag ) {
			System.out.println("존재하지 않음");
		}
	}

	public void ex6() {
		
		String[] arr = {"사과", "딸기", "바나나", "키위", "멜론", "아보카도"};
		
		System.out.print("과일 입력 :");
		String fruit = sc.next();
		
		boolean flag = true;
		
		for(int i =0; i < arr.length; i++) {
			if(arr[i].equals(fruit) ) {
				System.out.println( i + "번 인덱스에 존재" );
					flag = false;
			}
		}
		if (flag) {
			System.out.println("존재하지 않음");
		}
}

	public void ex7() {
		String str = "가나다";
		String str2 = new String("가나다");
	
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str.toString());

		System.out.println(System.identityHashCode(str));
	
		String[] strArr = {"사과","바나나","딸기"};
	}
	

}

