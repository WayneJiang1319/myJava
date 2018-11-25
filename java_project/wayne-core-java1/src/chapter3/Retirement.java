package chapter3;

import java.util.Scanner;

public class Retirement {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("How much money do you need to retire?");
		double goal=in.nextDouble();
		System.out.println("How much money do you earn ervery yera ?");
		double pay = in.nextDouble();
		System.out.println("What is the interest?");
		double interest1 = in.nextDouble();
		
		double balance = 0;
		int years=0;
		while (balance<goal) {
			balance +=pay;
			double interest = balance*interest1/100;
			balance+=interest1;
			years++;
			
		}
		System.out.println("you can retire in "+years+"years");

	}

}
