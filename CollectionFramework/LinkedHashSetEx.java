package com;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {

	public static void main(String[] args) {

		Set<Character> obj=new LinkedHashSet<>();
		obj.add('h');
		obj.add('e');
		obj.add('l');
		obj.add('l');
		obj.add('o');
		obj.add(null);
		for(Character c:obj) {
			System.out.println(c);
		}
		
	}

}
