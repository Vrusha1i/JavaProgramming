package com;

import java.util.List;
import java.util.Vector;

public class Vectorex {

	public static void main(String[] args) {

		Vector<Double> obj=new Vector<>();
		obj.add(99.9);
		obj.add(33.9);
		obj.add(66.23);
		obj.addElement(88.99);
	
		for(Double d:obj) {
			System.out.println(d);
		}
		
	}

}
