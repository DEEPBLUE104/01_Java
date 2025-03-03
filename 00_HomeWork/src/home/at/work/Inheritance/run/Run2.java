package home.at.work.Inheritance.run;

import java.util.Scanner;

import home.at.work.Inheritance.model.dto2.Employee;
import home.at.work.Inheritance.model.dto2.Student;

public class Run2 {


	public static void main(String[] args) {
		
		Student[] students = new Student[3];
		
		students[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		students[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		students[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		for(Student std : students) {
			System.out.println( std.information() );
		}
		
		System.out.println("-------------------------------------------");
		
		Employee [] emps = new Employee[10];
		
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("이름");
			String name = sc.next();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.print("신장 : ");
			double height = sc.nextDouble();
			
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			
			System.out.print("부서 : ");
			String dept = sc.next();
		
			emps [count] = new Employee(name, age, height, weight, salary, dept);
			count++;
			
			if(emps.length == count) {
				break;
			}
			
			System.out.print("계속 추가하시겠습니까? y/n");
			String str = sc.next().toUpperCase();
			
			if(str.equals("N")) break;
		
		}
		
		for(Employee emp :emps) {
			if(emp == null) break;
			System.out.println(emp.information());
		}
		
		}

	}

