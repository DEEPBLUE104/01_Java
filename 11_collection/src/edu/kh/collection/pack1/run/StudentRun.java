package edu.kh.collection.pack1.run;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import edu.kh.collection.pack1.model.service.StudentService;

public class StudentRun {
	public static void main(String[] args) {
	
		StudentService service = new StudentService();
		// service.ex();
		
		List<Integer> numberList = new ArrayList<Integer>();
		
		numberList.add(7); //0
		numberList.add(3); //1
		numberList.add(1); //2
		numberList.add(6); //3
		numberList.add(8); //4
		
		// 숫자 리스트를 정렬 
		//Integer는 이미 Comparable을 상속받아 compareTo() 정의
		//Collections.sort(numberList);
	
		//		System.out.println(numberList);
	
	}
	
}
