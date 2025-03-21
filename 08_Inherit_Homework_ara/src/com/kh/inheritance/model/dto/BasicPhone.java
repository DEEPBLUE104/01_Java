package com.kh.inheritance.model.dto;

public class BasicPhone extends Phone{

	private boolean hasPhysicalKeyboard = false;
	
	public BasicPhone() {}

	public BasicPhone(String brand, String model, int year, 
			int price, boolean hasPhysicalKeyboard) {
		super(brand, model, year, price);
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}
	
	public void checkKeyboard() {
		return;
	}

	public boolean isHasPhysicalKeyboard() {
		return hasPhysicalKeyboard;
	}

	public void setHasPhysicalKeyboard(boolean hasPhysicalKeyboard) {
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}

	
}
