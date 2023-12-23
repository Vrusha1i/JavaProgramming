package calculate_temperature.com;

import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter temperature in celcious");
		
		double t=sc.nextDouble();
		
		double f;
		
		f=(9*t/5)+32;
		
		System.out.println("Temperature in farenheit "+f);

	}

}
