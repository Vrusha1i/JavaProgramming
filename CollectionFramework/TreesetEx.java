package com;

import java.util.TreeSet;

public class TreesetEx {

	public static void main(String[] args) {

		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(88);
		ts.add(43);
		ts.add(90);
		ts.add(11);
		ts.add(65);
		ts.add(88);
		
		for(Integer i:ts) {
			System.out.println(i);
		}
		
	}

}
