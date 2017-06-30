package tipcalc2;

import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void TipCalcClass(){
		
		double billamnt;
		
		Scanner restauranttip = new Scanner(System.in);
		
		System.out.println("     Restaurant Tip Calculator");
		System.out.println("                              ");
		
		System.out.println("       Enter bill amount: $");
		billamnt = restauranttip.nextDouble();
		
		System.out.println("                              ");
		System.out.println("Rank your service from 1 through 5:");
		int service = restauranttip.nextInt();
		
		System.out.println("                              ");
		System.out.println("How many people are sharing the bill?");
		int totalpeople = restauranttip.nextInt();
		
		System.out.println("                              ");
		
		if (totalpeople == 0){
			
			totalpeople = 1;
		}
		
		
		// Conditions
		if ((service == 1) || (service == 0)){
			
			System.out.println("  Total tip: $" + (billamnt*.5)/totalpeople);
		}
		
		else if (service == 2){
			
			System.out.println("  Total tip: $" + (billamnt*.1)/totalpeople);
		}
		
		else if (service == 3) {
			
			System.out.println("  Total tip: $" + (billamnt*.15)/totalpeople);
		}
		
		else if (service == 4){
			
			System.out.println("  Total tip: $" + (billamnt*.2)/totalpeople);
		}
		
		else if (service == 5){
			
			System.out.println("  Total tip: $" + (billamnt*.3)/totalpeople);
		}
		
		else {
			System.out.println("Please, enter a number from 1 through 5");
		}
		
	}

}
