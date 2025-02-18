package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {

	public void practice1() {
		/*
		 * 길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후 짝수
		 * 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
		 * 
		 * [실행 화면] 1 2 3 4 5 6 7 8 9 짝수 번째 인덱스 합 : 25
		 */

		int[] arr = new int[9];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;

			if (arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));

		System.out.println("짝수 번째 인덱스의 합 :" + sum);

	}

	public void practice2() {

		/*
		 * 길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후 홀수
		 * 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
		 * 
		 * [실행 화면] 9 8 7 6 5 4 3 2 1 홀수 번째 인덱스 합 : 20
		 */

		int[] arr = new int[9];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 9 - i;
			if (arr[i] % 2 == 1) {
				sum += arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("홀수 번째 인덱스의 합 : " + sum);

	}

	public void practice3() {

		/*
		 * 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		 * 
		 * [실행 화면] 양의 정수 : 5 1 2 3 4 5
		 */

		System.out.print("양의 정수 : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		int[] arr = new int[input];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		System.out.println(Arrays.toString(arr));
	}

	public void practice4() { 
		/*
		 * 정수 5개를 입력 받아 배열을 초기화 하고 검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력. 배열에 같은 수가
		 * 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
		 */

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		boolean flag = true;

		for (int i = 0; i < arr.length; i++) {

			System.out.print("입력" + i + ":");
			int input = sc.nextInt();
			
			arr[i] = input;

		}
		
		System.out.print("검색할 값 : ");
		int num = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {

				System.out.println("인덱스 : " + i);
				flag = false;
			}
		}

		if (flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}

	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		System.out.print("문자열 : ");
		String input = sc.next();

		char[] arr = new char[input.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
		}
		System.out.println(Arrays.toString(arr));
		System.out.print("문자: ");
		char ch = sc.next().charAt(0);

		int count = 0; // 같은 글자 개수를 세기 위한 변수

	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int input = sc.nextInt();
		int sum = 0;

		int[] arr = new int[input];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("배열" + i + "번째 인덱스에 넣을 값 :");
			int num1 = sc.nextInt();

			arr[i] = num1;
			sum += arr[i];
		}

		System.out.println(Arrays.toString(arr));
		System.out.println("총합");
	}

	public void practice5_1() { 
		/*
		 * 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지 개수와 몇 번째 인덱스에 위치하는지 인덱스를
		 * 출력하세요.
		 * 
		 * [실행 화면] 문자열 : application 문자 : i application에 i가 존재하는 위치(인덱스) : 4 8 i 개수 : 2
		 */

		/*1. 사용자에게 문자열 입력받기
		*2. 사용자가 입력한 문자열을 하나하나 char 배열에 넣기
		*-> 사용자가 입력한 문자열의 길이만큼의 char 배열을 할당
		*3. 문자 입력받기(검색할 문자)
		*4. 검색할 문자가 문자열에 몇개가 존재하는지, 어느 인덱스에 있는지 파악
		*/
		
		
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 :");
		String input = sc.next();

		char[] arr = new char[input.length()];

		boolean flag = true;
		
		String str = "";

		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
		}
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {
				str += i + " ";
				//System.out.println("application에 i가 존재하는 위치(인덱스) : " + i);
				count++;
				flag = false;
			}

		}
		System.out.println("application에 i가 존재하는 위치(인덱스) : " + str);
		System.out.println(count + "개 있음");
	}

	public void practice6_1() {
		/*
		 * 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의
		 * 인덱스에 값을 초기화 하세요. 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		 * 
		 * [실행 화면] 정수 : 5 배열 0번째 인덱스에 넣을 값 : 4 배열 1번째 인덱스에 넣을 값 : -4 배열 2번째 인덱스에 넣을 값 :
		 * 3 배열 3번째 인덱스에 넣을 값 : -3 배열 4번째 인덱스에 넣을 값 : 2 4 -4 3 -3 2 총 합 : 2
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 :");
		int num = sc.nextInt();
		int sum = 0;

		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열" + i + "번째 인덱스에 넣을 값 :");
			int input = sc.nextInt();
			arr[i] = input;
			sum += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("총합 :" + sum);
	}

	public void practice7() { 
		/*
		 * 주민등록번호 번호를 입력 받아 성별을 나타내는 숫자 이후부터 *로 가리고 출력하세요.
		 * 
		 * [실행 화면] 주민등록번호(-포함) : 123456-1234567 123456-1******
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) :");
		int input = sc.nextInt();

		int[] arr = new int[input];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = input;
			if (arr[9] > 0) {
				System.out.println("*");
			}
		}

	}

	public void practice8() {
		/*
		 * 3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고, 중간 이후부터 끝까지는 1씩 감소하여
		 * 내림차순으로 값을 넣어 출력하세요. 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고 다시 정수를 받도록
		 * 하세요.
		 * 
		 * [실행 화면] 정수 : 4 다시 입력하세요. 정수 : -6 다시 입력하세요. 정수 : 5 1, 2, 3, 2, 1
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 :");
		int input = sc.nextInt();

		int[] arr = new int[input];

		for (int i = 0; i < arr.length; i++) {

			if (input < 3 && input % 3 != 0) {
				System.out.println("다시 입력하세요");

			} else if (input > 3 && input % 2 == 1) {
				Arrays.sort(arr);

			} else {
				Arrays.sort(arr);
			}
		}

	}

	
	public void practice8_1() {
		/*
		 * 3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고, 중간 이후부터 끝까지는 1씩 감소하여
		 * 내림차순으로 값을 넣어 출력하세요. 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고 다시 정수를 받도록
		 * 하세요.
		 * 
		 * [실행 화면] 정수 : 4 다시 입력하세요. 정수 : -6 다시 입력하세요. 정수 : 5 1, 2, 3, 2, 1
		 */

	}

	public void practice9() {
		/*
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고, 1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
		 * 
		 * [실행 화면] 발생한 난수 : 9 7 6 2 5 10 7 2 9 6
		 */

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {

			int random = (int) (Math.random() * 10 + 1);
			arr[i] = random;

		}
		System.out.println("발생한 난수 " + Arrays.toString(arr));
	}

	public void practice10() { 
		/*
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고, 1~10 사이의 난수를 발생시켜 배열에 초기화 후 배열 전체 값과 그 값
		 * 중에서 최대값과 최소값을 출력하세요.
		 * 
		 * [실행 화면] 발생한 난수 : 5 3 2 7 4 8 6 10 9 10 최대값 : 10 최소값 : 2
		 */

		int[] arr = new int[10];
		int max = 0;
		int min = 0;

		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * 10 + 1);
			arr[i] = random;

			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("발생한 난수 " + Arrays.toString(arr));
		System.out.println("최고점 :" + max);
		System.out.println("최저점 :" + min);

	}

	public void practice11() {
		/*
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고 1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후
		 * 출력하세요.
		 * 
		 * [실행 화면] 4 1 3 6 9 5 8 10 7 2
		 */

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * 10 + 1);

			arr[i] = random;

			for (int x = 0; x < i; x++) {
				if (random == arr[x]) {
					i--;
					break;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}

	public void practice12() { 
		/*
		 * 로또 번호 자동 생성기 프로그램을 만들기. (중복 값 없이 오름차순으로 정렬하여 출력하세요.)
		 * 
		 * [실행 화면] 3 4 15 17 28 40
		 */

		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * 45 + 1);
			arr[i] = random;

			for (int x = 0; x < i; x++) {
				if (i == x) {
					i--;
					break;

				}
				Arrays.sort(arr);

				System.out.println(Arrays.toString(arr));
			}
		}
	}

	public void practice13() {
		
		/*1. 사용자에게 문자열 입력받기
		 * 2. 해당 문자열의 문자들을 char[]에 담기
		 * 3. char 배열에서 중복값 존재할 경우 출력x
		 * */
		
		/*
		 * 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고 문자의 개수와 함께 출력하세요.
		 * 
		 * [실행 화면] 문자열 : application 문자열에 있는 문자 : a, p, l, i, c, t, o, n 문자 개수 : 8
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 :");
		String input = sc.nextLine();
		int count=0;

		char[] arr = new char[input.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
			
		}
		System.out.println("문자열에 있는 문자 : ");
		
		for(int i = 0; i <arr.length; i++) {
			
			boolean flag = true; //중복 체크용 flag 변수
			
			// 중복값이 있는지 검사하는 for 
			
			for(int j =0; j < i; j++) {
				if(arr[i] == arr[j]) {
					flag = false; //중복 발생했을 때
					break;
				}
			
			}
			if(flag) { //중복이 발생하지 않았을 경우
				//if문
				if( i == 0 ) {
					System.out.print(arr[i]);
				} else { //0번 인덱스가 아닌 글자
					System.out.print(", " +arr[i]);
				}
				count++;
			}
		}	
		System.out.println();
		System.out.println("문자 개수 :" + count);
	}
	public void practice14() {
		
		/*[실행 화면]
배열의 크기를 입력하세요 : 3
1번째 문자열 : 자바의 정석
2번째 문자열 : 알고리즘
3번째 문자열 : C프로그래밍
더 값을 입력하시겠습니까?(Y/N) : y
더 입력하고 싶은 개수 : 2
4번째 문자열 : 인간관계
5번째 문자열 : 자기계발
더 값을 입력하시겠습니까?(Y/N) : y
더 입력하고 싶은 개수 : 1
6번째 문자열 : 영단어600
더 값을 입력하시겠습니까?(Y/N) : n
[자바의 정석, 알고리즘, C프로그래밍, 인간관계, 자기계발, 영단어600]*/

		 //1. 첫 배열 크기 지정
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요. : "); 
		int size = sc.nextInt();
		sc.nextLine(); //입력 버퍼에 남은 개행문자 제거
		
		String[] arr = new String[size];
		
		 //2.첫 배열에 저장할 문자열 입력받기
		for(int i =0; i <arr.length; i++) {
			System.out.print((i+1) + "번째 문자열 : ");
			arr[i] = sc.nextLine();
		}
		
		 //3. 반복이 시작되는 구간부터 while 작성하여 내부에 종료조건 만들어서
		 //break;
		 
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(y/n) : ");
			char ch = sc.next().charAt(0);
	
		//4. 값을 더 입력할 경우
		if(ch == 'y' || ch == 'Y') {
			
			//5. 더 입력받을 개수 입력받기
			System.out.print("더 입력하고 싶은 개수 :");
			int addSize = sc.nextInt();
			sc.nextLine(); //입력버퍼에 남은 개행문자 제거
			
			//6. 새로 값을 입력받을 배열 생성 > 기존 배열 크기 + 추가 입력 개수
			String[] newArr = new String[arr.length + addSize];
			
			//7. 배열 복사 + 새로운 문자열 입력받기
			for(int i =0; i <newArr.length; i++) {
				
				if(i < arr.length) { // 인덱스의 크기가 기존 배열보다 작을 경우 (깊은 복사)
					newArr[i] = arr[i]; // 기존 배열 요소값 복사
				} else  {// 인덱스의 크기가 기존 배열보다 클 경우 (새로운 값 입력받기)
					System.out.print((i+1) + "번째 문자열 :");
					newArr[i] = sc.nextLine();
				}
		
			}
			
			//8. 기존 배열 공간을 참조하던 변수 arr에다가 새로운 배열 공간의 주소인 newArr 대입(얕은 복사)
			//더 입력? Y를 눌렀을 때 
			//위 코드를 반복할 때 기존 배열인 arr의 길이를 기준으로 
			//새 배열(newArr)의 크기를 할당하기 때문에.
			arr =newArr; 
	
		} else if (ch == 'n'|| ch == 'N') {
			break; // 값을 더 입력하지 않을 경우
		} else {	// 잘못 입력한 경우
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		
		}
		
}
		//10. 배열값 모두 출력
		System.out.println(Arrays.toString(arr));
	}

}