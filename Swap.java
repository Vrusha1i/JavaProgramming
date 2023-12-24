package swap_numbers.com;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two elements");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		

	}

}
