package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(78);
		obj.add(55);
		obj.add(780);
		obj.add(44);
		obj.add(65);
		
		for(Integer d:obj) {
			System.out.println(d);
		}
		Collections.sort(obj);
		System.out.println(obj);
		
		Collections.sort(obj,Collections.reverseOrder());
		for(Integer it:obj) {
			System.out.println(it);
		}
	}

}
