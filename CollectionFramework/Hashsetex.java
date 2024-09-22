package com;

import java.util.HashSet;

public class Hashsetex {

	public static void main(String[] args) {
		HashSet<Double> obj=new HashSet<>();
		obj.add(54.76);
		obj.add(65.4);
		obj.add(9.7);
		obj.add(22.8);
		obj.add(null);
		obj.add(6.76);
		obj.add(9.7);
		obj.add(null);
		for(Double d:obj) {
			System.out.println(d);
		}
		
		
	}
}
