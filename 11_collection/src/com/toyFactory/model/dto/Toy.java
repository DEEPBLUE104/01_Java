package com.toyFactory.model.dto;

import java.util.Objects;

public class Toy {

	private String toyname;
	private int toyage;
	private int price;
	private String color;
	private String madeDay;
	private String materials;
	
	public Toy() {	}
	
	public Toy(String toyname, int toyage, int price, String color, String madeDay, String materials) {
		super();
		this.toyname = toyname;
		this.toyage = toyage;
		this.price = price;
		this.color = color;
		this.madeDay = madeDay;
		this.materials = materials;
	}

	public String getToyname() {
		return toyname;
	}

	public void setToyname(String toyname) {
		this.toyname = toyname;
	}

	public int getToyage() {
		return toyage;
	}

	public void setToyage(int toyage) {
		this.toyage = toyage;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMadeDay() {
		return madeDay;
	}

	public void setMadeDay(String madeDay) {
		this.madeDay = madeDay;
	}
	

	public String getMaterials() {
		return materials;
	}

	public void setMaterials(String materials) {
		this.materials = materials;
	}

	@Override
	public String toString() {
		return String.format
		("이름 : %s / 가격 : %d / 색상 : %s / 사용가능연령 : %d / 제조년월일 : %s / 재료 : %s",
				toyname, price, color, toyage, madeDay, materials);
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, madeDay, materials, price, toyage, toyname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return Objects.equals(color, other.color) && Objects.equals(madeDay, other.madeDay)
				&& Objects.equals(materials, other.materials) && price == other.price && toyage == other.toyage
				&& Objects.equals(toyname, other.toyname);
	}
	
	
	
	
}
