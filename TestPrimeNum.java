package primeNumber.com;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
 Scanner sc= new Scanner(System.in);
	
 System.out.println("Enter any number");
		int n=sc.nextInt();
		int x=2;
		while(x<n) {
			if(n%x==0) {
				break;
			}
			x++;
		}
		if(x==n) {
			System.out.println("Given number is prime number");
		}
		else {
			System.out.println("given number is not prime number");
		}
	}
	
	

}
