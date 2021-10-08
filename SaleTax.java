package project1;

import java.util.Scanner;

public class SaleTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter purchase amoout: ");
		double purchaseAmout=input.nextDouble();
		
		double tax=purchaseAmout*0.06;
		
		System.out.println("Sales Tax is $"+(int)(tax*100)/100.0);
	}

}
