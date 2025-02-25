package com.kh.inheritance.run;

import com.kh.inheritance.model.dto.BasicPhone;
import com.kh.inheritance.model.dto.SmartPhone;

public class Run {

	public static void main(String[] args) {

		SmartPhone sp = new SmartPhone();
		sp.setBrand("Samsung");
		sp.setModel("Galaxy S20");
		sp.setYear(2020);
		sp.setPrice(1200000);
		sp.setOperatingSystem("Android");
		sp.setStorageCapacity(128);
		
		System.out.println("Brand: " + sp.getBrand());
		System.out.println("Model: " + sp.getModel());
		System.out.println("Year: " + sp.getYear());
		System.out.println("Price: " + sp.getPrice() + "원");
		System.out.println("Operating System: " + sp.getOperatingSystem());
		System.out.println("Storage Capacity: " + sp.getStorageCapacity() + "GB");
		
		System.out.println("==========================");
		
		BasicPhone bp = new BasicPhone();
		bp.setBrand("Nokia");
		bp.setModel("3310");
		bp.setYear(2000);
		bp.setPrice(100000);
	
		System.out.println("Brand: " + bp.getBrand());
		System.out.println("Model: " + bp.getModel());
		System.out.println("Year: " + bp.getYear());
		System.out.println("Price: " + bp.getPrice() + "원");
	}

}
