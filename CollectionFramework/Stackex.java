package com;

import java.util.Stack;

public class Stackex {
	public static void main(String[] args) {
		Stack<Integer> st=new Stack();
		st.push(90);
		st.push(80);
		st.push(70);
		st.push(60);
		st.push(50);
		for(Integer i:st) {
			System.out.println(i);
		}
//		System.out.println(st.peek());
//		System.out.println(st.pop());
//		System.out.println(st.isEmpty());
		System.out.println(st.search(3));
		
		
	}

}
