package home.at.work.array;

import java.util.Arrays;

public class ArrayExample {
	
	public void ex1() {
		
		int num;
		
		num = 10;
		
		int[] arr;
		
		arr = new int[3];
		
		System.out.println("arr : " + arr);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		arr[0]=10;
		arr[1]=30;
		arr[2]=50;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println(Arrays.toString(arr));
	}

	public void ex2() {
		int [] arr = new int[4];
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		
		System.out.println("배열의 길이 :"+arr.length);
	
	for(int i =0; i < arr.length; i++) {
		System.out.printf("arr[%d]에 저장된 값 : %d\n", i , arr[i]);
	}
	
	int [] arr2 = {1,2,3,4,5};
	
	System.out.println(Arrays.toString(arr2));
	
	}
}
