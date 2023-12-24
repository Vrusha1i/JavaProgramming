package stringCount.com;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		
		String a=sc.next();
		int count=0;
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println("Total number of character in string :"+count);
	}

}
