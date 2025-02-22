package home.at.work.array;

import java.util.Scanner;

public class ClassExample {


	Scanner sc = new Scanner(System.in);

	
	public void ex1() {
		

		double [] height = new double [5];
	
		for(int i = 0; i <height.length; i++) {
			System.out.print((i + 1) + "번 키 입력 :");
			height [i] = sc.nextDouble();
		
		}
	System.out.println();
	double sum = 0;
	
	for(int i = 0; i< height.length; i++) {
		sum += height[i];
	}
	System.out.printf("\n평균 : %.2f cm", sum / height.length );
	}
	
	public void ex2() {
		
		System.out.print("입력 받을 인원 수 :");
		int input = sc.nextInt();
		
		int [] arr = new int[input];
		int sum = 0;
		int avg = 0;
		
		for(int i =0; i <arr.length; i++) {
			System.out.print((i+1) + "번 키 입력 :");
			arr[i] = sc.nextInt();	
			sum += arr[i];
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i =0; i <arr.length; i++) {
			
			if(arr[i] > max) {
				max = arr[i];
				
			}
			
			if(arr[i] < min) {
				min = arr[i];
			}
		
		}
		System.out.println("합계 :" +sum);
		System.out.printf("평균 : %.2f\n", (double) sum / arr.length );
		System.out.println("최고점 :" +max);
		System.out.println("최저점 :" +min);
	}

	public void ex3() {
	
		
		
	}
}
