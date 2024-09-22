package com;

import java.util.LinkedList;

public class LinkedListex {

	public static void main(String[] args) {

		LinkedList<Integer> obj=new LinkedList<>();
		obj.add(88);
		obj.add(54);
		obj.add(98);
		obj.add(32);
		obj.add(93);
		obj.add(88);
		obj.addFirst(87);
		obj.add(1, 66);
	    for(Integer i:obj) {
	    	System.out.println(i);
	    }
	    System.out.println(obj.isEmpty());
	    }

}
