package edu.kh.oop.method.model.run;

import edu.kh.oop.method.model.service.MethodExample;

public class MethodRun {

	public static void main(String[] args) {

		MethodExample methodEx = new MethodExample();
		methodEx.method1();

	
	//method2() 메서드 호출 (마지막) >stack 후입선출에 따라 결론 도출
	//method1() 메서드 실행 (두 번째)	
	//main 메서드 실행 (첫 번째)
	}

}
