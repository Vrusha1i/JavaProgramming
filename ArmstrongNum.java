package armstrongNumber.com;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {

	Scanner sc=new  Scanner(System.in);
	System.out.println("enter any number");
	int a=sc.nextInt();
	int r;
	int sum=0;
	int a1=a;
	
	while(a>0) {
		r=a%10;
		sum=sum+(r*r*r);
		a=a/10;
		
	}
	if(sum==a1) {
		System.out.println("Given number is armstrong number");
	}

	else
	{
		System.out.println("Given number is not a armstrong number");
	}
	
	}

}
