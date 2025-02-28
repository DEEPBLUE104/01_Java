package com.hw2.model.dto;

public class Monkey extends Animal {

	@Override
	protected String name() {
		return "원숭이";
	}

	@Override
	public void sound() {
		System.out.println(name() + "가 우끼끼 소리를 냅니다.");
	}

}
