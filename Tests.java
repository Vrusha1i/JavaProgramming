package num_isEvenOrOdd.com;

import java.util.Scanner;

public class Tests {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any number");
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println(a+" is even number");
		}
		else {
			System.out.println(a+" is odd number");
		}
	}

}
