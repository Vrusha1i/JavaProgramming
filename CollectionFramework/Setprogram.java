package com;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Setprogram {

	static HashSet<String> product=new HashSet<>();
	static LinkedHashSet<String> cartitem=new LinkedHashSet<>();
	

	static {
		product.add("mobile");
		product.add("Laptop");
		product.add("tab");
		product.add("Tv");
		product.add("Headphone");
		
		
	}
	static  void displayproduct() {
		for(String s:product) {
			System.out.println(s);
		}
		
	}
		
		static void addtocart(String name) {
		
				cartitem.add(name);
				System.out.println("product added successfully");
			
		
	}
		static void viewcart() {
			for(String s:cartitem) {
				System.out.println(s);
			}
		}
		
		static void removecart(String item) {
			if(cartitem.contains(item)) {
				cartitem.remove(item);
				System.out.println("product remove successfully");
			}else {
				System.out.println("add to cart first");
			}
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			boolean repeat=true;
			while(repeat) {
				System.out.println("Enter your choice");
				System.out.println("1.for display products");
				System.out.println("2.add to cart");
				System.out.println("3.view cart");
				System.out.println("4 remove cart item");
				System.out.println("5 exit");
				
				int choice=sc.nextInt();
				switch(choice) {
				
				case 1:displayproduct();
				break;
				
				case 2:
					System.out.println("enter name of product");
					String name=sc.next();
					addtocart(name);
					break;
					
				case 3:
					viewcart();
					break;
				case 4:
					System.out.println("enter product name");
					String item=sc.next();
					removecart(item);
					break;
				case 5:
					repeat=false;
					break;
					default:System.out.println("invalid input");
					
				
				}
				
			}
			
			
		}
}
