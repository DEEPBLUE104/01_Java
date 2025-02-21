package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {

	Snack sk = new Snack();

	public SnackController() {}
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		sk.setKind(kind); 
		sk.setName(name);
		sk.setFlavor(flavor);
		sk.setNumOf(numOf);
		sk.setPrice(price);
		
		return "저장 완료 되었습니다.";
	}
	public String confirmData() {
		return "";
	}
}
