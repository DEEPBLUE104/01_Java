package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;
import edu.kh.oop.cls.model.vo.User;

//ClsService와 Student/TestVo는 패키지가 다름
public class ClsService /*extends Student*/{
	//부모로 Student 클래스를 상속받음
	//Student(부모) - > ClsService(자식)
	
	
	public void ex1() {
		//클래스 접근제한자 확인하기
		Student std = new Student();
		//public class인 Student는 import 가능(어디서든 접근 가능)
		
	//TestVo test = new TestVo();
	//(default) class인 TestVo는 import 불가능(다른패키지라 불가능)
	
	// 필드 접근제한자 확인하기
	System.out.println( std.v1 );	
	
	//전체에서 직접 접근 가능한 public인 v1만 에러 발생 x
	//System.out.println( std.v2 );	
	//System.out.println( std.v3 );	
	//System.out.println( std.v4 );	
	
	//상속 관계에서 직접 접근 가능 범위 테스트
	//* 상속받으면 부모의 것도 마치 내것처럼 인식, 사용*
	//System.out.println( v1 );
	//System.out.println( v2 );
	//Student 클래스를 ClsService가 상속받았으므로
	//Student의 protected 변수인 v2는 직접접근 가능
	
	//System.out.println( v3 ); //(default)는 다른 패키지 x
	//System.out.println( v4 ); // 해당클래스 내부가 아닌 다른 클래스 x
	
	}

	public void ex2() {
		//static 필드 확인 예제
		
		//학생 객체 2개 생성
		Student std1 = new Student();
		Student std2 = new Student();
		
		System.out.println( std1.schoolName );
		System.out.println( std2.schoolName );
	
		// schoolName에 노란줄이 뜨는 이유(경고) > 제대로 작성을 안해서
		
		//*** static 이 붙은 변수(필드)는 '클래스명. 변수명'으로 사용해야함.
		System.out.println(Student.schoolName);
	
		Student.schoolName = "KH정보교육원";
	
		System.out.println( std1.schoolName );
		System.out.println( std2.schoolName );
		System.out.println(Student.schoolName);
	
	}

	public void ex3() {
		//생성자 확인 테스트
		
		// User 기본 생성자를 이용해서 u1 객체 생성
		User u1 = new User();
		
		System.out.println(u1.getUserId());
		System.out.println(u1.getUserPw());
		System.out.println(u1.getUserName());
		System.out.println(u1.getUserAge());
		System.out.println(u1.getUserGender());
	
User u2 = new User();
		
		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
	
		System.out.println("===================");
	
		//해결방법 1: setter를 이용해서 새로운 값 재대입
		u2.setUserId("asd1234");
		u2.setUserPw("1s2d3r");
		u2.setUserName("김영희");
		u2.setUserAge(25);
		u2.setUserGender('여');
	
		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
		System.out.println(u2.getUserId());

	//해결방법 2: 매개변수 생성자를 이용해서
	//객체가 생성될 때 부터 다른 값으로 필드를 초기화
	
	User u3 = new User("test3","password1234");
	//매개변수 생성자
	System.out.println(u3.getUserId());
	System.out.println(u3.getUserPw());
	System.out.println(u3.getUserName());
	System.out.println(u3.getUserAge());
	System.out.println(u3.getUserGender());
	System.out.println(u3.getUserId());

	
	}

	public void ex4() {
		//매개변수 생성자 예제
		User u1 = new User(); //기본생성자
		User u2 = new User("user02","pass02"); //매개변수 2개 생성자
		User u3 = new User("user03","pass03",
				"김길동",30,'남'); //필드 전부 초기화
		
		//매개변수 5개짜리 생성자(전부 초기화)
		
	System.out.printf("u1 : %s / %s / %s / %d / %c\n", 
			u1.getGetUserId(), u1.getUserPw(), u1.getUserName(),
			u1.getUserAge(), u1.getUserGender() );	
	
		
	}
}