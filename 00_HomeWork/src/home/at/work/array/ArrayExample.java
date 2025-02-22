package home.at.work.array;

import java.util.Arrays;

public class ArrayExample {
	
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
}
