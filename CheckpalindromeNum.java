package palindromeNumber.com;

import java.util.Scanner;

public class CheckpalindromeNum {

	public static void main(String[] args) {

		
     Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n=sc.nextInt();
		int r;
		int rev=0;
		int n1=n;
		while(n>0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
	   }
		if(rev==n1) {
			System.out.println("given number is palindrome number");
		}
		else {
			System.out.println("given number is not palindrome number");
		}
		
	}

}
