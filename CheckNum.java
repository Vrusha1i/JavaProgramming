package num_is_positiveOrNegative.com;

import java.util.Scanner;

public class CheckNum {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int a=sc.nextInt();
		if(a>0) {
			System.out.println(a+" is positive number");
		}
		else
		{
			System.out.println(a+" number is negative");
		}
	}

}
