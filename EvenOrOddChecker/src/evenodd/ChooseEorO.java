package evenodd;

import java.util.Scanner;

public class ChooseEorO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void evenanswer() {
		Scanner evenmethod = new Scanner (System.in);
		
		System.out.println("Enter a number to see if it's even:");
		int x = evenmethod.nextInt();
		
		if (x % 2 == 0){
			System.out.println("The number you have entered is EVEN.");
		}
	}
	
	public void oddanswer() {
		Scanner oddmethod = new Scanner (System.in);
		
		System.out.println("Enter a number to see if it's odd:");
		int y = oddmethod.nextInt();
		
		System.out.println("The number you have entered is ODD.");
	}

}
