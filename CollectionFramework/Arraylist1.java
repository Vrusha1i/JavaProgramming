package com;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {

		
		//non generic arraylist
		ArrayList obj=new ArrayList();
		obj.add(23);
		obj.add(0, "vp");
		obj.add('d');
		obj.add(55);
		System.out.println(obj);
		obj.set(2, 99);
		System.out.println(obj);
		
		System.out.println(obj.get(2));
		System.out.println(obj.size());
		System.out.println(obj.contains(23));
		System.out.println(obj.isEmpty());
		System.out.println(obj.remove(1));
		
		
		//generic arraylist
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(22);
		al.add(55);
		System.out.println(al);
	}

}
