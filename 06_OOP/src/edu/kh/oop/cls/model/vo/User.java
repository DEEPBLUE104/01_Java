package edu.kh.oop.cls.model.vo;

public class User {

	//속성(필드) 
	//아이디, 비밀번호, 이름, 나이, 성별(추상화 진행)
	//데이터 직접접근 불가 원칙 -> 필드는 기본적으로 모두 private(캡슐화 진행)
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private char userGender;
	private String getUserId;
	
	
		//기본 생성자(-> 매개변수 없는 생성자)
		public User() {
			//기능
		System.out.println("기본생성자로 User 객체 생성");
				
		//필드 초기화
		userId = "user01";
		userPw = "pass01";		
		userName = "홍길동";
		userAge = 20;
		userGender = '남';		
		
		}
	
		//매개변수 생성자
		//변수 : 매개변수, Overloading(오버로딩), this 

		//**매개변수 : 생성자나 메서드 호출 시 () 안에 작성되어
		// 전달되어지는 값을 저장하고 있는 변수
		// > 전달받은 값을 저장하고 있는 매개체 역할의 변수
		public User(String userId, String userPw) {
			System.out.println("매개변수 생성자를 이용하여 User 객체 생성");
		
		//필드 초기화
		 this.userId = userId;
		 this.userPw = userPw;
		 //필드 = 매개변수
		 
		 //this 참조변수 
		 // - 객체가 자기 자신을 참조할 수 있도록 하는 변수
		 //왜 사용?
		 // > 필드명과 매개변수명이 같은 경우
		 // 이를 구분하기 위해서 사용한다.
		 
		}
		
	// 필드를 전부 초기화하는 목적의 매개변수 생성자
	public User( String userId, 
			String userPw, 
			String userName, 
			int userAge,
			char userGender) {
	
		//this()생성자
		//같은 클래스의 다른 생성자를 호출할 때 사용
		//생성자 내에서 반드시 첫번째 줄에 작성해야 한다
		//왜 사용하는가?
		//중복 코드 제거, 코드 길이 감소, 재사용성 증가.
		//(단점) 가독성이 좀 떨어지는 경우가 있다.
		this(userId, userPw);
		
		//this.userId = userId;
		//this.userPw = userPw;
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
		
	}
		
		
	//기능(생성자+메서드)

		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getUserPw() {
			return userPw;
		}

		public void setUserPw(String userPw) {
			this.userPw = userPw;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public int getUserAge() {
			return userAge;
		}

		public void setUserAge(int userAge) {
			this.userAge = userAge;
		}

		public char getUserGender() {
			return userGender;
		}

		public void setUserGender(char userGender) {
			this.userGender = userGender;
		}

		public String getGetUserId() {
			return getUserId;
		}

		public void setGetUserId(String getUserId) {
			this.getUserId = getUserId;
		}
	
	
	/*
	 * 생성자(constructor)
	 * 
	 * - new 연산자를 통해서 객체를 생성할 때
	 * 생성된 객체의 필드값 초기화 + 지정된 기능을 수행하는 역할
	 * 
	 * - 생성자 작성 규칙
	 * 1.) 생성자의 이름은 반드시 클래스명과 같아야 한다.
	 * 2.) 반환형이 존재하지 않는다
	 * 
	 * - 생성자 종류
	 * 1) 기본 생성자
	 * 2) 매개변수 생성자
	 * 
	 * 
	 * */
}
