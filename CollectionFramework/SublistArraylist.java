package com;

import java.util.ArrayList;
import java.util.List;

public class SublistArraylist {

	public static void main(String[] args) {

		List<Integer> obj=new ArrayList<>();
		obj.add(55);
		obj.add(77);
		obj.add(23);
		obj.add(67);
		obj.add(85);
		
		System.out.println(obj);
		
	//	List<Integer> result=obj.subList(2, 4);
		//System.out.println(result);
		System.out.println(obj.subList(3, 5));
		
		
	}

}
