package home.at.work.array;

import java.util.Arrays;
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

	//인덱스 검색		
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
	
	//문자열 검색
	public void ex8() {
		System.out.print("문자열 입력 :");
		String input = sc.nextLine();
		
		char[] arr = new char[input.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
		}
		System.out.println(Arrays.toString(arr));
		System.out.print("검색할 문자 입력 :");
		char ch = sc.next().charAt(0);
		int count = 0;
		
		for(int i =0; i< arr.length;i++) {
			if(arr[i] == ch) {
				count++;
			}
		}
		if (count > 0 ) {
			System.out.println(count + "개 있음");
		} else { 
			System.out.println("존재하지 않음.");
		}
	}

	//얕은 복사
	public void ex9() {
		int[] arr = {1,2,3,4,5};
		int[] copyArr = arr; // 주소만 복사
		
		System.out.println("변경 전");
		System.out.println("arr 주소 : " + arr);
		System.out.println("copyArr 주소 : " + copyArr);
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		
		// 얕은 복사한 배열의 값을 변경
		copyArr[2] = 999;
		
		System.out.println("변경 후");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		
		
	}

	//깊은 복사
	public void ex10() {
		
		int[] arr = {1,2,3,4,5};
		int[] copyArr1 = new int[arr.length]; // 5칸짜리 배열 생성
		
		for(int i = 0; i < arr.length; i++) {
			copyArr1[i] = arr[i];
		}
		
		System.out.println("arr 주소 : " + arr);
		System.out.println("copyArr1 주소 : " + copyArr1);
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr1 : " + Arrays.toString(copyArr1));
		
		// 2. System.arraycopy(원본배열, 원복복사 시작 인덱스, 
		// 					복사배열, 복사배열의 삽입 시작 인덱스, 복사길이); 
		int[] copyArr2 = new int[arr.length];
		System.arraycopy(arr, 0, copyArr2, 0, arr.length);
		
		System.out.println("copyArr2 : " + Arrays.toString(copyArr2));
		
		// 3. 복사할 배열 참조변수 = Arrays.copyOf(원본배열, 복사할 길이);
		int[] copyArr3 = Arrays.copyOf(arr, arr.length);
		System.out.println("copyArr3 : " + Arrays.toString(copyArr3));
		
		// 값 변경 후 확인
		copyArr1[4] = 0;
		copyArr2[4] = 999;
		copyArr3[4] = 5000;
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr1 : " + Arrays.toString(copyArr1));
		System.out.println("copyArr2 : " + Arrays.toString(copyArr2));
		System.out.println("copyArr3 : " + Arrays.toString(copyArr3));
}

	//로또 번호 생성기
	public void ex11() {
		int[] lotto = new int[6];
		
		for(int i =0; i <lotto.length; i++) {
			int random = (int)(Math.random() * 45 + 1);
			lotto[i] = random;
			
			for(int x =0; x < i; x++) {
				if(random == lotto[x]) {
					i--;
					break;
				}
			}
		} 
		Arrays.sort(lotto);
		System.out.println( Arrays.toString(lotto) );
	}


	// > 실습문제
	
	public void ex12() {
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i = 0; i <arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		
			if ( i % 2 ==0) {
				sum += arr[i];
			}
		}
		System.out.println("\n짝수 번째 인덱스 합 : " + sum);
	}

	public void ex13() {
		int [] arr = new int[9];
		int sum = 0;
		
		for(int i =0; i < arr.length; i++) {
			arr[i] = arr.length - i;
			System.out.print(arr[i] + " ");
			
			if(i % 2 == 1) {
				sum += arr[i];
			}
		}
		System.out.println("\n홀수 번째 인덱스의 합 :" + sum);
	}

	public void ex14() {
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("입력 %d :" , i);
			arr[i] = sc.nextInt();
		}
		System.out.print("검색할 값 :");
		int search = sc.nextInt();

		boolean flag = true;
	
		for(int i =0; i < arr.length; i++) {
			if(arr[i] == search) {
				System.out.println("인덱스 :" + i);
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("일치하는 값이 존재하지 않는다.");
		}
	}

	// array >sru> practice > service > PracticeService 
	
	// 2차원 배열
	
	public void ex20() {
		int[][] arr;
		
		arr = new int[2][3];
	
		int num = 10;
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		
		for(int row = 0; row < arr.length; row++) {
			for (int col =0; col < arr[row].length; col++) {
				arr[row][col] = num;
				num += 10;
			}

			int[][] arr2 = {{10,20,30} , {40,50,60}};
			
			// Arrays.toString(배열명) : 참조하고있는 1차원 배열의 값을 문자열로 반환
			System.out.println(Arrays.toString(arr));
		
			// Arrays.deepToString(배열명) 
			// : 참조하고 있는 배열의 실제 데이터가 나오는 부분까지 파고 들어가서
			//   모든 값을 문자열로 반환
			System.out.println(Arrays.deepToString(arr));
			System.out.println(Arrays.deepToString(arr2));
			
			
		}
	
		
	
	}

	public void ex21() {
		
		int[][] arr = {{1,2,3} , {4,5,6} , {7,8,9}};
		
		for(int row =0; row <arr.length; row++) {
		
				int sum = 0;
			
			for(int col = 0; col < arr[row].length; col++) {
					
				sum += arr[row][col];
			}
			System.out.printf("%d행의 합 : %d\n", row, sum);
		}
		System.out.println("==========================");
		
		for(int col = 0; col < arr[0].length; col++) {
			
			int sum = 0;
			
			for(int row = 0; row < arr.length; row++) {
				sum += arr[row][col];
			}
		System.out.printf("%d열의 합 : %d\n",col,sum);
		}
	
	}

	public void ex22() {
		// 가변 배열
				// - 2차원 배열 생성 시 마지막 배열 차수(열)를 지정하지 않고
				//   나중에 서로 크기가 다른 1차원 배열을 생성하여 참조하는 배열
				
				char[][] arr = new char[4][];
				// char 2차원 배열 생성 시 행 부분만 생성
				
				arr[0] = new char[3]; // 0행에 3열짜리 1차원 배열을 생성하여 주소값 저장
				arr[1] = new char[4]; // 1행에 4열짜리 1차원 배열을 생성하여 주소값 저장
				arr[2] = new char[5]; // 2행에 5열짜리 1차원 배열을 생성하여 주소값 저장 
				arr[3] = new char[2]; // 3행에 2열짜리 1차원 배열을 생성하여 주소값 저장
				
				char ch = 'a';
				
				for(int row = 0; row < arr.length; row++) { // 4
					
					for(int col = 0; col < arr[row].length; col++) {
						
						arr[row][col] = ch++;
						
					}
				}
				
				System.out.println(Arrays.deepToString(arr));
				
				
			}
}