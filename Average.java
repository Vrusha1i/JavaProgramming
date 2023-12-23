package average.com;

import java.security.DomainCombiner;
import java.util.Scanner;

public class Average {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		
		int avg=(a+b+c+d)/4;
		
		System.out.println("Average of given numbers is"+avg);
	}

}
