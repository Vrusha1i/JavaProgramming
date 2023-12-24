package fabonacciSeries.com;

import java.util.Scanner;

public class FabonacciSeries {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any number");
		int f1=0;
		int f2=1;
		int f3;
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			
			f3=f1+f2;
			System.out.println(f3);
			
			f1=f2;
			f2=f3;
		}
	}

}
