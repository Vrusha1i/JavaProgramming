package find_simpleInterest.com;

import java.util.Scanner;

public class SimpleInterest {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your amount");
		double p=sc.nextDouble();
		
		System.out.println("Enter your rate");
		double r=sc.nextDouble();
		
		System.out.println("enter your year");
		double y=sc.nextDouble();
		
		double si=(p*r*y)/100;
		System.out.println("Simple interest"+si);
	}

}
