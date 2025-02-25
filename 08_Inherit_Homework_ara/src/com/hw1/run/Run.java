package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {
	
	
		public static void main(String[] args) {
		Student sd1 = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과" );
		Student sd2 = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		Student sd3 = new Student("강개순", 23, 167.0, 45.0, 4, "정보시스템공학과");
		
		System.out.println("이름 :"+ sd1.getName() + " / 나이 :" + sd1.getAge() + " / 신장 :" + sd1.getHeight() + 
				" / 몸무게" + sd1.getWeight() + " / 학년 :" + sd1.getGrade() + " / 전공 : " + sd1.getMajor());
		
		System.out.println("이름 :"+ sd2.getName() + " / 나이 :" + sd2.getAge() + " / 신장 :" + sd2.getHeight() + 
				" / 몸무게" + sd2.getWeight() + " / 학년 :" + sd2.getGrade() + " / 전공 : " + sd2.getMajor());
		
		System.out.println("이름 :"+ sd3.getName() + " / 나이 :" + sd3.getAge() + " / 신장 :" + sd3.getHeight() + 
				" / 몸무게" + sd3.getWeight() + " / 학년 :" + sd3.getGrade() + " / 전공 : " + sd3.getMajor());

		
		System.out.println("====================================");
			
		Scanner sc = new Scanner(System.in);
		Employee[] empArr = new Employee[10];
		int index = 0;
	
		while(true) { 
			int count = 0;
			if (index >= empArr.length) {
				System.out.println("더이상 직원을 추가할 수 없습니다.");
				break;
			}
			for (int i = 0; i < empArr.length; i++) {
					System.out.print("이름 :");
					String name = sc.next();
				
					System.out.print("나이 :");
					int age = sc.nextInt();
					
					System.out.print("신장 :");
					double height = sc.nextDouble();
					
					System.out.print("몸무계 : ");
					double weight = sc.nextDouble();
					
					System.out.print("급여 :");
					int salary = sc.nextInt();
					
					System.out.print("부서 :");
					String dept = sc.next();
					
					empArr[index] = new Employee(name, age, height, weight, salary,dept);
					index++;
					
					System.out.print("계속 추가하시겠습니까? (Y/N) :");
					String answer = sc.next();
					
					if (answer.equals("Y")) {
						count++;
					}
					
					if (answer.equals("N")) {
						break;
					}
				
			} 
			System.out.printf("\n");
			for (int i =0; i < index; i++) {
				empArr[i].information();
			}
		}
		
		}
		
	
	}
