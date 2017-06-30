package calculator;

import java.util.Scanner;

public class CalcOutputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void calculations() {
		Scanner equation = new Scanner(System.in);
		
		System.out.println("Choose 1 for adding, choose 2 for subtracting, choose 3 for multiplying, or choose 4 for dividing:");
		
		int x = equation.nextInt();
		
		System.out.println("Enter another number");
		
		if (x == 1){
			System.out.println("Enter a number:");
			int a1 = equation.nextInt();
			
			System.out.println("Enter another number:");
			int a2 = equation.nextInt();
			
			System.out.println("Result:");
			System.out.println(a1 + a2);
		}
		
		else if (x == 2){
			System.out.println("Enter a number:");
			int s1 = equation.nextInt();
			
			System.out.println("Enter another number:");
			int s2 = equation.nextInt();
			
			System.out.println("Result:");
			System.out.println(s1 - s2);
			
		}
		
		else if (x == 3){
			System.out.println("Enter a number:");
			int m1 = equation.nextInt();
			
			System.out.println("Enter another number:");
			int m2 = equation.nextInt();
			
			System.out.println("Result:");
			System.out.println(m1 * m2);
		}
		
		
		else if (x == 4){
			System.out.println("Enter a number:");
			int d1 = equation.nextInt();
			
			System.out.println("Enter another number:");
			int d2 = equation.nextInt();
			
			System.out.println("Result:");
			System.out.println(d1 / d2);
		}
		
		else {
			
			System.out.println("Please, enter a number between 1 and 4:");
			
		}
		
		
	}

}
