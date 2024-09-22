package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> obj=new ArrayList<String>();
		obj.add("hello");
		obj.add("this");
		obj.add("is");
		obj.add("java");
		obj.add("tutorials");
		
		Iterator itr=obj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		ListIterator itrl=obj.listIterator();
		while(itrl.hasNext()) {
			System.out.println(itrl.next());
		}
		while(itrl.hasPrevious()) {
			System.out.println(itrl.previous()); 
		}
	}

}
