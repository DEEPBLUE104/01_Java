package com.hw2.model.dto;

public class Tiger extends Animal {

	@Override
	protected String name() {
		return "호랑이";
	}

	@Override
	public void sound() {
		System.out.println(name() + "가 어흥하며 포효합니다.");
	}

}
