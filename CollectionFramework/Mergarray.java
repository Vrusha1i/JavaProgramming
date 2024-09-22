package com;

import java.util.ArrayList;

public class Mergarray {

	public static void main(String[] args) {

		ArrayList<String> obj=new ArrayList<>();
		obj.add("java");
		obj.add("php");
		obj.add("python");
		
		ArrayList<String> obj1=new ArrayList<>();
		obj.add("css");
		obj.add("js");
		obj.add("html");
		
		//merging
		obj1.addAll(obj);
	//	System.out.println(obj1);
		
		for(String s:obj1) {
			System.out.println(s);
		}
		
		
	}

}
