package com;

import java.util.ArrayList;
import java.util.Scanner;

public class Evenoddarraylist {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter first no");
		int firstno=sc.nextInt();
		
		System.out.println("enter second no");
		int secno=sc.nextInt();
		
		ArrayList<Integer> even=new ArrayList<>();
		for(int i=firstno;i<=secno;i++) {
			if(i%2==0) {
				System.out.println(even);
			}
		}
		ArrayList<Integer> odd=new ArrayList<>();
		for(int i=firstno;i<=secno;i++) {
			if(i%2!=0) {
				System.out.println(odd);
			}
		
	}
		ArrayList<Integer> Even=new ArrayList<>();
		ArrayList<Integer> Odd=new ArrayList<>();
		
		for(int i=firstno;i<=secno;i++) {
			if(i%2==0) {
				even.add(i);
			}else {
				odd.add(i);
			}
		}
		
		

		System.out.println(even);
		System.out.println(odd);
}}
