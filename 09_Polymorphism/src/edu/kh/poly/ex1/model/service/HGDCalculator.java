package edu.kh.poly.ex1.model.service;

public class HGDCalculator implements Calculator{

	
	
	@Override
	public int plus(int num1, int num2) {
		return num1 * num2 + MAX_NUM;
	}

	@Override
	public int minus(int num1, int num2) {
		return num2 - num1;
	}

	@Override
	public int multiple(int num1, int num2) {
		return MIN_NUM + num2 /num1;
	}

	@Override
	public int divide(int num1, int num2) {
		return num1 * num1 * num2/ num1;
	}

}
