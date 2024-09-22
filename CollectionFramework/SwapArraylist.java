package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapArraylist {

	public static void main(String[] args) {

		List<String> obj=new ArrayList<>();
		obj.add("java");
		obj.add("css");
		obj.add("myaql");
		obj.add("js");
		obj.add("spring");
		System.out.println(obj);
		
		//swaping
		Collections.swap(obj, 2, 0);
		System.out.println(obj);
	}

}
